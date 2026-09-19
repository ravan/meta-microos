SUMMARY = "Translations for package luanti"
DESCRIPTION = "Provides translations for the 'luanti' package."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.17.0"

RPM_NAME = "luanti-lang-5.17.0-1.2.noarch.rpm"
RPM_HASH = "edbd6df205004e25657d112f9dfc780b47e3875301aa6a3257f2d47ea7cd7c49bcbfd2319f565b6ca5aa4ec77bdef25d39a6d77a6ef68d6dd0bb98e7f47d2bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-luanti-az \
locale-luanti-be \
locale-luanti-bg \
locale-luanti-br \
locale-luanti-ca \
locale-luanti-cs \
locale-luanti-cy \
locale-luanti-da \
locale-luanti-de \
locale-luanti-el \
locale-luanti-eo \
locale-luanti-es \
locale-luanti-et \
locale-luanti-eu \
locale-luanti-fa \
locale-luanti-fi \
locale-luanti-fr \
locale-luanti-ga \
locale-luanti-gd \
locale-luanti-gl \
locale-luanti-hu \
locale-luanti-id \
locale-luanti-it \
locale-luanti-ja \
locale-luanti-ka \
locale-luanti-kk \
locale-luanti-ko \
locale-luanti-lt \
locale-luanti-lv \
locale-luanti-mr \
locale-luanti-ms \
locale-luanti-nb \
locale-luanti-nl \
locale-luanti-nn \
locale-luanti-oc \
locale-luanti-pl \
locale-luanti-pt \
locale-luanti-pt-BR \
locale-luanti-ro \
locale-luanti-ru \
locale-luanti-sk \
locale-luanti-sl \
locale-luanti-sr \
locale-luanti-sv \
locale-luanti-ta \
locale-luanti-tr \
locale-luanti-uk \
locale-luanti-vi \
locale-luanti-zh-CN \
locale-luanti-zh-TW \
luanti-lang \
luanti-lang-all"

RDEPENDS:${PN} += "luanti"

inherit rpm
