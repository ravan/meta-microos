SUMMARY = "Primitive command line interface to RandR extension"
DESCRIPTION = "Xrandr is used to set the size, orientation and/or reflection of \
the outputs for a screen. It can also set the screen size."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "xrandr-1.5.4-1.4.aarch64.rpm"
RPM_HASH = "1028ecdda2d4532f353ecba9ce8711de16680aa0637dcd497f42eeab70bc71b13b37d437c002a70fb064aa34e3682b0b64edf49adc771abfa99538cc2b35c9b0"

RPROVIDES:${PN} += "xrandr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
