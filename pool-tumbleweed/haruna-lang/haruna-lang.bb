SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "1.8.1"

RPM_NAME = "haruna-lang-1.8.1-1.6.noarch.rpm"
RPM_HASH = "22db2487cf72a1f9abfed16da97b169918766a25503a6a9394edab356d4241330ba909975ae4e8607321264750b1890bef8eb4c305802faa1de952a1b743b158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haruna-lang \
haruna-lang-all \
locale-haruna-ar \
locale-haruna-ast \
locale-haruna-ca \
locale-haruna-ca@valencia \
locale-haruna-cs \
locale-haruna-de \
locale-haruna-en-GB \
locale-haruna-eo \
locale-haruna-es \
locale-haruna-eu \
locale-haruna-fi \
locale-haruna-fr \
locale-haruna-ga \
locale-haruna-gl \
locale-haruna-he \
locale-haruna-hi \
locale-haruna-ia \
locale-haruna-id \
locale-haruna-it \
locale-haruna-ja \
locale-haruna-ka \
locale-haruna-ko \
locale-haruna-lt \
locale-haruna-lv \
locale-haruna-nl \
locale-haruna-pl \
locale-haruna-pt \
locale-haruna-pt-BR \
locale-haruna-ro \
locale-haruna-ru \
locale-haruna-sk \
locale-haruna-sl \
locale-haruna-sv \
locale-haruna-ta \
locale-haruna-tr \
locale-haruna-uk \
locale-haruna-zh-CN \
locale-haruna-zh-TW"

RDEPENDS:${PN} += "haruna"

inherit rpm
