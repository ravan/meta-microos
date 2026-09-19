SUMMARY = "Abseil library liblibabsl_status"
DESCRIPTION = "This package contains the libabsl_status library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_status2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "aa811a7a8e8e7d2c295798028bd32db2af9151963fa979415e649f19fe641d2c9d96589b289c9f4939ac4959993fe749601f81674d7a4a729f3dd2f1920d7df6"

RPROVIDES:${PN} += "libabsl-status.so.2608.0.0 \
libabsl-status2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-leak-check.so.2608.0.0 \
libabsl-strerror.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
