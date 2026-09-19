SUMMARY = "GTK+ 3 support for the Greybird-geeko theme"
DESCRIPTION = "This package provides the GTK+ 3 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.4+git0.c1d46c3"

RPM_NAME = "gtk3-metatheme-greybird-geeko-3.23.4+git0.c1d46c3-1.5.noarch.rpm"
RPM_HASH = "3fd9c388d9e5a6d63bd9054d25f4736c6155b14d76e45432832d5de497494c28621366ca6e80414ffa493987cb5162603663216936ba1e258d47c8ecf903a611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-greybird-geeko"

RDEPENDS:${PN} += "metatheme-greybird-geeko-common"

inherit rpm
