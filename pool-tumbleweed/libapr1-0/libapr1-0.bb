SUMMARY = "Apache Portable Runtime (APR) Library"
DESCRIPTION = "APR is Apache's Portable Runtime Library, designed to be a support \
library that provides a predictable and consistent interface to \
underlying platform-specific implementations. \
 \
The range of platform-spanning functionality provided by APR \
includes: Memory allocation and memory pool functionality, atomic \
operations, dynamic library handling, file I/O, command-argument \
parsing, locking, hash tables and arrays, mmap functionality, network \
sockets and protocols, threads, process and mutex functionality, \
shared memory functionality, time routines, as well as user and group \
ID services."
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "libapr1-0-1.7.6-2.2.aarch64.rpm"
RPM_HASH = "1e3fc76051feac7408d048b8a7d43b3582401be3fd1976fab7156ba0a035f813ecb5b9926f05cd0970e942bb4d1f7fe772329ede85bbd22c68a2b79b3a87a7e5"

RPROVIDES:${PN} += "libapr-1.so.0 \
libapr1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
