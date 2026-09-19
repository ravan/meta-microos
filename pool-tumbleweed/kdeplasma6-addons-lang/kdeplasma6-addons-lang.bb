SUMMARY = "Translations for package kdeplasma6-addons"
DESCRIPTION = "Provides translations for the 'kdeplasma6-addons' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "kdeplasma6-addons-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "e601247fce6807754a8c9a9429c395ce59bb8794a5ab543f3b55b32adf89986848c0a37ea35e2ebfc4884d3945af20293afb7103c1eee1dfee696cefb3bcb952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeplasma6-addons-lang \
kdeplasma6-addons-lang-all \
locale-kdeplasma6-addons-ar \
locale-kdeplasma6-addons-ast \
locale-kdeplasma6-addons-az \
locale-kdeplasma6-addons-be \
locale-kdeplasma6-addons-bg \
locale-kdeplasma6-addons-bs \
locale-kdeplasma6-addons-ca \
locale-kdeplasma6-addons-ca@valencia \
locale-kdeplasma6-addons-cs \
locale-kdeplasma6-addons-da \
locale-kdeplasma6-addons-de \
locale-kdeplasma6-addons-el \
locale-kdeplasma6-addons-en-GB \
locale-kdeplasma6-addons-eo \
locale-kdeplasma6-addons-es \
locale-kdeplasma6-addons-et \
locale-kdeplasma6-addons-eu \
locale-kdeplasma6-addons-fi \
locale-kdeplasma6-addons-fr \
locale-kdeplasma6-addons-ga \
locale-kdeplasma6-addons-gl \
locale-kdeplasma6-addons-he \
locale-kdeplasma6-addons-hi \
locale-kdeplasma6-addons-hr \
locale-kdeplasma6-addons-hu \
locale-kdeplasma6-addons-ia \
locale-kdeplasma6-addons-id \
locale-kdeplasma6-addons-is \
locale-kdeplasma6-addons-it \
locale-kdeplasma6-addons-ja \
locale-kdeplasma6-addons-ka \
locale-kdeplasma6-addons-kk \
locale-kdeplasma6-addons-km \
locale-kdeplasma6-addons-ko \
locale-kdeplasma6-addons-lt \
locale-kdeplasma6-addons-lv \
locale-kdeplasma6-addons-ml \
locale-kdeplasma6-addons-mr \
locale-kdeplasma6-addons-ms \
locale-kdeplasma6-addons-nb \
locale-kdeplasma6-addons-nds \
locale-kdeplasma6-addons-nl \
locale-kdeplasma6-addons-nn \
locale-kdeplasma6-addons-pa \
locale-kdeplasma6-addons-pl \
locale-kdeplasma6-addons-pt \
locale-kdeplasma6-addons-pt-BR \
locale-kdeplasma6-addons-ro \
locale-kdeplasma6-addons-ru \
locale-kdeplasma6-addons-sk \
locale-kdeplasma6-addons-sl \
locale-kdeplasma6-addons-sq \
locale-kdeplasma6-addons-sr \
locale-kdeplasma6-addons-sr@ijekavian \
locale-kdeplasma6-addons-sr@ijekavianlatin \
locale-kdeplasma6-addons-sr@latin \
locale-kdeplasma6-addons-sv \
locale-kdeplasma6-addons-ta \
locale-kdeplasma6-addons-th \
locale-kdeplasma6-addons-tr \
locale-kdeplasma6-addons-ug \
locale-kdeplasma6-addons-uk \
locale-kdeplasma6-addons-vi \
locale-kdeplasma6-addons-wa \
locale-kdeplasma6-addons-zh-CN \
locale-kdeplasma6-addons-zh-TW"

RDEPENDS:${PN} += "kdeplasma6-addons"

inherit rpm
