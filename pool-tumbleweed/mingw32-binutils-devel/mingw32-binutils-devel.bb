SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw32-binutils-devel-2.45.1-3.4.noarch.rpm"
RPM_HASH = "33f70804b613bf2eee2b33dcf7b20d340a3ce3d6d2a04987134a701c578607fba467e663ab7a000569f7df00df8028ebbc3c81b4298ed337ba02ebd68319182e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils-devel \
mingw32-lib-bfd \
mingw32-lib-ctf \
mingw32-lib-ctf-nobfd \
mingw32-lib-iberty \
mingw32-lib-opcodes \
mingw32-lib-sframe"

RDEPENDS:${PN} += ""

inherit rpm
