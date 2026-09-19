SUMMARY = "Linux Kernel Crypto API User Space Interface Library"
DESCRIPTION = "libkcapi allows user-space to access the Linux kernel crypto API."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "libkcapi1-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "8e647c106873b2730e0b094745dbd014f0447e201ddf44b4a8932284fd218adff51298a39398291d5cb90c357bc3927577019c332a202abbd9c2774c0b73435c"

RPROVIDES:${PN} += "libkcapi.so.1 \
libkcapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
