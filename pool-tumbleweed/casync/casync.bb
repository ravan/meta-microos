SUMMARY = "Content Addressable Data Synchronization Tool"
DESCRIPTION = "casync provides a way to efficiently transfer files which change over \
time over the Internet. It will split a given set into a git-inspired \
content-addressable set of smaller compressed chunks, which can then \
be conveniently transferred using HTTP. On the receiving side, these \
chunks will be uncompressed and merged together to recreate the \
original data. When the original data is modified, only the new chunks \
have to be transferred during an update."
LICENSE = "LGPL-2.1-or-later"

PV = "2+git20201210.bd8898e"

RPM_NAME = "casync-2+git20201210.bd8898e-2.12.aarch64.rpm"
RPM_HASH = "5b78bd36a93c11be13e4e7443250f5ff0531aafa5daafb5d827abb9b0446352c47be00ae6aec2f68fc43788f2e0be23a367f4b5e7828b3a80f9fbaccb3d241a3"

RPROVIDES:${PN} += "casync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse.so.2 \
liblzma.so.5 \
libm.so.6 \
libselinux.so.1 \
libudev.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
