SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libada7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "9536ed2285865b4bee86715e495afea4031d046e2110a3ba71ecbbd2ab262621cf5a1ce2069f399b0288365d6b1f8346732b3ece4e8e06ef81a9ab92bc9868b8"

RPROVIDES:${PN} += "libada7 \
libgnarl-7 \
libgnarl-7.so \
libgnat-7 \
libgnat-7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
