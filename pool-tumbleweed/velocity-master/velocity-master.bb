SUMMARY = "Velocity - Master POM"
DESCRIPTION = "Master POM for Velocity."
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "velocity-master-4-2.11.noarch.rpm"
RPM_HASH = "c024a219778693237e6721dc5e5ed30497efd75be5a5f6acc8018ecac9e0b9f70c187608c4c3d38e0404db652c61f58dee84b22fc0d87ad6e2cb2de1a002462e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity-velocity-master-pom- \
velocity-master"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom-"

inherit rpm
