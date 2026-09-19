SUMMARY = "Development files for mongo-c-driver"
DESCRIPTION = "The mongo-c-driver-devel package contains libraries and header files for \
developing applications that use mongo-c-driver."
LICENSE = "Apache-2.0 & ISC & MIT & Zlib"

PV = "2.5.3"

RPM_NAME = "mongo-c-driver-devel-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "71984539eb406c6199983c7145b640bbe74b3260ec3592b8388139300dcd59696a346464e6bd65fcc978d72998ef99f4eebfbc12d07d539a6cdea8eea1e758ac"

RPROVIDES:${PN} += "cmake-mongoc \
mongo-c-driver-devel \
pkgconfig-mongoc2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmongoc2 \
pkgconfig-bson2"

inherit rpm
