SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python314-dash-renderer-1.9.1-2.5.noarch.rpm"
RPM_HASH = "1a6da98e849af3a16a5edf260639fbb2a78ff15c4207cd7a7e2f792dc03fcb0906e7654784addf26ea419c0062ad5869c937f881c68b0c51d83b1c5d6cdef47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dash-renderer \
python314-dash-renderer \
python3dist-dash-renderer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
