SUMMARY = "WBXML parser and compiler library"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.10"

RPM_NAME = "libwbxml2-devel-0.11.10-1.9.aarch64.rpm"
RPM_HASH = "23cff8f7fe2d0ec7850ebe0e1591f44fb7b1baf325f83edbfa06b9a6f1fcec4e6a5976d84509ea4329c966c44e6d0271ffacb38e3ab84ae226e68779e58b0b97"

RPROVIDES:${PN} += "cmake-libwbxml2 \
libwbxml2-devel \
pkgconfig-libwbxml2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexpat-devel \
libwbxml2-1 \
pkgconfig-expat"

inherit rpm
