SUMMARY = "Development files for the Double-Array Trie library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe. \
 \
This package contains the development files for libdatrie."
LICENSE = "LGPL-2.1-only"

PV = "0.2.14"

RPM_NAME = "libdatrie-devel-0.2.14-1.6.aarch64.rpm"
RPM_HASH = "7d0014010b6460ec13c3dce3480db15d4536651f1fb3262934ef12d1003a3fd5ca356436bae831c0e2f67a849164cdc2cbc90c44d2184f7b875123481dfbf0aa"

RPROVIDES:${PN} += "libdatrie-devel \
pkgconfig-datrie-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdatrie.so.1 \
libdatrie1"

inherit rpm
