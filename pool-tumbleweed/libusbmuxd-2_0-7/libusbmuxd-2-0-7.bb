SUMMARY = "A client library to multiplex connections from and to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
This package contains the usbmuxd communication interface library 'libusbmuxd'."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "libusbmuxd-2_0-7-2.1.0-1.7.aarch64.rpm"
RPM_HASH = "233796f3c46c884dd823160475fefd7317a5b97a6836016dcc6102a11e37b1de3c12ee3d1aeddd94e48c27b973c3b88b021124c73c1e8b125d4d8e610c494668"

RPROVIDES:${PN} += "libusbmuxd-2-0-7 \
libusbmuxd-2.0.so.7 \
libusbmuxd6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4"

inherit rpm
