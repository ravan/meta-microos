SUMMARY = "JTB: Java Tree Builder"
DESCRIPTION = "JTB is a syntax tree builder to be used with the JavaCC \
(Java Compiler Compiler) parser generator."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "jtb-1.5.1-1.11.noarch.rpm"
RPM_HASH = "500d2e4bfc1d6bc74114a457e24058fec617fafc47470ec08fd9aab04243530951a7e0d395dea271077fe71b77413ecd85791e03d6be95e9268140836e6a4eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtb \
mvn-edu.purdue.cs-jtb \
mvn-edu.purdue.cs-jtb-pom- \
mvn-edu.ucla.cs.compilers-jtb \
mvn-edu.ucla.cs.compilers-jtb-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.java.dev.javacc-javacc"

inherit rpm
