SUMMARY = "Translations for package clipped"
DESCRIPTION = "Provides translations for the 'clipped' package."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-lang-1.1.1-2.9.noarch.rpm"
RPM_HASH = "446b15963b5885609b7fd8219123310953b896077c8de3e7379dac117a01042c8424369207c874cc263740259bb83b30c4c7e6066807b949fff002f12f24a30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clipped-lang \
clipped-lang-all \
locale-clipped-af \
locale-clipped-ar \
locale-clipped-as \
locale-clipped-ast \
locale-clipped-az \
locale-clipped-be \
locale-clipped-bg \
locale-clipped-bn \
locale-clipped-br \
locale-clipped-bs \
locale-clipped-ca \
locale-clipped-cs \
locale-clipped-cy \
locale-clipped-da \
locale-clipped-de \
locale-clipped-dz \
locale-clipped-el \
locale-clipped-en-AU \
locale-clipped-en-CA \
locale-clipped-en-GB \
locale-clipped-eo \
locale-clipped-es \
locale-clipped-et \
locale-clipped-eu \
locale-clipped-fa \
locale-clipped-fi \
locale-clipped-fr \
locale-clipped-fr-CA \
locale-clipped-ga \
locale-clipped-gd \
locale-clipped-gl \
locale-clipped-gu \
locale-clipped-he \
locale-clipped-hi \
locale-clipped-hr \
locale-clipped-hu \
locale-clipped-ia \
locale-clipped-id \
locale-clipped-is \
locale-clipped-it \
locale-clipped-ja \
locale-clipped-ka \
locale-clipped-kk \
locale-clipped-km \
locale-clipped-kn \
locale-clipped-ko \
locale-clipped-lt \
locale-clipped-lv \
locale-clipped-mk \
locale-clipped-ml \
locale-clipped-mr \
locale-clipped-ms \
locale-clipped-nb \
locale-clipped-ne \
locale-clipped-nl \
locale-clipped-nn \
locale-clipped-oc \
locale-clipped-or \
locale-clipped-pa \
locale-clipped-pl \
locale-clipped-pt \
locale-clipped-pt-BR \
locale-clipped-ro \
locale-clipped-ru \
locale-clipped-si \
locale-clipped-sk \
locale-clipped-sl \
locale-clipped-sq \
locale-clipped-sr \
locale-clipped-sv \
locale-clipped-ta \
locale-clipped-te \
locale-clipped-th \
locale-clipped-tr \
locale-clipped-ug \
locale-clipped-uk \
locale-clipped-vi \
locale-clipped-wa \
locale-clipped-zh \
locale-clipped-zh-HK \
locale-clipped-zh-TW"

RDEPENDS:${PN} += "clipped"

inherit rpm
