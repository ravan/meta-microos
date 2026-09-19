SUMMARY = "Development files for chck"
DESCRIPTION = "Development files for Wayland Compositor Library."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "chck-devel-0.0.20161208-1.36.aarch64.rpm"
RPM_HASH = "805766b591c6daea70287031f612308419f2455c0099026d650514c1ec2529b53d4d5478c08e5a60d528621e1bf048fef748643e95abf627bd814e6202847a44"

RPROVIDES:${PN} += "chck-devel \
pkgconfig-chck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libchck0"

inherit rpm
