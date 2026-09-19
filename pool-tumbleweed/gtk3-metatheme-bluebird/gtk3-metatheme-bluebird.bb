SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- GTK+ 3 Support"
DESCRIPTION = "The Bluebird Theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the GTK+ 3 support of Bluebird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "gtk3-metatheme-bluebird-1.3-3.6.noarch.rpm"
RPM_HASH = "29229c1246588a7b09ead48c120f3ea72da6585a6547594a2ac964c1fd00458b5af348915531de7d947b761adab4de51b0d84f99b8c96a6e5554f7d431e3321b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-bluebird"

RDEPENDS:${PN} += "metatheme-bluebird-common"

inherit rpm
