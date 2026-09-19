SUMMARY = "Translations for package solaar"
DESCRIPTION = "Provides translations for the 'solaar' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.20"

RPM_NAME = "solaar-lang-1.1.20-1.1.noarch.rpm"
RPM_HASH = "b213ef06a8b162b0b259758e19555c42a867aee857ae6ce0451384a90ad9c315136d662b96e67e9e8af3734549a09756998535b8a8da11bb751c8afe82970a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-solaar-bg \
locale-solaar-ca \
locale-solaar-cs \
locale-solaar-da \
locale-solaar-de \
locale-solaar-el \
locale-solaar-es \
locale-solaar-fi \
locale-solaar-fr \
locale-solaar-ga \
locale-solaar-hr \
locale-solaar-id \
locale-solaar-it \
locale-solaar-ja \
locale-solaar-ka \
locale-solaar-nb \
locale-solaar-nl \
locale-solaar-nn \
locale-solaar-pl \
locale-solaar-pt \
locale-solaar-pt-BR \
locale-solaar-ro \
locale-solaar-ru \
locale-solaar-sk \
locale-solaar-sr \
locale-solaar-sv \
locale-solaar-tr \
locale-solaar-uk \
locale-solaar-zh-CN \
locale-solaar-zh-TW \
solaar-lang \
solaar-lang-all"

RDEPENDS:${PN} += "solaar"

inherit rpm
