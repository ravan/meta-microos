SUMMARY = "Development headers for Boost.Atomic"
DESCRIPTION = "Development support for Boost.Atomic, a library that provides atomic \
data types and operations on these data types, as well as memory \
ordering constraints required for coordinating multiple threads through \
atomic variables."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_atomic-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "2d938c861ab3bbd8914a199865242d3884ec6ddfcd682ee0f0d398ee321ff1b71846266aa8f51c0fc4230323be75d1d1d0ebb6aa1b4c4d81a0b0ed4a8ef233df"

RPROVIDES:${PN} += "libboost-atomic-devel"

RDEPENDS:${PN} += "libboost-atomic1-91-0-devel"

inherit rpm
