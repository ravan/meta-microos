SUMMARY = "Tools for asynchronous name resolves"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides some tools that make use of c-ares."
LICENSE = "MIT"

PV = "1.34.8"

RPM_NAME = "c-ares-utils-1.34.8-1.1.aarch64.rpm"
RPM_HASH = "75550cecb2c9e2a1ec368fce8a892049a29904fce10eac0e7f076b7273a4ca8dde62d598d87601f1b14ceb117bc3cc10abbc56979ccb0075afc0ad4abc9bbb50"

RPROVIDES:${PN} += "c-ares-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2"

inherit rpm
