SUMMARY = "Translations for package knights"
DESCRIPTION = "Provides translations for the 'knights' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "knights-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1b3a76e8fdf780bf9b7d99f444bff00e555d7022e4452d5458a8d5b6d3887c1f2a823c44570d44e3ad013bca828519f5aa2a45073cf85a2df8d1c22b774d6911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knights-lang \
knights-lang-all \
locale-knights-ar \
locale-knights-ast \
locale-knights-bg \
locale-knights-bs \
locale-knights-ca \
locale-knights-ca@valencia \
locale-knights-cs \
locale-knights-da \
locale-knights-de \
locale-knights-el \
locale-knights-en-GB \
locale-knights-eo \
locale-knights-es \
locale-knights-et \
locale-knights-eu \
locale-knights-fa \
locale-knights-fi \
locale-knights-fr \
locale-knights-ga \
locale-knights-gl \
locale-knights-he \
locale-knights-hi \
locale-knights-hu \
locale-knights-ia \
locale-knights-id \
locale-knights-it \
locale-knights-ja \
locale-knights-ka \
locale-knights-km \
locale-knights-ko \
locale-knights-lt \
locale-knights-lv \
locale-knights-ml \
locale-knights-mr \
locale-knights-nb \
locale-knights-nds \
locale-knights-nl \
locale-knights-nn \
locale-knights-pl \
locale-knights-pt \
locale-knights-pt-BR \
locale-knights-ro \
locale-knights-ru \
locale-knights-sk \
locale-knights-sl \
locale-knights-sr \
locale-knights-sr@ijekavian \
locale-knights-sr@ijekavianlatin \
locale-knights-sr@latin \
locale-knights-sv \
locale-knights-tr \
locale-knights-ug \
locale-knights-uk \
locale-knights-zh-CN \
locale-knights-zh-TW"

RDEPENDS:${PN} += "knights"

inherit rpm
