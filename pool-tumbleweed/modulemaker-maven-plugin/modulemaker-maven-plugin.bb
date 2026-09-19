SUMMARY = "A Maven plugin for creating a module-info.class"
DESCRIPTION = "This plugin allows the creation of a module-info.class for projects on Java 6 \
to Java 8 where a module-info.java file cannot be compiled."
LICENSE = "Apache-2.0"

PV = "1.11"

RPM_NAME = "modulemaker-maven-plugin-1.11-1.11.noarch.rpm"
RPM_HASH = "4700cb3f87a15f440469f479123d200e0aebeca0927d6ac65e1fb1baeef2c2932afea956b6352d046e94717f27448c2dca5016ee3b84f8e1a223bcce9566c149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modulemaker-maven-plugin \
mvn-codes.rafael.modulemaker-modulemaker-maven-plugin \
mvn-codes.rafael.modulemaker-modulemaker-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.ow2.asm-asm"

inherit rpm
