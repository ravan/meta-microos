SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libsmartcols-devel-static-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "e4831e0afbc3a6f222b30de20ed44ee9a41e285d8e8836349046f6f3c10381da042d60d20f54a5e6ff26db68a77f97a9237ab6cec3a23a7e21678121519fa3cf"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
