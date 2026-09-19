SUMMARY = "Translations for package sushi"
DESCRIPTION = "Provides translations for the 'sushi' package."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "50.0"

RPM_NAME = "sushi-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "b67d3950b9f5dfcf5dc56a9915261981715a676fc7bc18d4e029a9f2abc5ef9954384300ad91e84889b6df4219ed4357af0b4bc5d8b297bb6150c59f3c4657df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sushi-af \
locale-sushi-ar \
locale-sushi-as \
locale-sushi-ast \
locale-sushi-az \
locale-sushi-be \
locale-sushi-bg \
locale-sushi-bn \
locale-sushi-bn-IN \
locale-sushi-bs \
locale-sushi-ca \
locale-sushi-ca@valencia \
locale-sushi-cs \
locale-sushi-da \
locale-sushi-de \
locale-sushi-el \
locale-sushi-en-GB \
locale-sushi-eo \
locale-sushi-es \
locale-sushi-et \
locale-sushi-eu \
locale-sushi-fa \
locale-sushi-fi \
locale-sushi-fr \
locale-sushi-fur \
locale-sushi-gd \
locale-sushi-gl \
locale-sushi-gu \
locale-sushi-he \
locale-sushi-hi \
locale-sushi-hr \
locale-sushi-hu \
locale-sushi-ia \
locale-sushi-id \
locale-sushi-is \
locale-sushi-it \
locale-sushi-ja \
locale-sushi-ka \
locale-sushi-kk \
locale-sushi-kn \
locale-sushi-ko \
locale-sushi-lt \
locale-sushi-lv \
locale-sushi-ml \
locale-sushi-mr \
locale-sushi-ms \
locale-sushi-nb \
locale-sushi-ne \
locale-sushi-nl \
locale-sushi-nn \
locale-sushi-oc \
locale-sushi-or \
locale-sushi-pa \
locale-sushi-pl \
locale-sushi-pt \
locale-sushi-pt-BR \
locale-sushi-ro \
locale-sushi-ru \
locale-sushi-sk \
locale-sushi-sl \
locale-sushi-sr \
locale-sushi-sr@latin \
locale-sushi-sv \
locale-sushi-ta \
locale-sushi-te \
locale-sushi-th \
locale-sushi-tr \
locale-sushi-ug \
locale-sushi-uk \
locale-sushi-vi \
locale-sushi-zh-CN \
locale-sushi-zh-HK \
locale-sushi-zh-TW \
sushi-lang \
sushi-lang-all"

RDEPENDS:${PN} += "sushi"

inherit rpm
