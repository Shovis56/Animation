package Animation;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Animation {


    private List<ArrayList<Boolean>> particlePosition = new ArrayList<>();
    private List<Particle> particles = new ArrayList<>();
    private int size;
    private int moveSets = 0;

    private static Logger log = Logger.getLogger("");

    private Animation(int space) {
        size = space;
    }

    private void setParticle(int space) {
        size = space;
    }

    private String[] animate(int speed, String init) {
        startParticles(speed, init);
        log.info(toString());
        while (!isEmpty()) {
            moveParticles();
            log.info(toString());
        }
        return getDisplay(particlePosition);
    }

    private void startParticles(int speed, String init) {
        char[] initChars = init.toCharArray();
        particlePosition.clear();
        moveSets = 0;
        setParticle(initChars.length);
        particlePosition.add(new ArrayList<>(size));
        for (int i = 0; i < size; i++) {
            if (initChars[i] == 'L' | initChars[i] == 'R') {
                Particle p = new Particle(initChars[i], i, speed);
                particles.add(p);
                particlePosition.get(moveSets).add(true);
            } else {
                particlePosition.get(moveSets).add(false);
            }
        }
        moveSets++;
    }

    private void moveParticles(){
        particlePosition.add(new ArrayList<>(size));

        for(int i = 0; i < size; i++){
            particlePosition.get(moveSets).add(false);
        }
        ListIterator<Particle> iterator = this.particles.listIterator();
        while(iterator.hasNext()){
            Particle particle = iterator.next();
            particle.move();
            if(particle.done){
                iterator.remove();
            }else{
                if(!particlePosition.get(moveSets).get(particle.location).equals(true))
                    particlePosition.get(moveSets).set(particle.location, true);
            }
        }
        moveSets++;
    }

    private boolean isEmpty(){
        return particles.isEmpty();
    }

    class Particle{
        char direction;
        int location;
        int speed;
        boolean done = false;

        private Particle(char dir,int loc, int sp){
            direction = dir;
            location = loc;
            speed = sp;
        }

        void move(){
            if(direction == 'L')
                location = location - speed;
            else if(direction == 'R'){
                location = location + speed;
            }
            if(location < 0){
                done = true;
            }
            if(location >= Animation.this.size){
                done = true;
            }
        }

        public String toString(){
            return "Particle: " + " location=" + location + " direction=" + direction + " speed=" + speed + " done=" + done;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("chamber size=").append(size);
        for(Particle p: particles){
            sb.append(" [ ").append(p.toString()).append(" ]");
        }
        return sb.toString();
    }

    private static String[] getDisplay(List<ArrayList<Boolean>> particlePos){

        String[] particleArray = new String[particlePos.size()];
        int rowCounter = 0;
        for(List<Boolean> row: particlePos){
            StringBuffer sb = new StringBuffer();
            for(Boolean b: row){
                if(b){
                    sb.append("X");
                }else{
                    sb.append(".");
                }
            }
            particleArray[rowCounter] = sb.toString();
            rowCounter++;
        }
        return particleArray;
    }

    private static void printDisplay(String[] array){
        for(String s: array){
            System.out.println(s);
        }
        System.out.println(" ");
    }

    public static void main(String[] args){
        log.setLevel(Level.OFF);

        System.out.println("0) 2, ..R...");
        System.out.println("Returns:");
        log.info("0-..R....");
        String init = "..R....";
        int speed = 2;

        Animation animateParticles = new Animation(init.length());
        String[] design = animateParticles.animate(speed, init);
        printDisplay(design);

        System.out.println("1) 3, RR..LRL");
        System.out.println("Returns:");
        log.info("1-RR..LRL");
        init = "RR..LRL";
        speed = 3;
        design = animateParticles.animate(speed,init);
        printDisplay(design);

        System.out.println("2) 2, LRLR.LRLR");
        System.out.println("Returns:");
        log.info("2-LRLR.LRLR");
        init="LRLR.LRLR";
        speed = 2;
        design = animateParticles.animate(speed, init);
        printDisplay(design);

        System.out.println("3) 10, RLRLRLRLRL");
        System.out.println("Returns:");
        log.info("3-RLRLRLRLRL");
        speed = 10;
        init = "RLRLRLRLRL";
        design = animateParticles.animate(speed, init);
        printDisplay(design);

        System.out.println("4) 1, ...");
        System.out.println("Returns:");
        log.info("4-...");
        init = "...";
        speed = 1;
        design = animateParticles.animate(speed, init);
        printDisplay(design);

        System.out.println("5) 1, LRRL.LR.LRR.R.LRRL.");
        System.out.println("Returns:");
        log.info("5-LRRL.LR.LRR.R.LRRL.");
        init = "LRRL.LR.LRR.R.LRRL.";
        speed = 1;
        design = animateParticles.animate(speed, init);
        printDisplay(design);

    }
}

