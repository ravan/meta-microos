SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-splash-core library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-core5-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "d60bac936bca237eef825639bb657b44778bc74eda5746ad7d3cc955bd33c156026005ac5614a195ef2f26159051c41512ef19d67bcd78f53b473ff88ead9239"

RPROVIDES:${PN} += "libply-splash-core.so.5 \
libply-splash-core5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply.so.5 \
libudev.so.1"

inherit rpm
