SUMMARY = "Translations for package gwenview"
DESCRIPTION = "Provides translations for the 'gwenview' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "gwenview-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "dc203a9dfa27ff25470b57d7fe0d061c4354b9e4eb80292d92e02e5070429d3c01c7effdbfd17bceb45982d5f857277c0af15553220ac8c69943b53ca12f8ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gwenview-lang \
gwenview-lang-all \
locale-gwenview-ar \
locale-gwenview-ast \
locale-gwenview-az \
locale-gwenview-be \
locale-gwenview-bg \
locale-gwenview-bn \
locale-gwenview-bs \
locale-gwenview-ca \
locale-gwenview-ca@valencia \
locale-gwenview-cs \
locale-gwenview-da \
locale-gwenview-de \
locale-gwenview-el \
locale-gwenview-en-GB \
locale-gwenview-eo \
locale-gwenview-es \
locale-gwenview-et \
locale-gwenview-eu \
locale-gwenview-fa \
locale-gwenview-fi \
locale-gwenview-fr \
locale-gwenview-ga \
locale-gwenview-gl \
locale-gwenview-he \
locale-gwenview-hi \
locale-gwenview-hr \
locale-gwenview-hu \
locale-gwenview-ia \
locale-gwenview-id \
locale-gwenview-is \
locale-gwenview-it \
locale-gwenview-ja \
locale-gwenview-ka \
locale-gwenview-kk \
locale-gwenview-km \
locale-gwenview-ko \
locale-gwenview-lt \
locale-gwenview-lv \
locale-gwenview-ml \
locale-gwenview-mr \
locale-gwenview-nb \
locale-gwenview-nds \
locale-gwenview-nl \
locale-gwenview-nn \
locale-gwenview-oc \
locale-gwenview-pa \
locale-gwenview-pl \
locale-gwenview-pt \
locale-gwenview-pt-BR \
locale-gwenview-ro \
locale-gwenview-ru \
locale-gwenview-sk \
locale-gwenview-sl \
locale-gwenview-sq \
locale-gwenview-sr \
locale-gwenview-sr@ijekavian \
locale-gwenview-sr@ijekavianlatin \
locale-gwenview-sr@latin \
locale-gwenview-sv \
locale-gwenview-ta \
locale-gwenview-th \
locale-gwenview-tr \
locale-gwenview-ug \
locale-gwenview-uk \
locale-gwenview-wa \
locale-gwenview-zh-CN \
locale-gwenview-zh-TW"

RDEPENDS:${PN} += "gwenview"

inherit rpm
