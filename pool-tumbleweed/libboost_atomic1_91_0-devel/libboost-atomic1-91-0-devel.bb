SUMMARY = "Development headers for Boost.Atomic"
DESCRIPTION = "Development support for Boost.Atomic, a library that provides atomic \
data types and operations on these data types, as well as memory \
ordering constraints required for coordinating multiple threads through \
atomic variables."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_atomic1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ffdbdf43c04246e88ba97a45e910ec8e8e45c61a4558e61b2573ebf5371f3e2f4e9218c58c201ae0fb5869f4e95da8dd094bee1af2557dc2663d43ba767ba86a"

RPROVIDES:${PN} += "libboost-atomic-devel-impl \
libboost-atomic1-91-0-devel"

RDEPENDS:${PN} += "libboost-atomic1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
