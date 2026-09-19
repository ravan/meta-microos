SUMMARY = "PSPP Developers Guide"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains development documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "pspp-devel-doc-2.1.1-2.2.noarch.rpm"
RPM_HASH = "e1c9ebebe7c7758bcaff8332caecc6a38ae0b4272cea1a37f429dc2bb3e65388ba3b6ffa844cfc485878332f86d2a7782b5a4ec014f975cc44795c0e3241be0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pspp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
