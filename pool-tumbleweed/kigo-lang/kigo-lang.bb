SUMMARY = "Translations for package kigo"
DESCRIPTION = "Provides translations for the 'kigo' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kigo-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4f04a35b3ebc64e0e479b209d3d300f0d8cadfaf9d56f5f862ad62f752d2ed886b5d80cf7c4dc401c2450c03cdfb839f8e526f61efe9b7f4905f1891a90d4788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kigo-lang \
kigo-lang-all \
locale-kigo-ar \
locale-kigo-ast \
locale-kigo-bs \
locale-kigo-ca \
locale-kigo-ca@valencia \
locale-kigo-cs \
locale-kigo-da \
locale-kigo-de \
locale-kigo-el \
locale-kigo-en-GB \
locale-kigo-eo \
locale-kigo-es \
locale-kigo-et \
locale-kigo-eu \
locale-kigo-fi \
locale-kigo-fr \
locale-kigo-ga \
locale-kigo-gl \
locale-kigo-he \
locale-kigo-hi \
locale-kigo-hr \
locale-kigo-hu \
locale-kigo-ia \
locale-kigo-id \
locale-kigo-is \
locale-kigo-it \
locale-kigo-ja \
locale-kigo-ka \
locale-kigo-kk \
locale-kigo-km \
locale-kigo-ko \
locale-kigo-lt \
locale-kigo-lv \
locale-kigo-mai \
locale-kigo-ml \
locale-kigo-mr \
locale-kigo-ms \
locale-kigo-nb \
locale-kigo-nds \
locale-kigo-nl \
locale-kigo-nn \
locale-kigo-pl \
locale-kigo-pt \
locale-kigo-pt-BR \
locale-kigo-ro \
locale-kigo-ru \
locale-kigo-sk \
locale-kigo-sl \
locale-kigo-sr \
locale-kigo-sr@ijekavian \
locale-kigo-sr@ijekavianlatin \
locale-kigo-sr@latin \
locale-kigo-sv \
locale-kigo-th \
locale-kigo-tr \
locale-kigo-ug \
locale-kigo-uk \
locale-kigo-zh-CN \
locale-kigo-zh-TW"

RDEPENDS:${PN} += "kigo"

inherit rpm
