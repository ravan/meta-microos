SUMMARY = "Translations for package colord-gtk"
DESCRIPTION = "Provides translations for the 'colord-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "colord-gtk-lang-0.3.1-1.6.noarch.rpm"
RPM_HASH = "ecc3a104e29438bf2570af4c1581e65d8d92f366ae515f21ce5325d2f17c155cb662310d3aa782d0ac48329622bc65b8448c504bcddd33fe9cf56245e2fa495e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-lang \
colord-gtk-lang-all \
locale-colord-gtk-en-GB \
locale-colord-gtk-ka"

RDEPENDS:${PN} += "colord-gtk"

inherit rpm
