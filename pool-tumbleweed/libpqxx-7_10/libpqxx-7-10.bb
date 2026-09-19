SUMMARY = "C++ Client Library for PostgreSQL"
DESCRIPTION = "This is the official C++ client API for postgres.  What libpqxx brings you is \
effective use of templates to reduce the inconvenience of dealing with type \
conversions; of standard C++ strings to keep you from having to worry about \
buffer allocation and overflow attacks; of exceptions to take the tedious and \
error-prone plumbing around error handling out of your hands; of constructors \
and destructors to bring resource management under control; and even basic \
object-orientation to give you some extra reliability features that would be \
hard to get with most other database interfaces."
LICENSE = "BSD-3-Clause"

PV = "7.10.3"

RPM_NAME = "libpqxx-7_10-7.10.3-1.4.aarch64.rpm"
RPM_HASH = "828740a35087601f812b375684eb1def1f5b321d3b8c69c66d2968e0cea6f8f2a22a52ac9210c9973d7fcf8f863cd4060d9ba3773498eab5afa36cce33dc7113"

RPROVIDES:${PN} += "libpqxx-7-10 \
libpqxx-7.10.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
