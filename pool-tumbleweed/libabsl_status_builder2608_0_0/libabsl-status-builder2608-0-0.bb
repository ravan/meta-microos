SUMMARY = "Abseil library liblibabsl_status_builder"
DESCRIPTION = "This package contains the libabsl_status_builder library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_status_builder2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "cc601ad81cbea7ddf67b1f8503862795012b7773ef7216cd7643a652220ac49ccbff4168e95110ea7dc5ffb26f1443e4819dc30d865bc72ce6175b1bac7c5bd4"

RPROVIDES:${PN} += "libabsl-status-builder.so.2608.0.0 \
libabsl-status-builder2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-strings-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
