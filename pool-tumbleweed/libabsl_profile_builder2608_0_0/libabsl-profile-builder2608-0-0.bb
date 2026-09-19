SUMMARY = "Abseil library liblibabsl_profile_builder"
DESCRIPTION = "This package contains the libabsl_profile_builder library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_profile_builder2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "625bed9cfe9b3248b391708dc63a0c58fee7560960755efc32663dcc8b4f07329553c45d4ab00f3eabc1fc927c8d4654ec588b4cfeb6c4842bb35bff558f34ee"

RPROVIDES:${PN} += "libabsl-profile-builder.so.2608.0.0 \
libabsl-profile-builder2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
