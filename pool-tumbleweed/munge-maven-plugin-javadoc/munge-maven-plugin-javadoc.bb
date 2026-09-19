SUMMARY = "API documentation for munge-maven-plugin"
DESCRIPTION = "This package provides API documentation for munge-maven-plugin."
LICENSE = "CDDL-1.0"

PV = "1.0"

RPM_NAME = "munge-maven-plugin-javadoc-1.0-3.7.noarch.rpm"
RPM_HASH = "d72dbfeef739864b053fbe73ce940046def308b82e5252c01ebbed2b32e5f556aa4c848bd85a01a8f03c1f06226a80adc5d669920c232274bea47c42c302dead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "munge-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
