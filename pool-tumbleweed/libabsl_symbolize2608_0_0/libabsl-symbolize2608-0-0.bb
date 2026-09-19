SUMMARY = "Abseil library liblibabsl_symbolize"
DESCRIPTION = "This package contains the libabsl_symbolize library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_symbolize2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "df31910d460e1d3bc894ea0aba14cf71a567a8700c7633e0cb7dbe52e78588f3f718268bcdc21d52e6b4cccdbc21580b7d6ca93abdb52ad1e1b823e5eaab8220"

RPROVIDES:${PN} += "libabsl-symbolize.so.2608.0.0 \
libabsl-symbolize2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-debugging-internal.so.2608.0.0 \
libabsl-demangle-internal.so.2608.0.0 \
libabsl-malloc-internal.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
