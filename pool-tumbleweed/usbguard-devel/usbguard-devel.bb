SUMMARY = "Development files for usbguard"
DESCRIPTION = "The usbguard-devel package contains libraries and header files for \
developing applications that use usbguard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "usbguard-devel-1.1.4-3.9.aarch64.rpm"
RPM_HASH = "64b192dcd8603b2c69f143ec95464c4fe4375308465077c32e8d6a4e31b5acdca6169f4f54d3a1520ed9f3638ee7a9522a5b22e0577784d8db66cc933f96c9bc"

RPROVIDES:${PN} += "pkgconfig-libusbguard \
usbguard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libusbguard1 \
pkgconfig \
pkgconfig-libqb \
usbguard"

inherit rpm
