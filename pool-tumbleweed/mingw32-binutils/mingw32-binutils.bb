SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw32-binutils-2.45.1-3.4.noarch.rpm"
RPM_HASH = "5e7854d7eb0ba6544dcad923ac2243d192b67de3d755a0cbf60282263082ce1b6063f7169b2ea406aded83b54f728ddd3f8cde140b69ae046d25672fbfce0447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils \
mingw32-libdep.dll"

RDEPENDS:${PN} += "mingw32-libwinpthread-1.dll"

inherit rpm
