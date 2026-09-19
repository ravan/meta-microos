SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmp10-6.1.1-4.1.noarch.rpm"
RPM_HASH = "b016d49636c4e74822cec41cbb3be772d18794b35b5fb0a55ce81d63c0c76b6d844a20b7cf073847cd2972d340f21a178c0f15502701c51471eee12f7d926331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgmp \
mingw64-libgmp-10.dll \
mingw64-libgmp10"

RDEPENDS:${PN} += ""

inherit rpm
