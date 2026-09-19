SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "729bb8ccdaf57935555627c9ddf5b52f9559ffb6ba6da4f5d2f0395a1a9a15d383e9e22f8b930585d18d38db362e065bae9e1d099c3684fddfae559b433fb78e"

RPROVIDES:${PN} += "libply-splash-graphics.so.5 \
libply-splash-graphics5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
libpng16.so.16"

inherit rpm
