SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libada16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "c284ab56b1edb307335a89639f4ba6a2711dbe8c7d718831da5dacfc95afc21e173576a0010b0a3855cf6163261a05ccb09fcc91cb4ff8a661894a2459411407"

RPROVIDES:${PN} += "libada16 \
libgnarl-16 \
libgnarl-16.so \
libgnat-16 \
libgnat-16.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
