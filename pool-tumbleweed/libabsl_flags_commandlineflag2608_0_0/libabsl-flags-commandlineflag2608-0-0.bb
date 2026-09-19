SUMMARY = "Abseil library liblibabsl_flags_commandlineflag"
DESCRIPTION = "This package contains the libabsl_flags_commandlineflag library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_commandlineflag2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "1b0ef0648b2b892d94cdf9df3cfef34bd6c98811ab8815acc0d0e463e2cdf54314ab5ed80ddbb25c249e10715fef237d6d46188c5ff76d3a97beeb53f299bdbf"

RPROVIDES:${PN} += "libabsl-flags-commandlineflag.so.2608.0.0 \
libabsl-flags-commandlineflag2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libstdc++.so.6"

inherit rpm
