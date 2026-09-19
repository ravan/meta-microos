SUMMARY = "Development files for bemenu"
DESCRIPTION = "Files required for development for Bemenu."
LICENSE = "MIT"

PV = "0.6.23"

RPM_NAME = "bemenu-devel-0.6.23-1.12.aarch64.rpm"
RPM_HASH = "825643d5377e1a17ced952588915bf66b75862372c45d4f7724af6de87b175a0c58959f7597f124c04e0a4deec49fbf43183507c9d3aa551e1053146f8a0181c"

RPROVIDES:${PN} += "bemenu-devel \
pkgconfig-bemenu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
gcc-c++ \
libbemenu0 \
pkgconfig"

inherit rpm
