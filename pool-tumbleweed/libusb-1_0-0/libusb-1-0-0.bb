SUMMARY = "USB Library"
DESCRIPTION = "Libusb is a library that allows userspace access to USB devices."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.30"

RPM_NAME = "libusb-1_0-0-1.0.30-1.3.aarch64.rpm"
RPM_HASH = "93b41c8bc56f7ad0d54967819c9730cc58ac841793534b428e515f17b3bc6f1befe1c023de50e645fc9d31570eb2914a5922ecf77f446cb9e74062478cb43572"

RPROVIDES:${PN} += "libusb-1-0-0 \
libusb-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
