SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-libmpc3-1.0.2-3.9.noarch.rpm"
RPM_HASH = "8aec12107c58d6ccda0982893492539487abdf018587ec465befc0f9785ad086f478cc63d025b4ae8e8e16e2f8715c64d13bb3e92b282956b40fafdcd17a9c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libmpc \
mingw64-libmpc-3.dll \
mingw64-libmpc3"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpfr-4.dll"

inherit rpm
