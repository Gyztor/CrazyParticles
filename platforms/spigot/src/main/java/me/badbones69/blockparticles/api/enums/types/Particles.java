package me.badbones69.blockparticles.api.enums.types;

import java.util.ArrayList;

public enum Particles {
    
    BIGLOVEWELL("BigLoveWell", ParticleType.PARTICLE),
    LOVEWELL("LoveWell", ParticleType.PARTICLE),
    WITCHTORNADO("WitchTornado", ParticleType.PARTICLE),
    LOVETORNADO("LoveTornado", ParticleType.PARTICLE),
    HALO("Halo", ParticleType.PARTICLE),
    SANTAHAT("SantaHat", ParticleType.PARTICLE),
    SOULWELL("SoulWell", ParticleType.PARTICLE),
    BIGSOULWELL("BigSoulWell", ParticleType.PARTICLE),
    FLAMEWHEEL("FlameWheel", ParticleType.PARTICLE),
    MARIO("Mario", ParticleType.FOUNTAIN),
    POKEMON("Pokemon", ParticleType.FOUNTAIN),
    FOOD("Food", ParticleType.FOUNTAIN),
    MOBS("Mobs", ParticleType.FOUNTAIN),
    SNOWBLAST("SnowBlast", ParticleType.PARTICLE),
    RAINBOW("Rainbow", ParticleType.PARTICLE),
    ENDERSIGNAL("EnderSignal", ParticleType.PARTICLE),
    MOBSPAWNER("MobSpawner", ParticleType.PARTICLE),
    ANGRYVILLAGER("AngryVillager", ParticleType.PARTICLE),
    HAPPYVILLAGER("HappyVillager", ParticleType.PARTICLE),
    FOOTPRINT("FootPrint", ParticleType.PARTICLE),
    FIRESPEW("FireSpew", ParticleType.PARTICLE),
    SPEW("Spew", ParticleType.PARTICLE),
    STORM("Storm", ParticleType.PARTICLE),
    SNOWSTORM("SnowStorm", ParticleType.PARTICLE),
    FIRESTORM("FireStorm", ParticleType.PARTICLE),
    WITCH("Witch", ParticleType.PARTICLE),
    DOUBLEWITCH("DoubleWitch", ParticleType.PARTICLE),
    MAGIC("Magic", ParticleType.PARTICLE),
    PRESENTS("Presents", ParticleType.FOUNTAIN),
    MUSIC("Music", ParticleType.PARTICLE),
    POTION("Potion", ParticleType.PARTICLE),
    SNOW("Snow", ParticleType.PARTICLE),
    WATER("Water", ParticleType.PARTICLE),
    CHAINS("Chains", ParticleType.PARTICLE),
    ENCHANT("Enchant", ParticleType.PARTICLE),
    FOG("Fog", ParticleType.PARTICLE),
    HEADS("Heads", ParticleType.FOUNTAIN),
    FLAME("Flame", ParticleType.PARTICLE),
    BIGFLAME("BigFlame", ParticleType.PARTICLE),
    HALLOWEEN("Halloween", ParticleType.FOUNTAIN),
    GEMS("Gems", ParticleType.FOUNTAIN),
    VOLCANO("Volcano", ParticleType.PARTICLE),
    SPIRAL("Spiral", ParticleType.PARTICLE),
    DOUBLESPIRAL("DoubleSpiral", ParticleType.PARTICLE),
    CRIT("Crit", ParticleType.PARTICLE),
    BIGCRIT("BigCrit", ParticleType.PARTICLE);
    
    private final String name;
    private final ParticleType type;
    
    Particles(String name, ParticleType type) {
        this.name = name;
        this.type = type;
    }
    
    /**
     * @param name the Particle you wish to get.
     * @return a Particle.
     */
    public static Particles fromName(String name) {
        for (Particles i : Particles.getParticles()) {
            if (i.toString().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }
    
    /**
     * returns all the particles.
     */
    public static Particles[] getParticles() {
        return Particles.values();
    }
    
    /**
     * @param type the ParticleType you want all the Particles From.
     * @return all the particles in a ParticleType.
     */
    public static ArrayList<Particles> getParticles(ParticleType type) {
        ArrayList<Particles> i = new ArrayList<>();
        for (Particles p : Particles.values()) {
            if (p.getType().equals(type)) i.add(p);
        }
        return i;
    }
    
    /**
     * returns the particle's name in a String.
     */
    public String toString() {
        return name;
    }
    
    /**
     * returns the particle's type (Particle/Fountain).
     */
    public ParticleType getType() {
        return type;
    }
}