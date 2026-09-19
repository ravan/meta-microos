SUMMARY = "Translations for package plasma6-desktop"
DESCRIPTION = "Provides translations for the 'plasma6-desktop' package."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-desktop-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "0fe27b3a51e2251466643c40fb0a77d021cdce1a38eabd5260dcafd035d52d65f2f155098be1a3997147d80247b00c1ab85764454cf54e72cce4d055a0eafb2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-desktop-af \
locale-plasma6-desktop-ar \
locale-plasma6-desktop-as \
locale-plasma6-desktop-ast \
locale-plasma6-desktop-az \
locale-plasma6-desktop-be \
locale-plasma6-desktop-be@latin \
locale-plasma6-desktop-bg \
locale-plasma6-desktop-bn \
locale-plasma6-desktop-bn-IN \
locale-plasma6-desktop-br \
locale-plasma6-desktop-bs \
locale-plasma6-desktop-ca \
locale-plasma6-desktop-ca@valencia \
locale-plasma6-desktop-cs \
locale-plasma6-desktop-cy \
locale-plasma6-desktop-da \
locale-plasma6-desktop-de \
locale-plasma6-desktop-el \
locale-plasma6-desktop-en-GB \
locale-plasma6-desktop-eo \
locale-plasma6-desktop-es \
locale-plasma6-desktop-et \
locale-plasma6-desktop-eu \
locale-plasma6-desktop-fa \
locale-plasma6-desktop-fi \
locale-plasma6-desktop-fr \
locale-plasma6-desktop-ga \
locale-plasma6-desktop-gl \
locale-plasma6-desktop-gu \
locale-plasma6-desktop-he \
locale-plasma6-desktop-hi \
locale-plasma6-desktop-hr \
locale-plasma6-desktop-hu \
locale-plasma6-desktop-ia \
locale-plasma6-desktop-id \
locale-plasma6-desktop-is \
locale-plasma6-desktop-it \
locale-plasma6-desktop-ja \
locale-plasma6-desktop-ka \
locale-plasma6-desktop-kk \
locale-plasma6-desktop-km \
locale-plasma6-desktop-kn \
locale-plasma6-desktop-ko \
locale-plasma6-desktop-lt \
locale-plasma6-desktop-lv \
locale-plasma6-desktop-mai \
locale-plasma6-desktop-mk \
locale-plasma6-desktop-ml \
locale-plasma6-desktop-mr \
locale-plasma6-desktop-ms \
locale-plasma6-desktop-nb \
locale-plasma6-desktop-nds \
locale-plasma6-desktop-ne \
locale-plasma6-desktop-nl \
locale-plasma6-desktop-nn \
locale-plasma6-desktop-oc \
locale-plasma6-desktop-or \
locale-plasma6-desktop-pa \
locale-plasma6-desktop-pl \
locale-plasma6-desktop-pt \
locale-plasma6-desktop-pt-BR \
locale-plasma6-desktop-ro \
locale-plasma6-desktop-ru \
locale-plasma6-desktop-si \
locale-plasma6-desktop-sk \
locale-plasma6-desktop-sl \
locale-plasma6-desktop-sq \
locale-plasma6-desktop-sr \
locale-plasma6-desktop-sr@ijekavian \
locale-plasma6-desktop-sr@ijekavianlatin \
locale-plasma6-desktop-sr@latin \
locale-plasma6-desktop-sv \
locale-plasma6-desktop-ta \
locale-plasma6-desktop-te \
locale-plasma6-desktop-th \
locale-plasma6-desktop-tr \
locale-plasma6-desktop-ug \
locale-plasma6-desktop-uk \
locale-plasma6-desktop-vi \
locale-plasma6-desktop-wa \
locale-plasma6-desktop-zh-CN \
locale-plasma6-desktop-zh-TW \
plasma6-desktop-lang \
plasma6-desktop-lang-all"

RDEPENDS:${PN} += "plasma6-desktop"

inherit rpm
