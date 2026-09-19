SUMMARY = "NPES Printing Characterisation Data"
DESCRIPTION = "Printing characterisation data. These are CMYK \
characterisation data for GRACoL, SWOP and SNAP."
LICENSE = "Zlib"

PV = "1.0"

RPM_NAME = "icc-targets-npes-1.0-16.29.noarch.rpm"
RPM_HASH = "d78e90beb97ef6cb63d1ef43dad2a54eeac237ede6f0f08f87042d9aeed0423cf09c9d48ce99d0bc4cf00ee2103fa6e24e1092f4838af474708d610046bf7ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-targets-npes"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
