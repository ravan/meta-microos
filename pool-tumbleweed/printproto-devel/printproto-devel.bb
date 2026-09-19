SUMMARY = "The X11 Protocol: Xprint extension"
DESCRIPTION = "The Print protocol headers for X11 development. \
Xprint is a portable, network-transparent printing system. \
It is no longer maintained and solely provided for ABI compatibility."
LICENSE = "X11"

PV = "1.0.5"

RPM_NAME = "printproto-devel-1.0.5-4.27.aarch64.rpm"
RPM_HASH = "c79e9b2c88712c91fbb152c55b8a2b8b03fb7cd5724c977226dd861f79d043a7724d0466c7ad730eb32f27b65fbb82d148c133499d47165f692f12f7b2427e70"

RPROVIDES:${PN} += "pkgconfig-printproto \
printproto-devel \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/printproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-xau"

inherit rpm
