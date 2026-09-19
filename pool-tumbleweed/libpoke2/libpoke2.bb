SUMMARY = "Support library for poke"
DESCRIPTION = "Contains support library for poke."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "libpoke2-5.0-1.1.aarch64.rpm"
RPM_HASH = "9d31c0706dd0c245606353838f6d034517e643e251b9ae9cc3ab7d7ba7360e1f8b94fbf1962cc68d51e4bf9b14543053cf506b1060729b422e574800e2bbeb8b"

RPROVIDES:${PN} += "libpoke.so.2 \
libpoke2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgc.so.1 \
libnbd.so.0"

inherit rpm
