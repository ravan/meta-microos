SUMMARY = "Development files for dnf5"
DESCRIPTION = "Develpment files for dnf5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "dnf5-devel-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "a38334d24e194e2faf17927bb9a3f31c14ab576066ce39e2d8126a6be69d2a72fac830ee6613c9009ba05050c1410bcc7da0777e22f2165d16cd59daa1b2d436"

RPROVIDES:${PN} += "dnf5-devel"

RDEPENDS:${PN} += "dnf5 \
libdnf5-cli-devel \
libdnf5-devel"

inherit rpm
