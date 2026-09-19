SUMMARY = "Translations for package pidgin-plugin-indicator"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-indicator' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "pidgin-plugin-indicator-lang-1.0.2-1.5.noarch.rpm"
RPM_HASH = "cad2014417ea8805aa1aa18eac5d567a714a21d31aa341cc9dc0cf6d5346bc528c609d389cae73efaf84f53386cb5e541d87afe68a86c2c03914db061e125038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-indicator-de \
locale-pidgin-plugin-indicator-es \
locale-pidgin-plugin-indicator-hu \
locale-pidgin-plugin-indicator-ru \
locale-pidgin-plugin-indicator-zh-CN \
pidgin-plugin-indicator-lang \
pidgin-plugin-indicator-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-indicator"

inherit rpm
