SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers.  C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-libgmpxx4-6.1.1-4.1.noarch.rpm"
RPM_HASH = "10bbc8fa25779cfd4ff9b77e489d08d172ab5ba69bd9a12649266a2e5836ca198283d8fec7658bad99cd5d5e777bf6eb5e340beb0332f2c7647ed8fd1c6a5c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgmpxx \
mingw32-libgmpxx-4.dll \
mingw32-libgmpxx4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgmp-10.dll \
mingw32-libstdc++-6.dll"

inherit rpm
