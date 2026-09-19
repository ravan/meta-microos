SUMMARY = "Abseil library liblibabsl_flags_marshalling"
DESCRIPTION = "This package contains the libabsl_flags_marshalling library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_marshalling2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "1c961e453c551368702cf2f7f46a4c2497ae44fb69d0c3f43d708ddf25a449ff1be45a6f1014ad8ff602592b146328d353f4674d6764bb54cdfd3b355c802073"

RPROVIDES:${PN} += "libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-marshalling2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-int128.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
