SUMMARY = "GTK+ 2 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 2 support of Greybird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "3.23.4+git0.7e4507d"

RPM_NAME = "gtk2-metatheme-greybird-3.23.4+git0.7e4507d-1.5.noarch.rpm"
RPM_HASH = "933c2138de67af3fea7c40a9e6726298f6dc1ce09165f32682db87d3d3d2c5f4b55b2113da70e9faf330c56cb0a2d2f862cad9ec7eb2572cadc43756f3e95565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-greybird"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-greybird-common"

inherit rpm
