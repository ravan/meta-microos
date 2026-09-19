SUMMARY = "USB3380 abstraction layer for libusb"
DESCRIPTION = "USB3380 abstraction layer for libusb."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190126"

RPM_NAME = "libusb3380-0-0.0.0+git.20190126-3.8.aarch64.rpm"
RPM_HASH = "f77ae8d10298ccdb019f6f1366e630a330183f483e2de6a6e378dd8f14f16d4024bbaac67d2ce4ddd8b5a20537477c68162328e51e5aabe88b32d01bd7629415"

RPROVIDES:${PN} += "libusb3380-0 \
libusb3380.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
