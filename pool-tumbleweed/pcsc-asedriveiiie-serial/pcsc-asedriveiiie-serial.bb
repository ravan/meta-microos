SUMMARY = "ASEDrive IIIe Serial Smartcard Reader Driver"
DESCRIPTION = "This package contains a driver for the ASEDrive IIIe Serial smart card \
reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asedriveiiie-serial-3.7-8.5.aarch64.rpm"
RPM_HASH = "7cb310f152072467cbfb6381e80ab451c9ee8b8f6a0735e499e1d4ad954fb2b6be18d4fdccdfc4a46d18135522d0b623fe9999d2fcd64618348570565cf3207f"

RPROVIDES:${PN} += "libASESerial.so \
pcsc-asedriveiiie-serial"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
