SUMMARY = "Translations for package gnunet"
DESCRIPTION = "Provides translations for the 'gnunet' package."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "gnunet-lang-0.26.2-1.4.noarch.rpm"
RPM_HASH = "e9464900f943a4fc8164a427aae2811b7743f731d8fe70572d1bb6b5d3d11ea05c787b09812d3ba90acec41cc60f6841f10fbefa9a298df7c3a031b7333f55be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnunet-lang \
gnunet-lang-all \
locale-gnunet-de \
locale-gnunet-es \
locale-gnunet-fr \
locale-gnunet-it \
locale-gnunet-sr \
locale-gnunet-sv \
locale-gnunet-vi \
locale-gnunet-zh-CN"

RDEPENDS:${PN} += "gnunet"

inherit rpm
