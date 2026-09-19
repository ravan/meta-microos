SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libada13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "fe96363b3010543fd4fb4bed808a3b0d05e0b3f8e0e7c501083cdcf17e32ae527c05974589987ffed4e81cc3b1f06fd990e445de1a38f0c917ee3d279f3fd3d0"

RPROVIDES:${PN} += "libada13 \
libgnarl-13 \
libgnarl-13.so \
libgnat-13 \
libgnat-13.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
