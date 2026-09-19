SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "libXaw6-1.0.16-1.9.aarch64.rpm"
RPM_HASH = "560589211c81a10f3c5cfb8331effb1e3c529ebb910d56c2722df723c3a8485e5cb14175afa42e9e62b182a76e49876085f57538205573359fcbea53f0f4be27"

RPROVIDES:${PN} += "libXaw.so.6 \
libXaw6 \
libXaw6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
