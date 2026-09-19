SUMMARY = "Abseil library liblibabsl_random_internal_entropy_pool"
DESCRIPTION = "This package contains the libabsl_random_internal_entropy_pool library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_entropy_pool2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "6ac318efb003feb4d0d71809a5ab50b6bc9bb7cc93d2340c401966a1265463ae84531bc9aec4a53d7275a96a640887df9b5a26a3d6c8547239765a22652c1c86"

RPROVIDES:${PN} += "libabsl-random-internal-entropy-pool.so.2608.0.0 \
libabsl-random-internal-entropy-pool2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-slow.so.2608.0.0 \
libabsl-random-internal-randen.so.2608.0.0 \
libabsl-random-internal-seed-material.so.2608.0.0 \
libabsl-random-seed-gen-exception.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
