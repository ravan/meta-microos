SUMMARY = "Abseil library liblibabsl_random_internal_randen"
DESCRIPTION = "This package contains the libabsl_random_internal_randen library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_randen2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "54c179a6914d72754cdf7f641e53df30f8ae19b49bfb14a633ae6f2f2909d180408cb60f95a59bf674188472242d4ea3bb1fb0ad2299a589294fa38c0b850be4"

RPROVIDES:${PN} += "libabsl-random-internal-randen.so.2608.0.0 \
libabsl-random-internal-randen2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-hwaes.so.2608.0.0 \
libabsl-random-internal-randen-slow.so.2608.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
