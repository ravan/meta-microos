SUMMARY = "Simple program to read/write from/to any location in memory"
DESCRIPTION = "Simple program to read/write from/to any location in memory. \
Usage examples: \
devmem2 0x48004B48 w 0x2 - write value 0x2 to addr 0x48004B48 \
devmem2 0x50000014 - read value from addr 0x50000014"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "devmem2-1.0-12.9.aarch64.rpm"
RPM_HASH = "80a776d5dcd6851c88065ab6a64ab1fb6918138920b28a27f4ef47d2b200eb1eb515dd91eeb06fff401c3b07f67f682327f8d4716a17f9fc4317425bc973425b"

RPROVIDES:${PN} += "devmem2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
