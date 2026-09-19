SUMMARY = "Java Web Start implementation"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project."
LICENSE = "GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-1.8.8-12.2.noarch.rpm"
RPM_HASH = "af5cb6b2286d01ad0753a568b253a4d2d519569a6e003ae7985cdeaf45cf006696fc521c4e8ff8092b14108add3a4fc8554075680a838a5a6872e815151a37d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icedtea-web \
icedtea-web \
java-1-6-0-openjdk-plugin \
java-1-7-0-openjdk-plugin \
java-1-8-0-openjdk-plugin \
java-1-9-0-openjdk-plugin \
java-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
apache-commons-compress \
java \
rhino \
tagsoup"

inherit rpm
