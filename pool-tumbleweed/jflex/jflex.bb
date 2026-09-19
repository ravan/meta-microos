SUMMARY = "Lexical Analyzer Generator for Java"
DESCRIPTION = "JFlex is a lexical analyzer generator for Java written in Java. It is \
also a rewrite of the very useful tool JLex which was developed by \
Elliot Berk at Princeton University. As Vern Paxson states for his C/C++ \
tool flex: they do not share any code though. \
 \
Design goals The main design goals of JFlex are: \
 \
    * Full unicode support \
    * Fast generated scanners \
    * Fast scanner generation \
    * Convenient specification syntax \
    * Platform independence \
    * JLex compatibility"
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "jflex-1.9.1-1.5.noarch.rpm"
RPM_HASH = "c590bb4ae9b422ebc344e91b756fd0962f53e27911d1655690726589f87d05f29804f1015dbbc880fe6aaa84349783aa48ea4ff0d9715e54d2fa4bda4b1ca679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex \
mvn-de.jflex-jflex \
mvn-de.jflex-jflex-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-cup \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.github.vbmacher-java-cup-runtime \
mvn-com.google.code.findbugs-jsr305 \
mvn-org.apache.ant-ant"

inherit rpm
