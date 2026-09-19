SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmpxx4-6.1.1-4.1.noarch.rpm"
RPM_HASH = "d99512624c478184790e757cd0c9cfd16490fdb3d1c8f2364c107186ec362a8de8d8476eabeaa8414a083c75735e3c34ac6d09aa9cfb2bd00d799081c0e8093e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgmpxx \
mingw64-libgmpxx-4.dll \
mingw64-libgmpxx4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libgmp-10.dll \
mingw64-libstdc++-6.dll"

inherit rpm
