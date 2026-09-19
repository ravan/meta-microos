SUMMARY = "Translations for package mailcommon"
DESCRIPTION = "Provides translations for the 'mailcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mailcommon-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "208108062456799bc4d35de0e6404cf409413693e3157cc483053c75b1111816eb0b0f5a80c68bac585bfa9a2d352e12aa88ef3cac53b71f9fd7e9a680dac743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mailcommon-ar \
locale-mailcommon-ast \
locale-mailcommon-bg \
locale-mailcommon-bs \
locale-mailcommon-ca \
locale-mailcommon-ca@valencia \
locale-mailcommon-cs \
locale-mailcommon-da \
locale-mailcommon-de \
locale-mailcommon-el \
locale-mailcommon-en-GB \
locale-mailcommon-eo \
locale-mailcommon-es \
locale-mailcommon-et \
locale-mailcommon-eu \
locale-mailcommon-fi \
locale-mailcommon-fr \
locale-mailcommon-ga \
locale-mailcommon-gl \
locale-mailcommon-he \
locale-mailcommon-hi \
locale-mailcommon-hr \
locale-mailcommon-hu \
locale-mailcommon-ia \
locale-mailcommon-it \
locale-mailcommon-ja \
locale-mailcommon-ka \
locale-mailcommon-kk \
locale-mailcommon-ko \
locale-mailcommon-lt \
locale-mailcommon-lv \
locale-mailcommon-mr \
locale-mailcommon-nb \
locale-mailcommon-nds \
locale-mailcommon-nl \
locale-mailcommon-nn \
locale-mailcommon-pa \
locale-mailcommon-pl \
locale-mailcommon-pt \
locale-mailcommon-pt-BR \
locale-mailcommon-ro \
locale-mailcommon-ru \
locale-mailcommon-sk \
locale-mailcommon-sl \
locale-mailcommon-sr \
locale-mailcommon-sr@ijekavian \
locale-mailcommon-sr@ijekavianlatin \
locale-mailcommon-sr@latin \
locale-mailcommon-sv \
locale-mailcommon-ta \
locale-mailcommon-tr \
locale-mailcommon-ug \
locale-mailcommon-uk \
locale-mailcommon-zh-CN \
locale-mailcommon-zh-TW \
mailcommon-lang \
mailcommon-lang-all"

RDEPENDS:${PN} += "mailcommon"

inherit rpm
