SUMMARY = "Development headers for Boost.Coroutine"
DESCRIPTION = "This package provides headers for Boost.Coroutine libraries. \
Boost.Coroutine2 provides templates for generalized subroutines which \
allow suspending and resuming execution at certain locations."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_coroutine1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ecb3779a1911fc2050670bb67cc099e8975be2fc9da47e4e434184b27b275beba3a2e9d6ccaed4fd273974112b89e93bdbd529b2970fd752a0eac73320acdd46"

RPROVIDES:${PN} += "libboost-coroutine-devel-impl \
libboost-coroutine1-91-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-91-0-devel \
libboost-context1-91-0-devel \
libboost-coroutine1-91-0 \
libboost-headers1-91-0-devel \
libboost-thread1-91-0-devel \
libstdc++-devel"

inherit rpm
