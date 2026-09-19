SUMMARY = "Advanced DRI Configurator"
DESCRIPTION = "adriconf (Advanced DRI CONFigurator) is a GUI tool used to configure open \
source graphics drivers. It works by setting options and writing them to \
the standard drirc file used by the Mesa drivers."
LICENSE = "GPL-3.0-only"

PV = "2.7.4"

RPM_NAME = "adriconf-2.7.4-1.2.aarch64.rpm"
RPM_HASH = "06c3696d76e30f5624e570e828dbfeacfac574f3429019c96e2ba688e9e657b52feb728da7478399b45c82c41ae6ce09f27c47f74f094490643de282fd17aa4d"

RPROVIDES:${PN} += "adriconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgtkmm-4.0.so.0 \
libpci.so.3 \
libpugixml.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
