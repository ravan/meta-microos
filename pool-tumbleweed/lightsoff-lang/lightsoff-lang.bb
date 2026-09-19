SUMMARY = "Translations for package lightsoff"
DESCRIPTION = "Provides translations for the 'lightsoff' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "lightsoff-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "c6a771b357af9adb902e1a20da4d266a0df1f695b0f7cee040533e4cacf62d516a68495ef9e64c3a3614727767a2525a7446be7d6accfdf0d52795cc87c246da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightsoff-lang \
lightsoff-lang-all \
locale-lightsoff-af \
locale-lightsoff-ar \
locale-lightsoff-as \
locale-lightsoff-ast \
locale-lightsoff-az \
locale-lightsoff-be \
locale-lightsoff-bg \
locale-lightsoff-bn \
locale-lightsoff-bn-IN \
locale-lightsoff-br \
locale-lightsoff-bs \
locale-lightsoff-ca \
locale-lightsoff-ca@valencia \
locale-lightsoff-cs \
locale-lightsoff-cy \
locale-lightsoff-da \
locale-lightsoff-de \
locale-lightsoff-dz \
locale-lightsoff-el \
locale-lightsoff-en-CA \
locale-lightsoff-en-GB \
locale-lightsoff-en@shaw \
locale-lightsoff-eo \
locale-lightsoff-es \
locale-lightsoff-et \
locale-lightsoff-eu \
locale-lightsoff-fa \
locale-lightsoff-fi \
locale-lightsoff-fr \
locale-lightsoff-fur \
locale-lightsoff-ga \
locale-lightsoff-gl \
locale-lightsoff-gu \
locale-lightsoff-he \
locale-lightsoff-hi \
locale-lightsoff-hr \
locale-lightsoff-hu \
locale-lightsoff-id \
locale-lightsoff-is \
locale-lightsoff-it \
locale-lightsoff-ja \
locale-lightsoff-ka \
locale-lightsoff-kk \
locale-lightsoff-km \
locale-lightsoff-kn \
locale-lightsoff-ko \
locale-lightsoff-lt \
locale-lightsoff-lv \
locale-lightsoff-mai \
locale-lightsoff-mk \
locale-lightsoff-ml \
locale-lightsoff-mr \
locale-lightsoff-ms \
locale-lightsoff-nb \
locale-lightsoff-ne \
locale-lightsoff-nl \
locale-lightsoff-nn \
locale-lightsoff-oc \
locale-lightsoff-or \
locale-lightsoff-pa \
locale-lightsoff-pl \
locale-lightsoff-pt \
locale-lightsoff-pt-BR \
locale-lightsoff-ro \
locale-lightsoff-ru \
locale-lightsoff-si \
locale-lightsoff-sk \
locale-lightsoff-sl \
locale-lightsoff-sq \
locale-lightsoff-sr \
locale-lightsoff-sr@latin \
locale-lightsoff-sv \
locale-lightsoff-ta \
locale-lightsoff-te \
locale-lightsoff-th \
locale-lightsoff-tr \
locale-lightsoff-ug \
locale-lightsoff-uk \
locale-lightsoff-vi \
locale-lightsoff-wa \
locale-lightsoff-zh-CN \
locale-lightsoff-zh-HK \
locale-lightsoff-zh-TW"

RDEPENDS:${PN} += "lightsoff"

inherit rpm
