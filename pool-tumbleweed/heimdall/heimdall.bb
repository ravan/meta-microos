SUMMARY = "Samsung Mobile Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Mobile devices. \
 \
Official supported devices (but not limited to) are: \
 * GT-I9000 \
 * GT-I9100[T] \
 * GT-I9300 \
 * GT-I9505 \
 * SGH-I727 \
 * SGH-I777 \
 * SGH-I927 \
 * SGH-I797"
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-1.4.2-1.41.aarch64.rpm"
RPM_HASH = "097d56a8d9b8b2e6056f6d47d48350134f1b9b701a8bd4da0de8ae81648fbaeb21cf3b10ebaf7d545dbd5421f9251d05b312c0bc66ceb72f9c1bcf530620b970"

RPROVIDES:${PN} += "heimdall"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
