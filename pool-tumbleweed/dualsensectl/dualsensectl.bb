SUMMARY = "Tool for controlling PlayStation 5 DualSense controllers on Linux"
DESCRIPTION = "DualSense Control [DualSenseCTL] is a tool for controlling Sony PlayStation 5 DualSense controllers on Linux."
LICENSE = "GPL-2.0"

PV = "0.7"

RPM_NAME = "dualsensectl-0.7-3.6.aarch64.rpm"
RPM_HASH = "d5b2de59ed72646265ce9a8fca321c000b970efb928ca0863b0cde008b533fbb90c3266310e87bd7179b1a0070fa46c32dab9f86dc16f8f5d60297c2ea047a6c"

RPROVIDES:${PN} += "dualsensectl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libhidapi-hidraw.so.0 \
libudev.so.1"

inherit rpm
