SUMMARY = "Abseil library liblibabsl_random_seed_sequences"
DESCRIPTION = "This package contains the libabsl_random_seed_sequences library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_seed_sequences2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "a73b9257198130ac7f62655fb48d91f228227c96d3770810f15b0833b75b22ec410f2648f62d1c8631e022a3966fbef0ef5d83a104b5f55a1ec6572a74d2521f"

RPROVIDES:${PN} += "libabsl-random-seed-sequences.so.2608.0.0 \
libabsl-random-seed-sequences2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-random-internal-entropy-pool.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
