SUMMARY = "Translations for package iagno"
DESCRIPTION = "Provides translations for the 'iagno' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+8"

RPM_NAME = "iagno-lang-50.0+8-1.2.noarch.rpm"
RPM_HASH = "8b78e46f78cc2dd80d7427b820da65c48d7b57026ec8b29770504f87db632514b2c785337940ceaf2516fb2b1c51354479b8473ec46f8122dfa49653448d5f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iagno-lang \
iagno-lang-all \
locale-iagno-af \
locale-iagno-ar \
locale-iagno-as \
locale-iagno-ast \
locale-iagno-az \
locale-iagno-be \
locale-iagno-bg \
locale-iagno-bn \
locale-iagno-bn-IN \
locale-iagno-br \
locale-iagno-bs \
locale-iagno-ca \
locale-iagno-ca@valencia \
locale-iagno-cs \
locale-iagno-cy \
locale-iagno-da \
locale-iagno-de \
locale-iagno-dz \
locale-iagno-el \
locale-iagno-en-CA \
locale-iagno-en-GB \
locale-iagno-en@shaw \
locale-iagno-eo \
locale-iagno-es \
locale-iagno-et \
locale-iagno-eu \
locale-iagno-fa \
locale-iagno-fi \
locale-iagno-fr \
locale-iagno-fur \
locale-iagno-ga \
locale-iagno-gl \
locale-iagno-gu \
locale-iagno-he \
locale-iagno-hi \
locale-iagno-hr \
locale-iagno-hu \
locale-iagno-id \
locale-iagno-is \
locale-iagno-it \
locale-iagno-ja \
locale-iagno-ka \
locale-iagno-kk \
locale-iagno-km \
locale-iagno-kn \
locale-iagno-ko \
locale-iagno-lt \
locale-iagno-lv \
locale-iagno-mai \
locale-iagno-mk \
locale-iagno-ml \
locale-iagno-mr \
locale-iagno-ms \
locale-iagno-nb \
locale-iagno-ne \
locale-iagno-nl \
locale-iagno-nn \
locale-iagno-oc \
locale-iagno-or \
locale-iagno-pa \
locale-iagno-pl \
locale-iagno-pt \
locale-iagno-pt-BR \
locale-iagno-ro \
locale-iagno-ru \
locale-iagno-si \
locale-iagno-sk \
locale-iagno-sl \
locale-iagno-sq \
locale-iagno-sr \
locale-iagno-sr@latin \
locale-iagno-sv \
locale-iagno-ta \
locale-iagno-te \
locale-iagno-th \
locale-iagno-tr \
locale-iagno-ug \
locale-iagno-uk \
locale-iagno-vi \
locale-iagno-wa \
locale-iagno-zh-CN \
locale-iagno-zh-HK \
locale-iagno-zh-TW"

RDEPENDS:${PN} += "iagno"

inherit rpm
