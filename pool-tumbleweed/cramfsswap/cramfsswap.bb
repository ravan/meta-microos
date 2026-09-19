SUMMARY = "Swap endianess of a cram filesystem (cramfs)"
DESCRIPTION = "cramfs is a highly compressed and size optimized linux filesystem which is \
mainly used for embedded applications. the problem with cramfs is that it \
is endianess sensitive, meaning you can't mount a cramfs for a big endian \
target on a little endian machine and vice versa. this is often especially \
a problem in the development phase. \
 \
cramfsswap solves that problem by allowing you to swap to endianess of a \
cramfs filesystem."
LICENSE = "GPL-2.0-only"

PV = "1.4.5"

RPM_NAME = "cramfsswap-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "db39d884ab3480b3151848ba3ba30e1bf00830927ef6d6653685cc4fb77abe78b71077a960801368d4cb2eae591b87081a745d9b399d95e7d5fc01b8bba8adb6"

RPROVIDES:${PN} += "cramfsswap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
