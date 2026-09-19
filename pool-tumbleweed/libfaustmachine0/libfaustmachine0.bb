SUMMARY = "Faust Interpreter dynamic library"
DESCRIPTION = "Dynamic Faust Interpreter library."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "libfaustmachine0-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "7fb74ffd918bae83fcf8a8a2663cd0cbdf93c83304cf71f9d21838674d2c3dae49b6137cb1acd8483403335198ee06aa783e0c324bd013b772476ebb82eb3854"

RPROVIDES:${PN} += "libfaustmachine.so.0 \
libfaustmachine0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
