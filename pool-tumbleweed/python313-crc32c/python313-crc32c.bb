SUMMARY = "A python package implementing the crc32c algorithm in hardware and software"
DESCRIPTION = "This package implements the crc32c checksum algorithm. It automatically chooses \
between a hardware-based implementation (using the CRC32C SSE 4.2 instruction \
of Intel CPUs, and the crc32* instructions on ARMv8 CPUs), or a software-based \
one when no hardware support can be found."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8"

RPM_NAME = "python313-crc32c-2.8-1.3.aarch64.rpm"
RPM_HASH = "8cd075c228d82dd1bc355954841b10adb9ed1178b775865011a4e294b09e8dfb7484e55a7036bdb7438b130823855d4e1d6017520f73409dc6b549d1e1168503"

RPROVIDES:${PN} += "python3-crc32c \
python3.13dist-crc32c \
python313-crc32c \
python3dist-crc32c"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
