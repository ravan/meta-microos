SUMMARY = "Shared library for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the shared library."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "0.7.2"

RPM_NAME = "libck0-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "ef61fe0bb0e78d40c0ec0a9d5510286873b4bb2eab922e96663fcfc30e2ec440a23afc1605b494c95edd5a64c03310d23c78dc7146de36c38c3455082993e6c3"

RPROVIDES:${PN} += "libck.so.0 \
libck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
