SUMMARY = "Abseil library liblibabsl_random_internal_randen_hwaes"
DESCRIPTION = "This package contains the libabsl_random_internal_randen_hwaes library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_random_internal_randen_hwaes2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "bc6f3765c143145281b4b08a2cde0895fc124257a4503274810d1dd6a4209960beab18a5814886d0f92bac9e9f14722d4952e41707bbcf149f2c6cd088f434c2"

RPROVIDES:${PN} += "libabsl-random-internal-randen-hwaes.so.2608.0.0 \
libabsl-random-internal-randen-hwaes2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
