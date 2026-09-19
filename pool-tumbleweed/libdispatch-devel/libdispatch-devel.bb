SUMMARY = "Development files for libdispatch"
DESCRIPTION = "The libdispatch-devel package contains libraries and header files for \
developing applications that use libdispatch."
LICENSE = "Apache-2.0"

PV = "6.3.3"

RPM_NAME = "libdispatch-devel-6.3.3-1.2.aarch64.rpm"
RPM_HASH = "b5c65be9f18733ce22ecd3613e3b3b1df6e2db97dd2d6a6b277152d248a5a15222630c092446bb0cb803df4ce266da0c62a5f3405f4726f1b83edaa36d50752c"

RPROVIDES:${PN} += "libdispatch-devel"

RDEPENDS:${PN} += "libBlocksRuntime1-3 \
libdispatch1-3"

inherit rpm
