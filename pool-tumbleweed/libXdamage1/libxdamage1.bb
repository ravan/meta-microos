SUMMARY = "X Damage Extension library"
DESCRIPTION = "The X Damage Extension allows applications to track modified regions \
of drawables."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXdamage1-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "0e083f8000eb3d10c7f9e2b088f46f55e75c768c0f9217176fbd36918a336d4857de60bb4a4affb3e417403df33855574dc1a9465ed34d18fb6b1c18d2142d07"

RPROVIDES:${PN} += "libXdamage.so.1 \
libXdamage1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
