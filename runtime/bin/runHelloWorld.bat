title Hello World Runtime

del /Q ..\logging\hw*.*

copy /Y ..\..\target\poc.hello.world-main.jar ..\lib\app-jar

cls

java -Djava.util.logging.config.file=../config/hw.logging.properties -cp ../lib/app-jar/poc.hello.world-main.jar com.he.dcs.poc.hello.world.App
