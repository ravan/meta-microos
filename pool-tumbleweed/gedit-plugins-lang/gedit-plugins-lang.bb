SUMMARY = "Translations for package gedit-plugins"
DESCRIPTION = "Provides translations for the 'gedit-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-plugins-lang-50.0-1.2.noarch.rpm"
RPM_HASH = "8bc140abd44e873f405bd281c8ff69762ae81929ea69f060a69df72ea77826b905528ec17f88c1b530b7c5891c49d12afe4cf841b2909db271a525002c073b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-plugins-lang \
gedit-plugins-lang-all \
locale-gedit-plugins-af \
locale-gedit-plugins-ar \
locale-gedit-plugins-as \
locale-gedit-plugins-ast \
locale-gedit-plugins-az \
locale-gedit-plugins-be \
locale-gedit-plugins-be@latin \
locale-gedit-plugins-bg \
locale-gedit-plugins-bn \
locale-gedit-plugins-bn-IN \
locale-gedit-plugins-br \
locale-gedit-plugins-bs \
locale-gedit-plugins-ca \
locale-gedit-plugins-ca@valencia \
locale-gedit-plugins-cs \
locale-gedit-plugins-cy \
locale-gedit-plugins-da \
locale-gedit-plugins-de \
locale-gedit-plugins-dz \
locale-gedit-plugins-el \
locale-gedit-plugins-en-CA \
locale-gedit-plugins-en-GB \
locale-gedit-plugins-en@shaw \
locale-gedit-plugins-eo \
locale-gedit-plugins-es \
locale-gedit-plugins-et \
locale-gedit-plugins-eu \
locale-gedit-plugins-fa \
locale-gedit-plugins-fi \
locale-gedit-plugins-fr \
locale-gedit-plugins-fur \
locale-gedit-plugins-ga \
locale-gedit-plugins-gl \
locale-gedit-plugins-gu \
locale-gedit-plugins-he \
locale-gedit-plugins-hi \
locale-gedit-plugins-hr \
locale-gedit-plugins-hu \
locale-gedit-plugins-id \
locale-gedit-plugins-is \
locale-gedit-plugins-it \
locale-gedit-plugins-ja \
locale-gedit-plugins-ka \
locale-gedit-plugins-kk \
locale-gedit-plugins-kn \
locale-gedit-plugins-ko \
locale-gedit-plugins-lt \
locale-gedit-plugins-lv \
locale-gedit-plugins-mai \
locale-gedit-plugins-mk \
locale-gedit-plugins-ml \
locale-gedit-plugins-mr \
locale-gedit-plugins-ms \
locale-gedit-plugins-nb \
locale-gedit-plugins-nds \
locale-gedit-plugins-ne \
locale-gedit-plugins-nl \
locale-gedit-plugins-nn \
locale-gedit-plugins-oc \
locale-gedit-plugins-or \
locale-gedit-plugins-pa \
locale-gedit-plugins-pl \
locale-gedit-plugins-pt \
locale-gedit-plugins-pt-BR \
locale-gedit-plugins-ro \
locale-gedit-plugins-ru \
locale-gedit-plugins-si \
locale-gedit-plugins-sk \
locale-gedit-plugins-sl \
locale-gedit-plugins-sq \
locale-gedit-plugins-sr \
locale-gedit-plugins-sr@latin \
locale-gedit-plugins-sv \
locale-gedit-plugins-ta \
locale-gedit-plugins-te \
locale-gedit-plugins-th \
locale-gedit-plugins-tr \
locale-gedit-plugins-uk \
locale-gedit-plugins-vi \
locale-gedit-plugins-wa \
locale-gedit-plugins-zh-CN \
locale-gedit-plugins-zh-HK \
locale-gedit-plugins-zh-TW"

RDEPENDS:${PN} += "gedit-plugins"

inherit rpm
