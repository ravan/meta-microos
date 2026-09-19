SUMMARY = "Minimal D runtime library"
DESCRIPTION = "The minimal runtime library required to support the D programming language."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "libdruntime-ldc112-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "d03372bc080faab79bd01aa1ef4a638aebbe89f22d8a9f6bb2663e275f5d03def003e80a0c985257b0e71d21ffcefc03635cdbed7ac85306af7768cb8d710356"

RPROVIDES:${PN} += "libdruntime-ldc-debug-shared.so.112 \
libdruntime-ldc-shared.so.112 \
libdruntime-ldc112"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
