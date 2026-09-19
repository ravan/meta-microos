SUMMARY = "Translations for package milou6"
DESCRIPTION = "Provides translations for the 'milou6' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "milou6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "af9e984e5c06d298adab440bc69b8b32480233ce3e5d5d5dddd01c2f79c98ec142d11fd21eb57e4603fee0ff3a0c33f52504a4b10d73314061036081fc58656d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-milou6-ar \
locale-milou6-ast \
locale-milou6-bg \
locale-milou6-bs \
locale-milou6-ca \
locale-milou6-ca@valencia \
locale-milou6-cs \
locale-milou6-da \
locale-milou6-de \
locale-milou6-el \
locale-milou6-en-GB \
locale-milou6-eo \
locale-milou6-es \
locale-milou6-et \
locale-milou6-eu \
locale-milou6-fi \
locale-milou6-fr \
locale-milou6-ga \
locale-milou6-gl \
locale-milou6-he \
locale-milou6-hi \
locale-milou6-hu \
locale-milou6-ia \
locale-milou6-id \
locale-milou6-it \
locale-milou6-ja \
locale-milou6-ka \
locale-milou6-ko \
locale-milou6-lt \
locale-milou6-lv \
locale-milou6-ml \
locale-milou6-nb \
locale-milou6-nds \
locale-milou6-nl \
locale-milou6-nn \
locale-milou6-pa \
locale-milou6-pl \
locale-milou6-pt \
locale-milou6-pt-BR \
locale-milou6-ro \
locale-milou6-ru \
locale-milou6-sk \
locale-milou6-sl \
locale-milou6-sr \
locale-milou6-sr@ijekavian \
locale-milou6-sr@ijekavianlatin \
locale-milou6-sr@latin \
locale-milou6-sv \
locale-milou6-ta \
locale-milou6-tr \
locale-milou6-uk \
locale-milou6-zh-CN \
locale-milou6-zh-TW \
milou6-lang \
milou6-lang-all"

RDEPENDS:${PN} += "milou6"

inherit rpm
