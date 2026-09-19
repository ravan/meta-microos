SUMMARY = "Abseil library liblibabsl_stacktrace"
DESCRIPTION = "This package contains the libabsl_stacktrace library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_stacktrace2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "fa86c295f1f6a4804c9af6e124da8db9846432c5a1371e12e7035bfa6e3969fc2d01f6ed43da6a20f12adba8120d33930ee2facdcff1d095150c4286b2a33669"

RPROVIDES:${PN} += "libabsl-stacktrace.so.2608.0.0 \
libabsl-stacktrace2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-debugging-internal.so.2608.0.0 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
