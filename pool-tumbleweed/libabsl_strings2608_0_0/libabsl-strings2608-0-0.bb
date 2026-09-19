SUMMARY = "Abseil library liblibabsl_strings"
DESCRIPTION = "This package contains the libabsl_strings library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_strings2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "a0fc989b82db7728f472beefee425eb69ab6e3b0969bf6791aa26801647b4a7e50414267c99cf8d0d8268139512c9e113ce9f014691bd5af3d18a04d0f1dc204"

RPROVIDES:${PN} += "libabsl-strings.so.2608.0.0 \
libabsl-strings2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-strings-internal.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
