SUMMARY = "Firmware flash utility for BTC DRW1008 DVD±RW recorder"
DESCRIPTION = "Btcflash is used to read update the Firmware for a BTC DRW1008 \
DVD±RW recorder. Be very careful when writing firmware as this \
program does not check for the correctness of the target device."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "btcflash-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "1a76453bdf33970c89c9d8f972ee4a8809e72f3f54cd6fd1401baeabea420f7a10a515d4f78a909733e0ad2226c41a40993b047cc05a3f50e73910ad16b0f8ce"

RPROVIDES:${PN} += "btcflash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdrdeflt.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0"

inherit rpm
