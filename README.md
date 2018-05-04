Created using IntelliJ & Yeoman & gradle. It's just an aspectJ example with an hello world swing JFrame. 

# Setup intellij
- set the compiler with ajc instead of javac in intellij.
- install plugin aspectJ Weaver (see https://www.jetbrains.com/help/idea/2017.1/aspectj.html)
- Path to Ajc compiles: /home/me/.gradle/caches/modules-2/files-2.1/org.aspectj/aspectjtools/1.8.10/.../aspectjtools-1.8.10.jar
- refresh gradle
- enabled: Build > AspectJ weaving
- Enable annotation processing options: checked

# use Yeoman to create the project
http://maxschremser.github.io/swing/spring/java/2016/04/13/Welcome.html