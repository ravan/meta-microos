SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-devel-6.1.1-4.1.noarch.rpm"
RPM_HASH = "e716361a45fd879de662344e308cb70c0523ff1968ab1449a2dbc001803069d47bde37e1422b19bfd9f83c888188f3e32b535dd899d2b0f624d2a68a4b624444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gmp-devel \
mingw32-lib-gmp \
mingw32-lib-gmpxx"

RDEPENDS:${PN} += "mingw32-libgmp10 \
mingw32-libgmpxx4"

inherit rpm
