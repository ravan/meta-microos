SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet-devel-0.0.8-2.5.aarch64.rpm"
RPM_HASH = "b1fa9eca7f0a34aaf57abc7f20eb1b79ed4d1c9f04a944e9ab2338fe9a3a5aa52a0e18fe45698e76d35211e7dba91f2aa16fed9a8134aca7d394d1a8d1d7ea3d"

RPROVIDES:${PN} += "cmake-uchardet \
libuchardet-devel \
pkgconfig-uchardet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuchardet0"

inherit rpm
