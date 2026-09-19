SUMMARY = "Shared library of avrdude"
DESCRIPTION = "This package contains the shared libavrdude library."
LICENSE = "GPL-2.0-or-later"

PV = "8.0"

RPM_NAME = "libavrdude2-8.0-2.7.aarch64.rpm"
RPM_HASH = "8dc13bf348987b005d510fe6d10cf861f539cd9022882161b82ad597033a538719b0a94dc0ee27667246fc2cb2b6d8405621ae36bf7e68f834e9906d2d320df4"

RPROVIDES:${PN} += "libavrdude.so.2 \
libavrdude2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libftdi1.so.2 \
libhidapi-libusb.so.0 \
libm.so.6 \
libreadline.so.8 \
libserialport.so.0 \
libusb-0.1.so.4 \
libusb-1.0.so.0"

inherit rpm
