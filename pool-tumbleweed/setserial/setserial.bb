SUMMARY = "A utility for configuring serial ports"
DESCRIPTION = "Setserial is a basic system utility for displaying or setting serial \
port information. Setserial can reveal and allow you to alter the I/O \
port and IRQ that a particular serial device is using."
LICENSE = "GPL-2.0-or-later"

PV = "2.17"

RPM_NAME = "setserial-2.17-746.5.aarch64.rpm"
RPM_HASH = "71d9b5e469562b8ff6c4d74abcb83d5e46e307dae3f1393e09dd23a5a8ee0452836594ed97a77454770858892c5677cf7bd55b6c1ed34fc5519e8ef9cb57d4f9"

RPROVIDES:${PN} += "setserial \
util-/sbin/setserial"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
