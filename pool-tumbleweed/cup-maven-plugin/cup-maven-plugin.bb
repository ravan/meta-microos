SUMMARY = "CUP Maven plugin"
DESCRIPTION = "A plugin to generate Java parsers with CUP."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "cup-maven-plugin-1.9.1-1.5.noarch.rpm"
RPM_HASH = "17c699d37aea6f7856245584dc5ab87693bf54863f783a7ba3b9a9e4b31df33d9cf990f216b9ef22211da78a6673ea4e83410257cccf8d9f9f95599a70f28c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cup-maven-plugin \
mvn-de.jflex-cup-maven-plugin \
mvn-de.jflex-cup-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.vbmacher-java-cup \
mvn-com.github.vbmacher-java-cup-runtime \
mvn-com.google.guava-guava"

inherit rpm
