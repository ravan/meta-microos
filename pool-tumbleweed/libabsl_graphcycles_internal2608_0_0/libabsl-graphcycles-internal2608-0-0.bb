SUMMARY = "Abseil library liblibabsl_graphcycles_internal"
DESCRIPTION = "This package contains the libabsl_graphcycles_internal library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_graphcycles_internal2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "c8814a2cdc62f3c97320acf00594d02206e1418c6bd2ffba9b50f91534c9dd7ea002738ec41129123d10874f981029a483500b055c9d0f8ec42f7a4faa9a2e11"

RPROVIDES:${PN} += "libabsl-graphcycles-internal.so.2608.0.0 \
libabsl-graphcycles-internal2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
libabsl-malloc-internal.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
