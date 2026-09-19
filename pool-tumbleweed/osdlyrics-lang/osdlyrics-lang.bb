SUMMARY = "Translations for package osdlyrics"
DESCRIPTION = "Provides translations for the 'osdlyrics' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "osdlyrics-lang-0.5.15-4.4.noarch.rpm"
RPM_HASH = "47866e4d4fe5971409bc91b2c3a4c277627e26190d4b90d5737911beec3440378b6b17b4e3a5f1bbbaadf5e623e688a0b7024f4aa93c8223359900d377d6424d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-osdlyrics-cs \
locale-osdlyrics-de \
locale-osdlyrics-es \
locale-osdlyrics-fr \
locale-osdlyrics-it \
locale-osdlyrics-ms \
locale-osdlyrics-pt-BR \
locale-osdlyrics-ro \
locale-osdlyrics-ru \
locale-osdlyrics-tr \
locale-osdlyrics-uk \
locale-osdlyrics-zh-CN \
locale-osdlyrics-zh-HK \
locale-osdlyrics-zh-TW \
osdlyrics-lang \
osdlyrics-lang-all"

RDEPENDS:${PN} += "osdlyrics"

inherit rpm
