SUMMARY = "Applets for COSMIC DE"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applets-1.0.14-1.3.aarch64.rpm"
RPM_HASH = "fad59047806e884c80d515800f524a91c2eb88612d75f671bb0dbb5e9b76a3e006d69a2dd8ab89bba5480cacabbd003c8913b78623d0df32d1a36291d7f5029c"

RPROVIDES:${PN} += "cosmic-applets"

RDEPENDS:${PN} += "cosmic-icons \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
