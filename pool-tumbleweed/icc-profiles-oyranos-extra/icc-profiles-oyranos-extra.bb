SUMMARY = "Gray and ITUlab profiles"
DESCRIPTION = "A gray and ITUlab fax ICC profile."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-oyranos-extra-1.2-16.29.noarch.rpm"
RPM_HASH = "0f51b74c630586a3178945da6e047d07aa4c0cf3e79ee666245ed7ffd97c0f424ef5056d40c54b40710041e21156ba6bcdfe30addc3e0d5ab483c15b0848a9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-oyranos-extra"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
