SET PATH=%PATH%;%cd%\lib\;%cd%\extraJarsForJShellClasspath\*;;%cd%\jars\*

java   -cp %cd%\extraJarsForJShellClasspath\*%\jars\* -XX:+UseNUMA -XX:+UseParallelGC -XX:+UseCompressedOops    -Xss5m -Xms2000m -Xmx25000m -jar sparkLab.jar
