SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libsmdev-20260902-1.1.aarch64.rpm"
RPM_HASH = "f2d8611c9cf3c6f06946ed6f922bbce53a36ab51d29cb685ed5944c5749cc3b95458d3dcfb228b88cfef973b9c5141e7d03ca14ec052338492c32e1bde31aef3"

RPROVIDES:${PN} += "python314-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
