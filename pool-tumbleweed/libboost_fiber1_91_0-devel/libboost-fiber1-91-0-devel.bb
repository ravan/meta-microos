SUMMARY = "Development headers for Boost.Fiber library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.Fiber library. Boost.Fiber is a cooperative multi-tasking \
userland threading library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_fiber1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "a32a2e70fd7e613c912c14e3def72bc7d4e957c1101733c9e566972442af0975ad4aac2a60c6598390aa1a4ba348966dd63106d1bd1a152d19ba5df4655f02ae"

RPROVIDES:${PN} += "libboost-fiber-devel-impl \
libboost-fiber1-91-0-devel"

RDEPENDS:${PN} += "libboost-context1-91-0-devel \
libboost-fiber1-91-0 \
libboost-filesystem1-91-0-devel \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
