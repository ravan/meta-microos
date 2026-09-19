SUMMARY = "FOGRA Printing Characterisation Data"
DESCRIPTION = "Printing characterisation data according to ISO 12647-2. \
These are CMYK characterisation data for coated, \
webcoated, uncoated, uncoatedyellowish and SC paper."
LICENSE = "Zlib"

PV = "1.0"

RPM_NAME = "icc-targets-fogra-1.0-16.29.noarch.rpm"
RPM_HASH = "63db3e03035e784074f6025f43cca7009808504d754f0f7ba115d040023fd9883f9898ee1d889449ed466289fb8f70eada790e0e3a59f53a1a00709d3f2f5b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-targets-fogra"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
