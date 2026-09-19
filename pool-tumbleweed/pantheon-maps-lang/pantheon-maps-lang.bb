SUMMARY = "Translations for package pantheon-maps"
DESCRIPTION = "Provides translations for the 'pantheon-maps' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-maps-lang-8.1.0-1.4.noarch.rpm"
RPM_HASH = "8bf9cb1663c049e85163ceeeccddbceda40a20da966f5e84c67c7e9628255dd77fb91f49633fd8f740d5b2dfda4f14e42e5d620cf33a4cedd2c6e02cb5ae8787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-maps-ca \
locale-pantheon-maps-de \
locale-pantheon-maps-es \
locale-pantheon-maps-et \
locale-pantheon-maps-fi \
locale-pantheon-maps-fr \
locale-pantheon-maps-hi \
locale-pantheon-maps-hu \
locale-pantheon-maps-it \
locale-pantheon-maps-ja \
locale-pantheon-maps-lt \
locale-pantheon-maps-nb-NO \
locale-pantheon-maps-nl \
locale-pantheon-maps-pl \
locale-pantheon-maps-pt \
locale-pantheon-maps-pt-BR \
locale-pantheon-maps-ru \
locale-pantheon-maps-sk \
locale-pantheon-maps-ta \
locale-pantheon-maps-tr \
locale-pantheon-maps-uk \
locale-pantheon-maps-zh-CN \
locale-pantheon-maps-zh-TW \
pantheon-maps-lang \
pantheon-maps-lang-all"

RDEPENDS:${PN} += "pantheon-maps"

inherit rpm
