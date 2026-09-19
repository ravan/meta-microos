SUMMARY = "A lossy audio codec for Bluetooth connections"
DESCRIPTION = "LDAC is an audio coding technology developed by Sony. \
It enables the transmission of High-Resolution Audio content, \
even over a Bluetooth connection."
LICENSE = "Apache-2.0"

PV = "2.0.2.5"

RPM_NAME = "libldac2-2.0.2.5-1.3.aarch64.rpm"
RPM_HASH = "2f779326db4710e1d509e23d0467517b9bf19afa3387cbdc3bfe339c4ee73af56fec3054e14d3412d8224a7ce35b9ebd554dcafb2767e4c8e4c8d2a5dab3d751"

RPROVIDES:${PN} += "libldac2 \
libldacBT-abr.so.2 \
libldacBT-enc.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
