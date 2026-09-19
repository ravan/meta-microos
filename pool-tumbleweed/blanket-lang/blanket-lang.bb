SUMMARY = "Translations for package blanket"
DESCRIPTION = "Provides translations for the 'blanket' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "blanket-lang-0.8.0-1.5.noarch.rpm"
RPM_HASH = "cb381b4cb7a27d7b6855f13c33caa966797fc395f747e4fe7041d3785ae412c6e9a4ad90c7468a8fb1efc2af1de6ff89cf5f4ca6693c191c1f380c2f67c7d587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blanket-lang \
blanket-lang-all \
locale-blanket-ar \
locale-blanket-be \
locale-blanket-bg \
locale-blanket-bn \
locale-blanket-ca \
locale-blanket-cs \
locale-blanket-da \
locale-blanket-de \
locale-blanket-el \
locale-blanket-en-GB \
locale-blanket-en-US \
locale-blanket-eo \
locale-blanket-es \
locale-blanket-et \
locale-blanket-eu \
locale-blanket-fa \
locale-blanket-fi \
locale-blanket-fr \
locale-blanket-ga \
locale-blanket-gl \
locale-blanket-he \
locale-blanket-hi \
locale-blanket-hr \
locale-blanket-hu \
locale-blanket-ia \
locale-blanket-id \
locale-blanket-it \
locale-blanket-ja \
locale-blanket-ka \
locale-blanket-ko \
locale-blanket-lt \
locale-blanket-nb-NO \
locale-blanket-ne \
locale-blanket-nl \
locale-blanket-oc \
locale-blanket-pl \
locale-blanket-pt \
locale-blanket-pt-BR \
locale-blanket-ro \
locale-blanket-ru \
locale-blanket-sk \
locale-blanket-sq \
locale-blanket-sr \
locale-blanket-sv \
locale-blanket-ta \
locale-blanket-tr \
locale-blanket-uk \
locale-blanket-zh-CN \
locale-blanket-zh-TW"

RDEPENDS:${PN} += "blanket"

inherit rpm
