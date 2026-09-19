SUMMARY = "Abseil library liblibabsl_random_internal_distribution_test_util"
DESCRIPTION = "This package contains the libabsl_random_internal_distribution_test_util library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_distribution_test_util2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "22a8af1110664dcfbd4b5798bd53e8975ee1272bf3dc406eddd4c0842457b09567db433a9ef003e0e1d0db31d3528d2b099cd94aff0a3980de457f87a0e7df53"

RPROVIDES:${PN} += "libabsl-random-internal-distribution-test-util.so.2608.0.0 \
libabsl-random-internal-distribution-test-util2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
