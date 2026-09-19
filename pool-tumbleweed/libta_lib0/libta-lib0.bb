SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta_lib0-0.4.0-1.20.aarch64.rpm"
RPM_HASH = "5b16b65cf1597f50a5b9547c851f115b543c766d6a8bfaa93c7c7b3733e4a3caa90f9e1dabb65a47f4d9582354fb9e47791f0000903e28a1e2f95744094938ce"

RPROVIDES:${PN} += "libta-lib.so.0 \
libta-lib0 \
libta0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
