SUMMARY = "A faithful remake of, and a tribute to, Atomix, a classic puzzle game"
DESCRIPTION = "Atomiks is a faithful remake of, and a tribute to, Atomix, a classic puzzle game \
created by Softtouch & RoSt and published in 1990 by the Thalion Software company. \
Atomiks is free software, and shares no code with the original Atomix game."
LICENSE = "GPL-3.0+"

PV = "1.0.4.1"

RPM_NAME = "atomiks-1.0.4.1-1.37.aarch64.rpm"
RPM_HASH = "8bd70c2c65cf2887e353e004d7a1499de96aad41a90db2338a4b059007a1abb7e2399f8c4c4319189b196f1394034a3605ca16927c8458e32c06380fdae0d6f4"

RPROVIDES:${PN} += "atomiks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6"

inherit rpm
