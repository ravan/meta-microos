SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta-devel-0.4.0-1.20.aarch64.rpm"
RPM_HASH = "2b34c35ec52526931fd6bb8cb053735685eec5124d5bb43807056d9a2f996d3944b7de292c0e11a4ff6adc3cb106235e1082b95d8aaad6fcfbf5bd15cf1c108c"

RPROVIDES:${PN} += "libta-devel \
ta-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libta-lib0"

inherit rpm
