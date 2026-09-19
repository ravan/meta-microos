SUMMARY = "Development headers for the M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
This package allows you to write programs against libmbus."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-devel-0.9.0+59-1.15.aarch64.rpm"
RPM_HASH = "1366ad39d1e8d369b52871d03f6132668a12015baa58f2a7ea63e12bdfdfde076e4c054da7366edce7a6fc781d235b37cc9357a57627cfd239a78c87ef1cdabe"

RPROVIDES:${PN} += "libmbus-devel \
pkgconfig-libmbus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbus0"

inherit rpm
