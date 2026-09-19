SUMMARY = "Enable TCP keepalive in dynamic binaries"
DESCRIPTION = "libkeepalive is a library that enables tcp keepalive features in glibc based \
binary dynamic executables, without any change in the original program."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "libkeepalive-0.3-1.4.aarch64.rpm"
RPM_HASH = "42e5f02954fdd7225d48ee11d3f9cf83b47c29f827d34ef919c5b4d0b238ad8d417b2434a4ccb6a09bd4030926ff85c28df04b9dd69d94ea04279473b9f681b1"

RPROVIDES:${PN} += "libkeepalive \
libkeepalive.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
