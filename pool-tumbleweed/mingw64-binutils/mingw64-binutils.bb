SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw64-binutils-2.45.1-3.4.noarch.rpm"
RPM_HASH = "2da513579dd9c03fdaa0218bc12604d217e49d5db28ab5bebff456ba6c28074bb86d8abd419f845c819c88c25bcc9b23fac29f8df67031e5701263988df712b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils \
mingw64-libdep.dll"

RDEPENDS:${PN} += "mingw64-libwinpthread-1.dll"

inherit rpm
