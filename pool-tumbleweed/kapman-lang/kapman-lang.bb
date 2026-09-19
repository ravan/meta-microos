SUMMARY = "Translations for package kapman"
DESCRIPTION = "Provides translations for the 'kapman' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kapman-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "3286f24089a3bc8e7d1d5a093a843c95c4e6297cea24279f76b7905a7d3eb23d8257871d0a9cf58c216ce8e440d28380a46c92e1a24b7fe117d2e53f552872df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapman-lang \
kapman-lang-all \
locale-kapman-ar \
locale-kapman-ast \
locale-kapman-bs \
locale-kapman-ca \
locale-kapman-ca@valencia \
locale-kapman-cs \
locale-kapman-da \
locale-kapman-de \
locale-kapman-el \
locale-kapman-en-GB \
locale-kapman-eo \
locale-kapman-es \
locale-kapman-et \
locale-kapman-eu \
locale-kapman-fi \
locale-kapman-fr \
locale-kapman-ga \
locale-kapman-gl \
locale-kapman-gu \
locale-kapman-he \
locale-kapman-hi \
locale-kapman-hr \
locale-kapman-hu \
locale-kapman-ia \
locale-kapman-id \
locale-kapman-is \
locale-kapman-it \
locale-kapman-ja \
locale-kapman-ka \
locale-kapman-kk \
locale-kapman-km \
locale-kapman-ko \
locale-kapman-lt \
locale-kapman-lv \
locale-kapman-mai \
locale-kapman-ml \
locale-kapman-mr \
locale-kapman-ms \
locale-kapman-nb \
locale-kapman-nds \
locale-kapman-nl \
locale-kapman-nn \
locale-kapman-pl \
locale-kapman-pt \
locale-kapman-pt-BR \
locale-kapman-ro \
locale-kapman-ru \
locale-kapman-sk \
locale-kapman-sl \
locale-kapman-sq \
locale-kapman-sr \
locale-kapman-sr@ijekavian \
locale-kapman-sr@ijekavianlatin \
locale-kapman-sr@latin \
locale-kapman-sv \
locale-kapman-th \
locale-kapman-tr \
locale-kapman-ug \
locale-kapman-uk \
locale-kapman-zh-CN \
locale-kapman-zh-TW"

RDEPENDS:${PN} += "kapman"

inherit rpm
