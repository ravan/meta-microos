SUMMARY = "Library to program and control the FTDI USB controller"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only"

PV = "1.6rc1.2+git.92d657b"

RPM_NAME = "libftdi1-2-1.6rc1.2+git.92d657b-2.1.aarch64.rpm"
RPM_HASH = "bf14d371ea3c350cf07287c048bc36c0e7c539d03d17df22c037624f53dfdde9fde0d3f83812bf0b67d1ba2fbd6c3c90f97afaad598d30d81f5d688b79b17ec2"

RPROVIDES:${PN} += "libftdi1-2 \
libftdi1.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
