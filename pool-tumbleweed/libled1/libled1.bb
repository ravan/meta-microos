SUMMARY = "Enclosure LED Control Library"
DESCRIPTION = "libled enable enclosure LED control for applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libled1-1.1.0-2.5.aarch64.rpm"
RPM_HASH = "515374800424daecea22ca46ee1b09e7a4a95061fca1d0b5b89038aa6ce6d59e8a43a176fd81df9b1a921a4695aaa3a02ee6f7c756c8448c172a838cded1a364"

RPROVIDES:${PN} += "libled.so.1 \
libled1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpci.so.3 \
libsgutils2-1.48.so.2"

inherit rpm
