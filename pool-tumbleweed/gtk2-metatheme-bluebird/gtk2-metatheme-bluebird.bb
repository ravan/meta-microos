SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- GTK+ 2 Support"
DESCRIPTION = "The Bluebird Theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the GTK+ 2 support of Bluebird."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "gtk2-metatheme-bluebird-1.3-3.6.noarch.rpm"
RPM_HASH = "2d141fb802eb16aa2238a4667dbdcd5cc5e5bac48f7e7a98df6f077006194e0deafee785d18f412592add96e673dc2510402fd1245a7f6f735aec5e1b276ec84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-bluebird"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-bluebird-common"

inherit rpm
