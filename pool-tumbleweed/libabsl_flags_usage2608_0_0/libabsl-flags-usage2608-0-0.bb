SUMMARY = "Abseil library liblibabsl_flags_usage"
DESCRIPTION = "This package contains the libabsl_flags_usage library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_flags_usage2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "e2cbd3ca05e6d98ce7c0b04443fdc7f9a8806622559d2e9d595276655130de39ab746bf13cba253c2b7342dcb24c84859771f605b343551ddc04ae8eab986fbc"

RPROVIDES:${PN} += "libabsl-flags-usage.so.2608.0.0 \
libabsl-flags-usage2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
