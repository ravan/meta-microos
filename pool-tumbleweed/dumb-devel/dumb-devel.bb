SUMMARY = "Development libraries and headers for libdumb"
DESCRIPTION = "The development files that must be installed in order to compile \
applications which use libdumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-2.0.3-1.19.aarch64.rpm"
RPM_HASH = "f9b3180987c621b9c29530443fed9cba4ccd9b3e83e2fc0c1e0ca05afdde79ba03f90ff13581b0b9f8a929748acf63d67f2dffceab1cd669b0874d3fc3e2811a"

RPROVIDES:${PN} += "dumb-devel \
pkgconfig-dumb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdumb2"

inherit rpm
