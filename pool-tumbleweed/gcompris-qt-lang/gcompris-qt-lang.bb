SUMMARY = "Translations for package gcompris-qt"
DESCRIPTION = "Provides translations for the 'gcompris-qt' package."
LICENSE = "AGPL-3.0-or-later & CC-BY-4.0 & Apache-2.0 & MPL-2.0 & OFL-1.1 & GFDL-1.2-or-later & MIT & CC0-1.0 & BSD-2-Clause & BSD-3-Clause"

PV = "26.1"

RPM_NAME = "gcompris-qt-lang-26.1-1.2.noarch.rpm"
RPM_HASH = "f5c68295125d39ec2aeea52faa3d4e6a816e7235f7643feaf40e2c9219727b9d311ec53ee04f6613ce9f9e718a42cdfea173fc68f19dda2f99cfeed6b89800d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-lang \
gcompris-qt-lang-all"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
