SUMMARY = "Development headers for Boost.TypeErasure library"
DESCRIPTION = "This package contains development headers for Boost.TypeErasure library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_type_erasure1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "5be08757169fbe4a4d3f48511d87babbe5b9513b01a7fca2437455f08b7be2b9481c161f04622e4c9c7bff446917c3b7d1134ac27b35618a4b90f09064ed3f96"

RPROVIDES:${PN} += "libboost-type-erasure-devel-impl \
libboost-type-erasure1-91-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0-devel \
libboost-headers1-91-0-devel \
libboost-thread1-91-0-devel \
libboost-type-erasure1-91-0"

inherit rpm
