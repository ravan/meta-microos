SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with huge numbers (integer and floating point)."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-devel-6.1.1-4.1.noarch.rpm"
RPM_HASH = "90a2f69eaeba0fe3a0e254656a780c2e7fda8d910aee30eef49311f21cd08059b4066745315426cf3d1ac75b9f37ac6ef4b180cc460314a9bd91f9620e9dc10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-devel \
mingw64-lib-gmp \
mingw64-lib-gmpxx"

RDEPENDS:${PN} += "mingw64-libgmp10 \
mingw64-libgmpxx"

inherit rpm
