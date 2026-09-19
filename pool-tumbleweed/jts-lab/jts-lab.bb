SUMMARY = "JTS Lab"
DESCRIPTION = "Algorithms for JTS which are exploratory or in-progress"
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-lab-1.20.0-1.6.noarch.rpm"
RPM_HASH = "11ac50cb2d9f6a0fe1eea8e4a7e9e1a46ae43d8c794c2ba8928b72d3a4caef0b612e85344f41cc41a0f4e990c656a0134e4b10b0feb1141363e09b95e3901e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-lab \
mvn-org.locationtech.jts-jts-lab \
mvn-org.locationtech.jts-jts-lab-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jdom-jdom2 \
mvn-org.locationtech.jts-jts-core"

inherit rpm
