SUMMARY = "Development package for Palapeli"
DESCRIPTION = "This package contains the development files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "palapeli-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5fe8e1614f3598940b3a5244c72f01e126a8c1a2f68ef1f23c7471f1c7ea4a88ef46a80aafce9f95832af3a50b06526cb15c0105fc7b63e9e01bfbdaf82fb9a1"

RPROVIDES:${PN} += "cmake-Pala \
palapeli-devel"

RDEPENDS:${PN} += "palapeli"

inherit rpm
