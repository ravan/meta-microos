SUMMARY = "Abseil library liblibabsl_time_zone"
DESCRIPTION = "This package contains the libabsl_time_zone library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_time_zone2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "1a833e4b469d14df316b5a426d9c4170c396bca07007d8ba43867815a3163dc300a504d055f56d59e2e464f9e24aeec042c7e516d5d9feced02489f6e483437f"

RPROVIDES:${PN} += "libabsl-time-zone.so.2608.0.0 \
libabsl-time-zone2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
