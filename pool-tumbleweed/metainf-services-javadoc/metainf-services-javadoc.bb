SUMMARY = "Javadoc for metainf-services"
DESCRIPTION = "This package contains the API documentation for metainf-services."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-javadoc-1.9-1.21.noarch.rpm"
RPM_HASH = "96dc02a1a53c28995e8009905c25a0093b32bdafab67b46506b1bc1ab230bf2b3d548c1faf62adbed4c5a8dc32465ae76d6633f59072caa88a9eb81c57ae90e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
