SUMMARY = "Translations for package gnome-screenshot"
DESCRIPTION = "Provides translations for the 'gnome-screenshot' package."
LICENSE = "GPL-2.0-or-later"

PV = "41.0"

RPM_NAME = "gnome-screenshot-lang-41.0-2.18.noarch.rpm"
RPM_HASH = "a3c4e826ea921e8a8a4abd29f4a9b25d3456e8f0cfb7e619b0af4ceaf2839465ae8bad9f4d74c501f8e482eed04af77d266f62b528d1db0fef8940f3158a7427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-screenshot-lang \
gnome-screenshot-lang-all \
locale-gnome-screenshot-af \
locale-gnome-screenshot-ar \
locale-gnome-screenshot-as \
locale-gnome-screenshot-ast \
locale-gnome-screenshot-az \
locale-gnome-screenshot-be \
locale-gnome-screenshot-be@latin \
locale-gnome-screenshot-bg \
locale-gnome-screenshot-bn \
locale-gnome-screenshot-bn-IN \
locale-gnome-screenshot-br \
locale-gnome-screenshot-bs \
locale-gnome-screenshot-ca \
locale-gnome-screenshot-ca@valencia \
locale-gnome-screenshot-cs \
locale-gnome-screenshot-cy \
locale-gnome-screenshot-da \
locale-gnome-screenshot-de \
locale-gnome-screenshot-dz \
locale-gnome-screenshot-el \
locale-gnome-screenshot-en-CA \
locale-gnome-screenshot-en-GB \
locale-gnome-screenshot-en@shaw \
locale-gnome-screenshot-eo \
locale-gnome-screenshot-es \
locale-gnome-screenshot-et \
locale-gnome-screenshot-eu \
locale-gnome-screenshot-fa \
locale-gnome-screenshot-fi \
locale-gnome-screenshot-fr \
locale-gnome-screenshot-fur \
locale-gnome-screenshot-ga \
locale-gnome-screenshot-gd \
locale-gnome-screenshot-gl \
locale-gnome-screenshot-gu \
locale-gnome-screenshot-he \
locale-gnome-screenshot-hi \
locale-gnome-screenshot-hr \
locale-gnome-screenshot-hu \
locale-gnome-screenshot-id \
locale-gnome-screenshot-is \
locale-gnome-screenshot-it \
locale-gnome-screenshot-ja \
locale-gnome-screenshot-ka \
locale-gnome-screenshot-kk \
locale-gnome-screenshot-km \
locale-gnome-screenshot-kn \
locale-gnome-screenshot-ko \
locale-gnome-screenshot-lt \
locale-gnome-screenshot-lv \
locale-gnome-screenshot-mai \
locale-gnome-screenshot-mk \
locale-gnome-screenshot-ml \
locale-gnome-screenshot-mr \
locale-gnome-screenshot-ms \
locale-gnome-screenshot-nb \
locale-gnome-screenshot-nds \
locale-gnome-screenshot-ne \
locale-gnome-screenshot-nl \
locale-gnome-screenshot-nn \
locale-gnome-screenshot-oc \
locale-gnome-screenshot-or \
locale-gnome-screenshot-pa \
locale-gnome-screenshot-pl \
locale-gnome-screenshot-pt \
locale-gnome-screenshot-pt-BR \
locale-gnome-screenshot-ro \
locale-gnome-screenshot-ru \
locale-gnome-screenshot-si \
locale-gnome-screenshot-sk \
locale-gnome-screenshot-sl \
locale-gnome-screenshot-sq \
locale-gnome-screenshot-sr \
locale-gnome-screenshot-sr@latin \
locale-gnome-screenshot-sv \
locale-gnome-screenshot-ta \
locale-gnome-screenshot-te \
locale-gnome-screenshot-th \
locale-gnome-screenshot-tr \
locale-gnome-screenshot-ug \
locale-gnome-screenshot-uk \
locale-gnome-screenshot-vi \
locale-gnome-screenshot-wa \
locale-gnome-screenshot-zh-CN \
locale-gnome-screenshot-zh-HK \
locale-gnome-screenshot-zh-TW"

RDEPENDS:${PN} += "gnome-screenshot"

inherit rpm
