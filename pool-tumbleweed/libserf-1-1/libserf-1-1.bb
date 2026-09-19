SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "libserf-1-1-1.3.10-2.9.aarch64.rpm"
RPM_HASH = "fb13211ae29bcedb89f229ff87e519b6dd9b3c1664f7d2bf5e6db17ca044550277e81bba8bcc9e5d0f4756c4d59adbd80d01da7e9f141ddb883be1d52643f9d6"

RPROVIDES:${PN} += "libserf-1-1 \
libserf-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libexpat.so.1 \
libgdbm.so.6 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libssl.so.3 \
libz.so.1"

inherit rpm
