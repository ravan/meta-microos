SUMMARY = "Translations for package kapptemplate"
DESCRIPTION = "Provides translations for the 'kapptemplate' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kapptemplate-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cac9a1f77b93a1e9067ec86a2b5e3400ebd05be434a41ab54b208fc683ba1eb2b6f41d5e9a3b7621d8ebbb784a4138a4e66c9994b02b8618ef25e9a3ec838ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapptemplate-lang \
kapptemplate-lang-all \
locale-kapptemplate-ar \
locale-kapptemplate-ast \
locale-kapptemplate-bs \
locale-kapptemplate-ca \
locale-kapptemplate-ca@valencia \
locale-kapptemplate-cs \
locale-kapptemplate-da \
locale-kapptemplate-de \
locale-kapptemplate-el \
locale-kapptemplate-en-GB \
locale-kapptemplate-eo \
locale-kapptemplate-es \
locale-kapptemplate-et \
locale-kapptemplate-eu \
locale-kapptemplate-fi \
locale-kapptemplate-fr \
locale-kapptemplate-ga \
locale-kapptemplate-gl \
locale-kapptemplate-he \
locale-kapptemplate-hi \
locale-kapptemplate-hu \
locale-kapptemplate-ia \
locale-kapptemplate-it \
locale-kapptemplate-ja \
locale-kapptemplate-ka \
locale-kapptemplate-kk \
locale-kapptemplate-ko \
locale-kapptemplate-lt \
locale-kapptemplate-lv \
locale-kapptemplate-mr \
locale-kapptemplate-nb \
locale-kapptemplate-nds \
locale-kapptemplate-nl \
locale-kapptemplate-nn \
locale-kapptemplate-pl \
locale-kapptemplate-pt \
locale-kapptemplate-pt-BR \
locale-kapptemplate-ru \
locale-kapptemplate-sk \
locale-kapptemplate-sl \
locale-kapptemplate-sq \
locale-kapptemplate-sr \
locale-kapptemplate-sr@ijekavian \
locale-kapptemplate-sr@ijekavianlatin \
locale-kapptemplate-sr@latin \
locale-kapptemplate-sv \
locale-kapptemplate-th \
locale-kapptemplate-tr \
locale-kapptemplate-ug \
locale-kapptemplate-uk \
locale-kapptemplate-zh-CN \
locale-kapptemplate-zh-TW"

RDEPENDS:${PN} += "kapptemplate"

inherit rpm
