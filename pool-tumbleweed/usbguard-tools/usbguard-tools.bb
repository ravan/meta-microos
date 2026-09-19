SUMMARY = "USBGuard Tools"
DESCRIPTION = "The usbguard-tools package contains optional tools from the USBGuard \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "usbguard-tools-1.1.4-3.9.aarch64.rpm"
RPM_HASH = "275ecd72266f2075581e369b325ba26145e45f578e0472fe653c0187c06bec36f30165f9cee89693e9fd61135ea1ecc46cb5b376c2e209835953885fb245dcee"

RPROVIDES:${PN} += "usbguard-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusbguard.so.1 \
usbguard"

inherit rpm
