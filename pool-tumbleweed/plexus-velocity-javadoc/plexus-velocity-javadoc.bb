SUMMARY = "API documentation for plexus-velocity"
DESCRIPTION = "This package provides API documentation for plexus-velocity."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "plexus-velocity-javadoc-2.3.0-1.4.noarch.rpm"
RPM_HASH = "719d5a8153f45f821541304fe1af866a82e27d6314ceaf75ed583e9591230338b217a63166ed0719b304c1fa91e714a9786041cb3ce125f649d3bc4a8c88fac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-velocity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
