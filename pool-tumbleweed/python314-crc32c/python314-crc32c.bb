SUMMARY = "A python package implementing the crc32c algorithm in hardware and software"
DESCRIPTION = "This package implements the crc32c checksum algorithm. It automatically chooses \
between a hardware-based implementation (using the CRC32C SSE 4.2 instruction \
of Intel CPUs, and the crc32* instructions on ARMv8 CPUs), or a software-based \
one when no hardware support can be found."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8"

RPM_NAME = "python314-crc32c-2.8-1.3.aarch64.rpm"
RPM_HASH = "c58737ed9d6781615d8fce14b632314d7ae1530586148cb865a55e20df6446b2a27398dc2d635c8aa5081f00e622c0612d184ee504108d7e1a1ac94ec28d3c10"

RPROVIDES:${PN} += "python3.14dist-crc32c \
python314-crc32c \
python3dist-crc32c"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
