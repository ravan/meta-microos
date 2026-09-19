SUMMARY = "Translations for package nemo"
DESCRIPTION = "Provides translations for the 'nemo' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.2"

RPM_NAME = "nemo-lang-6.6.2-1.2.noarch.rpm"
RPM_HASH = "3a44ee7a8ccc53c706d46decc66150e806d53582f23651f329b7537a302d01c843dcb79b58e9df4161b24c522dc28c722790f3d583540bf6fcf96ae86e5389b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nemo-af \
locale-nemo-ar \
locale-nemo-as \
locale-nemo-ast \
locale-nemo-az \
locale-nemo-be \
locale-nemo-bg \
locale-nemo-bn \
locale-nemo-br \
locale-nemo-bs \
locale-nemo-ca \
locale-nemo-ca@valencia \
locale-nemo-cs \
locale-nemo-cy \
locale-nemo-da \
locale-nemo-de \
locale-nemo-el \
locale-nemo-en-AU \
locale-nemo-en-CA \
locale-nemo-en-GB \
locale-nemo-eo \
locale-nemo-es \
locale-nemo-et \
locale-nemo-eu \
locale-nemo-fa \
locale-nemo-fi \
locale-nemo-fr \
locale-nemo-fr-CA \
locale-nemo-ga \
locale-nemo-gd \
locale-nemo-gl \
locale-nemo-he \
locale-nemo-hi \
locale-nemo-hr \
locale-nemo-hu \
locale-nemo-ia \
locale-nemo-id \
locale-nemo-is \
locale-nemo-it \
locale-nemo-ja \
locale-nemo-ka \
locale-nemo-kk \
locale-nemo-km \
locale-nemo-kn \
locale-nemo-ko \
locale-nemo-lt \
locale-nemo-lv \
locale-nemo-ml \
locale-nemo-mr \
locale-nemo-ms \
locale-nemo-nb \
locale-nemo-nds \
locale-nemo-ne \
locale-nemo-nl \
locale-nemo-nn \
locale-nemo-oc \
locale-nemo-pa \
locale-nemo-pl \
locale-nemo-pt \
locale-nemo-pt-BR \
locale-nemo-ro \
locale-nemo-ru \
locale-nemo-si \
locale-nemo-sk \
locale-nemo-sl \
locale-nemo-sq \
locale-nemo-sr \
locale-nemo-sr@latin \
locale-nemo-sv \
locale-nemo-ta \
locale-nemo-th \
locale-nemo-tr \
locale-nemo-uk \
locale-nemo-vi \
locale-nemo-zh-CN \
locale-nemo-zh-HK \
locale-nemo-zh-TW \
nemo-lang \
nemo-lang-all"

RDEPENDS:${PN} += "nemo"

inherit rpm
