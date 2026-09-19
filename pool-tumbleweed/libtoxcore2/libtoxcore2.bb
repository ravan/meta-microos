SUMMARY = "Core library for toxcore"
DESCRIPTION = "This are the Core library for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.23"

RPM_NAME = "libtoxcore2-0.2.23-1.3.aarch64.rpm"
RPM_HASH = "9cc784835970196ba5cd26bcd16d96ae80c531efdec613617af417575d8c028e822d228178c44e7802c46e8c1d12ad4ad7046f212beac545eb1cdb5c7ffac4f4"

RPROVIDES:${PN} += "libtoxcore.so.2 \
libtoxcore2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopus.so.0 \
libsodium.so.26 \
libvpx.so.12"

inherit rpm
