SUMMARY = "Apple's Grand Central Dispatch library"
DESCRIPTION = "Grand Central Dispatch (GCD or libdispatch) provides support for \
concurrent code execution on multicore hardware."
LICENSE = "Apache-2.0"

PV = "6.3.3"

RPM_NAME = "libdispatch1_3-6.3.3-1.2.aarch64.rpm"
RPM_HASH = "35a3fc07519b41c4384e8b93fce9f6366d70848378b56055d5f5e510311633febc96ecb90f7d1529c07a1c1c575e2d7585ef63575ec2cc20c537b6a5c7078f05"

RPROVIDES:${PN} += "libdispatch \
libdispatch.so.1.3 \
libdispatch1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBlocksRuntime.so.1.3 \
libc.so.6"

inherit rpm
