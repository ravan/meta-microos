SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "9e5f1982066bb8abdd1d540ab08059eb55931e09c7259b7f0c3718dc0736472c36c739ae5e4633d2485ae6e1e6a863e6f4b8ecfa56ecb0719af7aa72c3eeb463"

RPROVIDES:${PN} += "cross-ppc64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
