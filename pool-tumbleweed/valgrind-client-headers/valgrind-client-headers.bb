SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the BSD-style licensed Valgrind header \
files for inclusion into regular programs. The program can \
detect if it is running under Valgrind and interact with the \
Valgrind core and plugins."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.27.1"

RPM_NAME = "valgrind-client-headers-3.27.1-1.2.noarch.rpm"
RPM_HASH = "ec4a67d34426b66cdee5ee938a8a65ac77fcf9c05194cc9eb440931f317b2e8fa5947b7849d978007c65da37149931d002db284b0f9c1d62f467b48e9ad3743e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "valgrind-client-headers \
valgrind-devel-/usr/include/valgrind/valgrind.h"

RDEPENDS:${PN} += ""

inherit rpm
