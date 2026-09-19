SUMMARY = "Double-Array Trie Library"
DESCRIPTION = "This is an implementation of double-array structure for representing \
trie, as proposed by Junichi Aoe."
LICENSE = "LGPL-2.1-only"

PV = "0.2.14"

RPM_NAME = "libdatrie1-0.2.14-1.6.aarch64.rpm"
RPM_HASH = "c6c3d039c6c4bdb8bf8a440bd4f33e5e7436fdde183433886c368daa5090a468d8b8322eb68b898f1bfca25092f734013c0ab8a66bc847572884d85780070a68"

RPROVIDES:${PN} += "libdatrie.so.1 \
libdatrie1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
