SUMMARY = "MPC multiple-precision complex library"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. It is \
built upon and follows the same principles as MPFR."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-libmpc3-1.0.2-3.9.noarch.rpm"
RPM_HASH = "42a7f99b48aa1ab22e504c525eb78fe5fe09da2e60a8bde8a8f83b29f11c032503774d7a5f550238130ea3bbf85adfebe12f47b05207f035070e3bb930df6da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libmpc \
mingw32-libmpc-3.dll \
mingw32-libmpc3"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpfr-4.dll"

inherit rpm
