SUMMARY = "3D printer control software"
DESCRIPTION = "CuraEngine is an engine for processing 3D models into 3D printing \
instruction for Ultimaker and other GCode-based 3D printers. \
It is part of the larger project called 'Cura'."
LICENSE = "AGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "cura-engine-4.13.1-3.18.aarch64.rpm"
RPM_HASH = "32709ea7a24e57785abbf9f4b8358b1a2223b0fca8ef50ddd7ce6d65960628471084f0097239ef7b069057e052e73c5c82b1a1f27f74cd55d88c6309cbe717e3"

RPROVIDES:${PN} += "cura-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpolyclipping.so.22 \
libprotobuf.so.34.2.0 \
libstdc++.so.6"

inherit rpm
