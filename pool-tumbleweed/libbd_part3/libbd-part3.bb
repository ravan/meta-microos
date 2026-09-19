SUMMARY = "The partitioning plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to partitioning."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_part3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "953a71e9e46292c39d4ad4f6d94a7c3aab38b687d172cef1b5aeb3bd366a49f002cb84214e42e955e049958405ebeeeeea2c3804e82903b723e3769411bf8a94"

RPROVIDES:${PN} += "libbd-part.so.3 \
libbd-part3 \
libblockdev-part"

RDEPENDS:${PN} += "/sbin/ldconfig \
gptfdisk \
ld-linux-aarch64.so.1 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libfdisk.so.1 \
libglib-2.0.so.0 \
util-linux"

inherit rpm
