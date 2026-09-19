SUMMARY = "Abseil library liblibabsl_random_internal_randen_slow"
DESCRIPTION = "This package contains the libabsl_random_internal_randen_slow library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_randen_slow2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c2db287b5d4ea38e65f242320835432af52d8fac72d6b4cc70f8ce1ff84213f6931a8397270e8437606b571bb1678201c2f5aeb7742d6abc962cdedff5527bed"

RPROVIDES:${PN} += "libabsl-random-internal-randen-slow.so.2608.0.0 \
libabsl-random-internal-randen-slow2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-random-internal-platform.so.2608.0.0"

inherit rpm
