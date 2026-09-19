SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-3.3.0-5.12.noarch.rpm"
RPM_HASH = "c68c9605349348ac6dbad12673a6cb9b1bd75e4c6ae59283e264f9038f3a03833b36acd94404556f0257ab4d12d05bdbc38e5d7fc175bfe522d2de1ab635f5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglib \
cglib-nohook \
mvn-cglib-cglib \
mvn-cglib-cglib-full \
mvn-cglib-cglib-full-pom- \
mvn-cglib-cglib-nodep \
mvn-cglib-cglib-nodep-pom- \
mvn-cglib-cglib-pom- \
mvn-cglib-cglib-sample \
mvn-cglib-cglib-sample-pom- \
mvn-net.sf.cglib-cglib \
mvn-net.sf.cglib-cglib-pom- \
mvn-org.sonatype.sisu.inject-cglib \
mvn-org.sonatype.sisu.inject-cglib-pom- \
osgi-net.sf.cglib.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
