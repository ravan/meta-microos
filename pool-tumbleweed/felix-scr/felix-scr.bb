SUMMARY = "Apache Felix Service Component Runtime (SCR)"
DESCRIPTION = "Implementation of the OSGi Declarative Services Specification Version 1.3 (R6)."
LICENSE = "Apache-2.0"

PV = "2.1.30"

RPM_NAME = "felix-scr-2.1.30-2.7.noarch.rpm"
RPM_HASH = "84181e805b2afcab2ba41bbc3a9c1a5569859bb53f4806c9b32029a108dc55fc9a342d5e4f55d1d65657f50bd11b9e1087a2d5111f66c80a24d567f5fb6c8b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr \
mvn-org.apache.felix-org.apache.felix.scr \
mvn-org.apache.felix-org.apache.felix.scr-pom- \
osgi-org.apache.felix.scr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
