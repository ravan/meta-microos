SUMMARY = "Abseil library liblibabsl_clock_interface"
DESCRIPTION = "This package contains the libabsl_clock_interface library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_clock_interface2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "b9981389ba5beae154546047cd05ebcbf19ea124c6659de63902b15649d6b5d9339c30e8c025a8720edf0c264870fe5fbce2e8d28de5756c8b3b291a4e93eabc"

RPROVIDES:${PN} += "libabsl-clock-interface.so.2608.0.0 \
libabsl-clock-interface2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
