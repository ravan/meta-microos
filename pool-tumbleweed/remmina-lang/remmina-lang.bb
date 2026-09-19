SUMMARY = "Translations for package remmina"
DESCRIPTION = "Provides translations for the 'remmina' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-lang-1.4.43-2.2.noarch.rpm"
RPM_HASH = "471ff036bdd784e2ad189290df03a57758de8796c2f0d1c5be8573250c05f8d7158c8b4b34f8ebf37c7aeaa744dfc7bc57827244fce89c43643c5b488d263356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-remmina-ar \
locale-remmina-ast \
locale-remmina-be \
locale-remmina-bg \
locale-remmina-bn \
locale-remmina-br \
locale-remmina-bs \
locale-remmina-ca \
locale-remmina-ca@valencia \
locale-remmina-cs \
locale-remmina-da \
locale-remmina-de \
locale-remmina-el \
locale-remmina-en-AU \
locale-remmina-en-GB \
locale-remmina-en-US \
locale-remmina-eo \
locale-remmina-es \
locale-remmina-es-VE \
locale-remmina-et \
locale-remmina-eu \
locale-remmina-fa \
locale-remmina-fi \
locale-remmina-fr \
locale-remmina-gl \
locale-remmina-he \
locale-remmina-hi \
locale-remmina-hr \
locale-remmina-hu \
locale-remmina-id \
locale-remmina-it \
locale-remmina-ja \
locale-remmina-ka \
locale-remmina-kk \
locale-remmina-km \
locale-remmina-kn \
locale-remmina-ko \
locale-remmina-lt \
locale-remmina-lv \
locale-remmina-mk \
locale-remmina-mr \
locale-remmina-ms \
locale-remmina-nb \
locale-remmina-nl \
locale-remmina-oc \
locale-remmina-pl \
locale-remmina-pt \
locale-remmina-pt-BR \
locale-remmina-pt-PT \
locale-remmina-ro \
locale-remmina-ru \
locale-remmina-si \
locale-remmina-sk \
locale-remmina-sl \
locale-remmina-sq \
locale-remmina-sr \
locale-remmina-sv \
locale-remmina-ta \
locale-remmina-te \
locale-remmina-th \
locale-remmina-tr \
locale-remmina-ug \
locale-remmina-uk \
locale-remmina-vi \
locale-remmina-zh-CN \
locale-remmina-zh-TW \
remmina-lang \
remmina-lang-all"

RDEPENDS:${PN} += "remmina"

inherit rpm
