SUMMARY = "API documentation for maven-mapping"
DESCRIPTION = "This package provides API documentation for maven-mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-javadoc-3.0.0-3.21.noarch.rpm"
RPM_HASH = "b7a8181f72faeb19a20981aa96489e6aa5d32e32387c2b012c6526427970a4142d32f655c7e2666a326133f891f90ac3a2d2848b8aafe8fb760cbba79a3c720a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
