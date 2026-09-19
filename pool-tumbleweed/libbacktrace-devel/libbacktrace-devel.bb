SUMMARY = "Development files for libbacktrace"
DESCRIPTION = "The libbacktrace-devel package contains libraries and header files for developing applications that use libbacktrace."
LICENSE = "BSD-3-Clause"

PV = "1.0+git20260601"

RPM_NAME = "libbacktrace-devel-1.0+git20260601-1.3.aarch64.rpm"
RPM_HASH = "55c5e001eb31aac6d5f548a33e3df22972e41427d5225d227d50bb5efcd5e3d64b0bebfc2cd5433b1d878ad77dedcd07d2800c050762bb2c2fc05ee8b515e304"

RPROVIDES:${PN} += "libbacktrace-devel"

RDEPENDS:${PN} += "libbacktrace0"

inherit rpm
