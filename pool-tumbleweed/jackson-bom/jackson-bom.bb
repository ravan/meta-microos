SUMMARY = "Bill of materials POM for Jackson projects"
DESCRIPTION = "A 'bill of materials' POM for Jackson dependencies."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-bom-2.18.9-1.1.noarch.rpm"
RPM_HASH = "82744778943232967cfa53c45d829561b152a292703d3faba41c479d3efefce1f3071409b9deeb60a37e8f74bdd8de82ee705033b9a27f416546e7013d6a32db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-bom \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson-jackson-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

inherit rpm
