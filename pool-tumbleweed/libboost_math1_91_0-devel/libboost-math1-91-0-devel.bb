SUMMARY = "Development headers for Boost.Math libraries"
DESCRIPTION = "Development headers for Boost.Math* boost libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_math1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "279b0b61021025f17643666eb1567b9e7b34d14beac4ad0f2c364f45ce3dda88b3afcd49f8580b4d67e4004c6b1db861c8094b09369de31ef529c3fb6e492553"

RPROVIDES:${PN} += "libboost-math-devel-impl \
libboost-math1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-math1-91-0"

inherit rpm
