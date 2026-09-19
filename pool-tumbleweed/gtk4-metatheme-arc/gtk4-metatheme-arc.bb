SUMMARY = "Arc GTK 4 Theme"
DESCRIPTION = "Arc is a flat theme with transparent elements. \
It supports MATE, GNOME, Budgie, Xfce, and Cinnamon. \
 \
This package contains the GTK 4 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "gtk4-metatheme-arc-20221218-1.8.noarch.rpm"
RPM_HASH = "f78ba21a3d8d0dc7b6c4360797ce36ea4169cc4f41797d1c2efa22498afa6eea6b8186d5732244e6aa5cc76437a4529893f394d7dd1bd86f3026a9713fa177ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-arc"

RDEPENDS:${PN} += "gtk4 \
metatheme-arc-common"

inherit rpm
