SUMMARY = "Clang Blocks runtime library"
DESCRIPTION = "The BlocksRuntime library provides the runtime support for the Blocks \
(C closures) language extension used by libdispatch."
LICENSE = "Apache-2.0"

PV = "6.3.3"

RPM_NAME = "libBlocksRuntime1_3-6.3.3-1.2.aarch64.rpm"
RPM_HASH = "d63a02ff4b86e241c0ecd7fcf2e446f2439a60ca81a3026a0f7756b975f9f7a3f0c81d80639c609af55e94bed6f5636f83182984e71103cb14f6c6d8e3034219"

RPROVIDES:${PN} += "libBlocksRuntime.so.1.3 \
libBlocksRuntime1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
