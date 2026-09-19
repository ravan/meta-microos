SUMMARY = "Java.net parent POM file"
DESCRIPTION = "Java.net parent POM file used by most Java.net subprojects such as \
Glassfish"
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "jvnet-parent-4-1.19.noarch.rpm"
RPM_HASH = "54f1429722227a74bca7859fe52e870e46d1b58a88bd078ec4d47058312b0147a5266c6e5fdaad31127029e7a45101333568c620f49b1b589c887fa5fb018bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jvnet-parent \
mvn-net.java-jvnet-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
