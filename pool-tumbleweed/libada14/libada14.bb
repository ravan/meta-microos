SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libada14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "7269b522b397caf7de9f6f5440f59a6d76e0b431f9b6381649b172e49027e3e17ce65b396e947a5ce407d92784bc6d115edf554582fe6eadf456a0322846943d"

RPROVIDES:${PN} += "libada14 \
libgnarl-14 \
libgnarl-14.so \
libgnat-14 \
libgnat-14.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
