SUMMARY = "Abseil library liblibabsl_str_format_internal"
DESCRIPTION = "This package contains the libabsl_str_format_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_str_format_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "1df8edda475a5035327d476053773af80adacdc23ee39a3edb2c43158a47fd7bb3fc77fd9b02de601816f0dd2a90af070f43ef916945b7836db91429f97d002e"

RPROVIDES:${PN} += "libabsl-str-format-internal.so.2608.0.0 \
libabsl-str-format-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-int128.so.2608.0.0 \
libabsl-strings-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
