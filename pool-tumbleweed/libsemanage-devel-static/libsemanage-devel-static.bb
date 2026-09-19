SUMMARY = "Static archives for SELinux's policy management library"
DESCRIPTION = "The libsemanage-devel-static package contains the static libraries \
needed for developing applications that manipulate binary policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsemanage-devel-static-3.11-1.2.aarch64.rpm"
RPM_HASH = "3e067f2481864e6c9ab55c0499b75080c21ebf6a61b0fa43eb080aecf7d555c58dec52f6c14c516e1b9ae9c21828163231ad667aaba61e736da1b797b449c675"

RPROVIDES:${PN} += "libsemanage-devel-static"

RDEPENDS:${PN} += "libsemanage-devel"

inherit rpm
