SUMMARY = "Translations for package muffin"
DESCRIPTION = "Provides translations for the 'muffin' package."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "muffin-lang-6.4.1-2.4.noarch.rpm"
RPM_HASH = "17789f52556a50c5d48faf65861f2348ec528be3f5e222934a1677121bd7177d5854e0d4b55fc84aec9cac3344beb1df50a38b72dd6e446a705102a75fcdb7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-muffin-ar \
locale-muffin-as \
locale-muffin-ast \
locale-muffin-az \
locale-muffin-be \
locale-muffin-be@latin \
locale-muffin-bg \
locale-muffin-bn \
locale-muffin-bn-IN \
locale-muffin-br \
locale-muffin-bs \
locale-muffin-ca \
locale-muffin-ca@valencia \
locale-muffin-cs \
locale-muffin-cy \
locale-muffin-da \
locale-muffin-de \
locale-muffin-dz \
locale-muffin-el \
locale-muffin-en-CA \
locale-muffin-en-GB \
locale-muffin-eo \
locale-muffin-es \
locale-muffin-et \
locale-muffin-eu \
locale-muffin-fa \
locale-muffin-fi \
locale-muffin-fr \
locale-muffin-fur \
locale-muffin-ga \
locale-muffin-gd \
locale-muffin-gl \
locale-muffin-gu \
locale-muffin-he \
locale-muffin-hi \
locale-muffin-hr \
locale-muffin-hu \
locale-muffin-id \
locale-muffin-is \
locale-muffin-it \
locale-muffin-ja \
locale-muffin-ka \
locale-muffin-kk \
locale-muffin-kn \
locale-muffin-ko \
locale-muffin-lt \
locale-muffin-lv \
locale-muffin-mai \
locale-muffin-mk \
locale-muffin-ml \
locale-muffin-mr \
locale-muffin-ms \
locale-muffin-nb \
locale-muffin-nds \
locale-muffin-ne \
locale-muffin-nl \
locale-muffin-nn \
locale-muffin-oc \
locale-muffin-or \
locale-muffin-pa \
locale-muffin-pl \
locale-muffin-pt \
locale-muffin-pt-BR \
locale-muffin-ro \
locale-muffin-ru \
locale-muffin-si \
locale-muffin-sk \
locale-muffin-sl \
locale-muffin-sq \
locale-muffin-sr \
locale-muffin-sr@latin \
locale-muffin-sv \
locale-muffin-ta \
locale-muffin-te \
locale-muffin-th \
locale-muffin-tr \
locale-muffin-ug \
locale-muffin-uk \
locale-muffin-vi \
locale-muffin-wa \
locale-muffin-zh-CN \
locale-muffin-zh-HK \
locale-muffin-zh-TW \
muffin-lang \
muffin-lang-all"

RDEPENDS:${PN} += "muffin"

inherit rpm
