SUMMARY = "Utility to autoconfigure printers when plugged"
DESCRIPTION = "This package contains an utility that will ensure printers get \
automatically configured when plugged on the computer."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "udev-configure-printer-1.5.18-9.6.aarch64.rpm"
RPM_HASH = "cb6bb17eede89d51f304314c561852d89661dd21c181b35a55189c41c723f07d4e443df652d28e18b4ee7d6867edc88fb6a6f22ca188a6babcf76baa7671074e"

RPROVIDES:${PN} += "udev-configure-printer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
dbus-1-python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libglib-2.0.so.0 \
libudev.so.1 \
libusb-1.0.so.0 \
python3-cups \
python3-cupshelpers \
systemd"

inherit rpm
