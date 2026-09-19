SUMMARY = "PostScript and PDF converter (development files)"
DESCRIPTION = "PostScript and PDF converter development headers and library files."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "pstoedit-devel-4.3-1.1.aarch64.rpm"
RPM_HASH = "284f40ebf8f0f7be48d806ea8632179609af3ea432708a41f2f37ac57acf9790d5a27b4862fe212e88df23fbb79fd297f04b69ab4cf4aa4043f7835348a65caf"

RPROVIDES:${PN} += "pkgconfig-pstoedit \
pstoedit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Magick++ \
pkgconfig-libzip \
plotutils-devel \
pstoedit"

inherit rpm
