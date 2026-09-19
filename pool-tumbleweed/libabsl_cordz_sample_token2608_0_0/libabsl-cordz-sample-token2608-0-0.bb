SUMMARY = "Abseil library liblibabsl_cordz_sample_token"
DESCRIPTION = "This package contains the libabsl_cordz_sample_token library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_cordz_sample_token2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "4fc35f506119088fe5947c961c2a24fddd01151259428000917117864c0bcc9d863aafd0f8c7d1f4e68f261409fd53f195db4ba58913faf56b4093ddfc0140d1"

RPROVIDES:${PN} += "libabsl-cordz-sample-token.so.2608.0.0 \
libabsl-cordz-sample-token2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libabsl-cordz-info.so.2608.0.0"

inherit rpm
