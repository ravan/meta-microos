SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python313-libsmdev-20260902-1.1.aarch64.rpm"
RPM_HASH = "5e35f9f169798336bb3076d926189d7f2ef475089057312c01e9b0583d802f35f609f266bc1de9323a408faf6c4ecef05bc1521a590020c56c58d8f36002133b"

RPROVIDES:${PN} += "python3-libsmdev \
python313-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
