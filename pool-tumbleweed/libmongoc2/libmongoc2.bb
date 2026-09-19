SUMMARY = "A client library written in C for MongoDB"
DESCRIPTION = "mongo-c-driver is a library for building high-performance \
applications that communicate with the MongoDB NoSQL \
database in the C language."
LICENSE = "Apache-2.0 & ISC & MIT & Zlib"

PV = "2.5.3"

RPM_NAME = "libmongoc2-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "bda6c62a7cc133e1f3c949aa23f737ff2ca0147cfe044ec590d4ed8384fbbc26240cab5c3f3e99025de6dd9a39b4733d42c7df524bb5aeb4514cd7f2ac9e6d1e"

RPROVIDES:${PN} += "libmongoc2 \
libmongoc2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbson2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libresolv.so.2 \
libsasl2.so.3 \
libsnappy.so.1 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1"

inherit rpm
