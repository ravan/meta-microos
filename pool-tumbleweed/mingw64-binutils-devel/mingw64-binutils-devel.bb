SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw64-binutils-devel-2.45.1-3.4.noarch.rpm"
RPM_HASH = "57eb3528911e75b960ca0d5a51de12b4118805ee3f5af0c861747d52f90af63784c6cdee6a26dac29a6c4d979b2fdd29a29580d35eea83a3dfadec489f3f0fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-devel \
mingw64-lib-bfd \
mingw64-lib-ctf \
mingw64-lib-ctf-nobfd \
mingw64-lib-iberty \
mingw64-lib-opcodes \
mingw64-lib-sframe"

RDEPENDS:${PN} += ""

inherit rpm
