SUMMARY = "Translations for package metacity"
DESCRIPTION = "Provides translations for the 'metacity' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.56.0"

RPM_NAME = "metacity-lang-3.56.0-1.6.noarch.rpm"
RPM_HASH = "eb537b8aeea4f5151409607f1014c51b747883f95866b301a5e923b2a764924157c345fc3b4e681edfce0a5943643f8506c81f1b70f7a224216ace6444830cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-metacity-ar \
locale-metacity-as \
locale-metacity-ast \
locale-metacity-az \
locale-metacity-be \
locale-metacity-be@latin \
locale-metacity-bg \
locale-metacity-bn \
locale-metacity-bn-IN \
locale-metacity-br \
locale-metacity-bs \
locale-metacity-ca \
locale-metacity-ca@valencia \
locale-metacity-cs \
locale-metacity-cy \
locale-metacity-da \
locale-metacity-de \
locale-metacity-dz \
locale-metacity-el \
locale-metacity-en-CA \
locale-metacity-en-GB \
locale-metacity-en@shaw \
locale-metacity-eo \
locale-metacity-es \
locale-metacity-et \
locale-metacity-eu \
locale-metacity-fa \
locale-metacity-fi \
locale-metacity-fr \
locale-metacity-ga \
locale-metacity-gl \
locale-metacity-gu \
locale-metacity-he \
locale-metacity-hi \
locale-metacity-hr \
locale-metacity-hu \
locale-metacity-id \
locale-metacity-is \
locale-metacity-it \
locale-metacity-ja \
locale-metacity-ka \
locale-metacity-kn \
locale-metacity-ko \
locale-metacity-lt \
locale-metacity-lv \
locale-metacity-mai \
locale-metacity-mk \
locale-metacity-ml \
locale-metacity-mr \
locale-metacity-ms \
locale-metacity-nb \
locale-metacity-nds \
locale-metacity-ne \
locale-metacity-nl \
locale-metacity-nn \
locale-metacity-oc \
locale-metacity-or \
locale-metacity-pa \
locale-metacity-pl \
locale-metacity-pt \
locale-metacity-pt-BR \
locale-metacity-ro \
locale-metacity-ru \
locale-metacity-si \
locale-metacity-sk \
locale-metacity-sl \
locale-metacity-sq \
locale-metacity-sr \
locale-metacity-sr@latin \
locale-metacity-sv \
locale-metacity-ta \
locale-metacity-te \
locale-metacity-th \
locale-metacity-tr \
locale-metacity-ug \
locale-metacity-uk \
locale-metacity-vi \
locale-metacity-wa \
locale-metacity-zh-CN \
locale-metacity-zh-HK \
locale-metacity-zh-TW \
metacity-lang \
metacity-lang-all"

RDEPENDS:${PN} += "metacity"

inherit rpm
