SUMMARY = "Development files for libusbmuxd"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
The libusbmuxd-devel package contains libraries and header files for \
developing applications that use libusbmuxd."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "libusbmuxd-devel-2.1.0-1.7.aarch64.rpm"
RPM_HASH = "b97c0216af163300609dad84431194109fd301e95f6de3fbea509d14476d9aba27cdcc7282969b163a75302853455f769df2db03a12b68103abfda1db013f659"

RPROVIDES:${PN} += "libusbmuxd-devel \
pkgconfig-libusbmuxd-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbmuxd-2-0-7 \
pkgconfig-libimobiledevice-glue-1.0 \
pkgconfig-libplist-2.0"

inherit rpm
