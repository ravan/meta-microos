SUMMARY = "Translations for package wol"
DESCRIPTION = "Provides translations for the 'wol' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-lang-0.7.1-165.3.noarch.rpm"
RPM_HASH = "95fda5d09629269e6431fb871358b941ef170bcca41a0e8e4b6b37ea0edcaf8cdd6028ab185deb43672562615b80ac3af81798afef73e4ec60d160ba16e11083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wol-de \
locale-wol-es \
locale-wol-fr \
locale-wol-it \
locale-wol-sv \
wol-lang \
wol-lang-all"

RDEPENDS:${PN} += "wol"

inherit rpm
