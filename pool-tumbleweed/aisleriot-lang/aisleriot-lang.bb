SUMMARY = "Translations for package aisleriot"
DESCRIPTION = "Provides translations for the 'aisleriot' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.35"

RPM_NAME = "aisleriot-lang-3.22.35-3.4.noarch.rpm"
RPM_HASH = "6b69a7c7540b96162e6f87cd78229331564192d7bd67e371d8ac760d5f3bd031aec4506e82dc34bb6cb2ea47c8eea99db5f953464d1498a7ae0aef126022bf51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aisleriot-lang \
aisleriot-lang-all \
locale-aisleriot-af \
locale-aisleriot-ar \
locale-aisleriot-as \
locale-aisleriot-ast \
locale-aisleriot-az \
locale-aisleriot-be \
locale-aisleriot-bg \
locale-aisleriot-bn \
locale-aisleriot-bn-IN \
locale-aisleriot-br \
locale-aisleriot-bs \
locale-aisleriot-ca \
locale-aisleriot-ca@valencia \
locale-aisleriot-cs \
locale-aisleriot-cy \
locale-aisleriot-da \
locale-aisleriot-de \
locale-aisleriot-dz \
locale-aisleriot-el \
locale-aisleriot-en-CA \
locale-aisleriot-en-GB \
locale-aisleriot-en@shaw \
locale-aisleriot-eo \
locale-aisleriot-es \
locale-aisleriot-et \
locale-aisleriot-eu \
locale-aisleriot-fa \
locale-aisleriot-fi \
locale-aisleriot-fr \
locale-aisleriot-fur \
locale-aisleriot-ga \
locale-aisleriot-gl \
locale-aisleriot-gu \
locale-aisleriot-he \
locale-aisleriot-hi \
locale-aisleriot-hr \
locale-aisleriot-hu \
locale-aisleriot-id \
locale-aisleriot-is \
locale-aisleriot-it \
locale-aisleriot-ja \
locale-aisleriot-ka \
locale-aisleriot-kk \
locale-aisleriot-km \
locale-aisleriot-kn \
locale-aisleriot-ko \
locale-aisleriot-lt \
locale-aisleriot-lv \
locale-aisleriot-mai \
locale-aisleriot-mk \
locale-aisleriot-ml \
locale-aisleriot-mr \
locale-aisleriot-ms \
locale-aisleriot-nb \
locale-aisleriot-ne \
locale-aisleriot-nl \
locale-aisleriot-nn \
locale-aisleriot-oc \
locale-aisleriot-or \
locale-aisleriot-pa \
locale-aisleriot-pl \
locale-aisleriot-pt \
locale-aisleriot-pt-BR \
locale-aisleriot-ro \
locale-aisleriot-ru \
locale-aisleriot-si \
locale-aisleriot-sk \
locale-aisleriot-sl \
locale-aisleriot-sq \
locale-aisleriot-sr \
locale-aisleriot-sr@latin \
locale-aisleriot-sv \
locale-aisleriot-ta \
locale-aisleriot-te \
locale-aisleriot-th \
locale-aisleriot-tr \
locale-aisleriot-ug \
locale-aisleriot-uk \
locale-aisleriot-vi \
locale-aisleriot-wa \
locale-aisleriot-zh-CN \
locale-aisleriot-zh-HK \
locale-aisleriot-zh-TW"

RDEPENDS:${PN} += "aisleriot"

inherit rpm
