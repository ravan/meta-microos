SUMMARY = "USB CEC adapter communication library"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.7"

RPM_NAME = "libcec8-8.1.7-1.1.aarch64.rpm"
RPM_HASH = "71871cbcb90ac69ff9e1480e5df0c2a677417c731153db27012636fd5a3bc06425a5801608fa25f7b2ce653ca2d33ecef5d6048f6eab827e80320d38a7249e7d"

RPROVIDES:${PN} += "libcec.so.8 \
libcec8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
