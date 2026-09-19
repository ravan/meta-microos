SUMMARY = "Linux kernel trace file system library"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system."
LICENSE = "LGPL-2.1-only"

PV = "1.8.3"

RPM_NAME = "libtracefs1-1.8.3-1.3.aarch64.rpm"
RPM_HASH = "988690c0942d8a4582e03418c66758404ca9fbff01455284054bfedd40d70a2b8e09654dca72ca8b32b079860e050dc834fc6c668adc22443622f522318ec96a"

RPROVIDES:${PN} += "libtracefs.so.1 \
libtracefs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1"

inherit rpm
