SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmp10-6.1.1-4.1.noarch.rpm"
RPM_HASH = "e44ac0cab399b7fe6035163f6d1581f2e0244db14849d7eef2caea5a73a7e0fba1c461acb933c61d3aefb7a71e12824b6ef32f244c92eb28a7ba4188eab0e3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgmp \
mingw32-libgmp-10.dll \
mingw32-libgmp10"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll"

inherit rpm
