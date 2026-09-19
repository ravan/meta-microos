SUMMARY = "JFlex Maven Plugin"
DESCRIPTION = "This is a Maven 3 plugin to generate Lexer code in Java from \
a Lexer specification, using JFlex."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "jflex-maven-plugin-1.9.1-1.5.noarch.rpm"
RPM_HASH = "2686c78e6a08a2446b9801a70f731862c7511087f58bef99cb14a13bedc712b02f700ed124f094dade55c9614a8a20852ba0f7d0dc77aee343a176c8bb1d3deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-maven-plugin \
mvn-de.jflex-jflex-maven-plugin \
mvn-de.jflex-jflex-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava \
mvn-de.jflex-jflex"

inherit rpm
