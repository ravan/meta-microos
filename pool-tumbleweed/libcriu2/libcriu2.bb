SUMMARY = "Library for CRIU"
DESCRIPTION = "This package contains the library for CRIU, Checkpoint/Restore In \
Userspace Tools."
LICENSE = "LGPL-2.1-only"

PV = "4.2.1"

RPM_NAME = "libcriu2-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "c2ac482a4eccd54779f17cfee20d7c5b73be5f083b236454cefe53eb355c2e8265cfdf3b4fffbc45b6c32055eef4002267b5cd6d2137c4259145c2533a687a62"

RPROVIDES:${PN} += "libcriu.so.2 \
libcriu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm
