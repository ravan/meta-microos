SUMMARY = "Translations for package kdiamond"
DESCRIPTION = "Provides translations for the 'kdiamond' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdiamond-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5b551c5db50cc143957ed682181ab73eeb08131d06fda692101a30e397b2941539ce8e99d3bbddb9bda836ef8bc97e988ef4d1f4f3bfce02b0f8d0a7f1c240de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdiamond-lang \
kdiamond-lang-all \
locale-kdiamond-ar \
locale-kdiamond-ast \
locale-kdiamond-bg \
locale-kdiamond-bs \
locale-kdiamond-ca \
locale-kdiamond-ca@valencia \
locale-kdiamond-cs \
locale-kdiamond-da \
locale-kdiamond-de \
locale-kdiamond-el \
locale-kdiamond-en-GB \
locale-kdiamond-eo \
locale-kdiamond-es \
locale-kdiamond-et \
locale-kdiamond-eu \
locale-kdiamond-fi \
locale-kdiamond-fr \
locale-kdiamond-ga \
locale-kdiamond-gl \
locale-kdiamond-gu \
locale-kdiamond-he \
locale-kdiamond-hi \
locale-kdiamond-hr \
locale-kdiamond-hu \
locale-kdiamond-ia \
locale-kdiamond-id \
locale-kdiamond-is \
locale-kdiamond-it \
locale-kdiamond-ja \
locale-kdiamond-ka \
locale-kdiamond-kk \
locale-kdiamond-km \
locale-kdiamond-ko \
locale-kdiamond-lt \
locale-kdiamond-lv \
locale-kdiamond-mai \
locale-kdiamond-ml \
locale-kdiamond-mr \
locale-kdiamond-nb \
locale-kdiamond-nds \
locale-kdiamond-nl \
locale-kdiamond-nn \
locale-kdiamond-pl \
locale-kdiamond-pt \
locale-kdiamond-pt-BR \
locale-kdiamond-ro \
locale-kdiamond-ru \
locale-kdiamond-sk \
locale-kdiamond-sl \
locale-kdiamond-sq \
locale-kdiamond-sr \
locale-kdiamond-sr@ijekavian \
locale-kdiamond-sr@ijekavianlatin \
locale-kdiamond-sr@latin \
locale-kdiamond-sv \
locale-kdiamond-th \
locale-kdiamond-tr \
locale-kdiamond-ug \
locale-kdiamond-uk \
locale-kdiamond-zh-CN \
locale-kdiamond-zh-TW"

RDEPENDS:${PN} += "kdiamond"

inherit rpm
