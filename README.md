[![](https://jitpack.io/v/OmarBoshra/objectdynamics.svg)](https://jitpack.io/#OmarBoshra/objectdynamics)



# objectdynamics
simple library for scaling objects inside relative layout

## Prerequisites
Add this in your root build.gradle file (not your module build.gradle file):

```
allprojects {
    	repositories {
    		...
    		maven { url "https://jitpack.io" }
    	}
    }
```

    
## Dependency
Add this to your module's build.gradle file (make sure the version matches the JitPack badge above):

```
dependencies {
	...
	        implementation 'com.github.OmarBoshra:objectdynamics:v1.0'

}
```

## Usage

for every object yo  want to scale declare the class and then use method `touchgrappingMechanism`

```
objectscale object=new objectscale();

     object.touchgrappingMechanism(motionEvent,view,rootlayout,MainActivity.this);
```


