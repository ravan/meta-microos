SUMMARY = "Enclosure LED Utilities"
DESCRIPTION = "The ledctl application and ledmon daemon are part of Intel(R) LED \
ControlUtilities. They help to enable LED management for software RAID \
solutions."
LICENSE = "GPL-2.0-only"

PV = "1.1.0"

RPM_NAME = "ledmon-1.1.0-2.5.aarch64.rpm"
RPM_HASH = "c04d932985edcbaa170f9af3f096563c1563a1521a4500b961c693993e7635b90ab9b515cb33087bcd9600987c53c46b18c4286d08c4d3930295c13016af0313"

RPROVIDES:${PN} += "ledmon \
sgpio-/sbin/ledmon \
sgpio-/{/usr/bin}/ledctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpci.so.3 \
libsgutils2-1.48.so.2 \
libudev.so.1 \
systemd"

inherit rpm
