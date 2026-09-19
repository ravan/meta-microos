SUMMARY = "Devel package for ESQL"
DESCRIPTION = "ESQL Devel package for GnuCOBOL"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gnucobol-esql-devel-3.2-4.2.aarch64.rpm"
RPM_HASH = "9bfd9b7b40be6b38869080bd560052218cf6620c0de34a63e3f9091768839d1eedeb0c5a00eda09f20724e22f8d9a25f99825d91cbd1560e2b20b0d515985ddd"

RPROVIDES:${PN} += "esql-devel \
gnucobol-esql-devel"

RDEPENDS:${PN} += "esql \
unixODBC"

inherit rpm
