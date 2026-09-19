SUMMARY = "Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "liboaml1-1.3.4-1.25.aarch64.rpm"
RPM_HASH = "8528c265b0c41ce5da306eaae29036eb025a03e70ed6202b217cd457338f1cbd8774a9830e43e46e61cb8c020925da6bd6b6e389a64700ef1abfe154817294ef"

RPROVIDES:${PN} += "liboaml.so.1 \
liboaml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsoxr.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
