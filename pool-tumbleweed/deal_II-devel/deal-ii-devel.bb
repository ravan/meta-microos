SUMMARY = "Development files for dealii"
DESCRIPTION = "The dealii-devel package contains libraries and header files for \
developing applications that use dealii."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.1"

RPM_NAME = "deal_II-devel-9.7.1-2.2.aarch64.rpm"
RPM_HASH = "0f8788ae3b5eaa6c19fb4fb133a972d1317f10604845cb8f1e3c248c162582a3833da4907107d82d5657fa840e1876ec49574f32eb89cf8e38232339e28e1eb4"

RPROVIDES:${PN} += "cmake-deal.II \
deal-II-devel \
dealii-devel"

RDEPENDS:${PN} += "libdeal-II9-7-1"

inherit rpm
