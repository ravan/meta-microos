SUMMARY = "Abseil library liblibabsl_civil_time"
DESCRIPTION = "This package contains the libabsl_civil_time library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_civil_time2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "5e7f1e6880415dd9e147e0ffce2739f833eeea7f7b5f6ca84b2bb8d4571eb877f83859ea7c458dc800ca8f05003b29e5ffd7adabc81b8d7419777a68828f4409"

RPROVIDES:${PN} += "libabsl-civil-time.so.2608.0.0 \
libabsl-civil-time2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
