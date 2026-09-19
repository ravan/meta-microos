SUMMARY = "Apache Commons Codec Package"
DESCRIPTION = "Commons Codec is an attempt to provide definitive implementations of \
commonly used encoders and decoders."
LICENSE = "Apache-2.0"

PV = "1.22.0"

RPM_NAME = "apache-commons-codec-1.22.0-1.3.noarch.rpm"
RPM_HASH = "56c49e9a995273e3eeb432207cd44bd7f55ec7dbf57f6a885b0c08e04d1139ae500a522104832c2f54f142605611920787fb8e43a9e8822fdd598ae4c8746dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec \
commons-codec \
jakarta-commons-codec \
mvn-commons-codec-commons-codec \
mvn-commons-codec-commons-codec-pom- \
osgi-org.apache.commons.commons-codec"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
