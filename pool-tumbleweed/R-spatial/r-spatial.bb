SUMMARY = "Package provides recommended R-spatial"
DESCRIPTION = "This packages provides R-spatial, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.18"

RPM_NAME = "R-spatial-7.3.18-58.3.aarch64.rpm"
RPM_HASH = "58d25dc4b41da3a3c581740dd0e6e676ae054a987e9dc012425a6c53f627cc3fd9d68f05923903a7b75db491387b4aa8b0e506f73e67f329abbadb4de60dec98"

RPROVIDES:${PN} += "R-spatial"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
