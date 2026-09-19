SUMMARY = "Library to report most recent login of users"
DESCRIPTION = "The liblastlog2 library provides various interfaces to read, write or modify the lastlog 2 database."
LICENSE = "BSD-2-Clause"

PV = "2.42.2"

RPM_NAME = "liblastlog2-2-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "98ca31de32bf9d9625f3b8ec2cd37580a4b3cec27cc1f8d871bf43cc5fd74fa29db3b8076cb659c726f467d3402e6490a5c8026dfdd96f5dac9e880b74e3e2f8"

RPROVIDES:${PN} += "liblastlog2-2 \
liblastlog2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
