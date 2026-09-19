SUMMARY = "Translations for package mousetweaks"
DESCRIPTION = "Provides translations for the 'mousetweaks' package."
LICENSE = "GPL-3.0-only"

PV = "3.32.0"

RPM_NAME = "mousetweaks-lang-3.32.0-4.1.noarch.rpm"
RPM_HASH = "1a0ae8a03825487c8d8ad1ebccd462d4f50d22b143f5ed54582f51cd43cb1e58bbd4dfb3b5f72d1a3843f8593c068c2b934769fe8feb81a00bf10d1b1a38e05c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mousetweaks-ar \
locale-mousetweaks-as \
locale-mousetweaks-ast \
locale-mousetweaks-be \
locale-mousetweaks-bg \
locale-mousetweaks-bn \
locale-mousetweaks-bn-IN \
locale-mousetweaks-bs \
locale-mousetweaks-ca \
locale-mousetweaks-ca@valencia \
locale-mousetweaks-cs \
locale-mousetweaks-da \
locale-mousetweaks-de \
locale-mousetweaks-el \
locale-mousetweaks-en-GB \
locale-mousetweaks-en@shaw \
locale-mousetweaks-eo \
locale-mousetweaks-es \
locale-mousetweaks-et \
locale-mousetweaks-eu \
locale-mousetweaks-fa \
locale-mousetweaks-fi \
locale-mousetweaks-fr \
locale-mousetweaks-fur \
locale-mousetweaks-gd \
locale-mousetweaks-gl \
locale-mousetweaks-gu \
locale-mousetweaks-he \
locale-mousetweaks-hi \
locale-mousetweaks-hr \
locale-mousetweaks-hu \
locale-mousetweaks-id \
locale-mousetweaks-is \
locale-mousetweaks-it \
locale-mousetweaks-ja \
locale-mousetweaks-kk \
locale-mousetweaks-kn \
locale-mousetweaks-ko \
locale-mousetweaks-lt \
locale-mousetweaks-lv \
locale-mousetweaks-mai \
locale-mousetweaks-mk \
locale-mousetweaks-ml \
locale-mousetweaks-mr \
locale-mousetweaks-nb \
locale-mousetweaks-ne \
locale-mousetweaks-nl \
locale-mousetweaks-nn \
locale-mousetweaks-oc \
locale-mousetweaks-or \
locale-mousetweaks-pa \
locale-mousetweaks-pl \
locale-mousetweaks-pt \
locale-mousetweaks-pt-BR \
locale-mousetweaks-ro \
locale-mousetweaks-ru \
locale-mousetweaks-sk \
locale-mousetweaks-sl \
locale-mousetweaks-sq \
locale-mousetweaks-sr \
locale-mousetweaks-sr@latin \
locale-mousetweaks-sv \
locale-mousetweaks-ta \
locale-mousetweaks-te \
locale-mousetweaks-th \
locale-mousetweaks-tr \
locale-mousetweaks-ug \
locale-mousetweaks-uk \
locale-mousetweaks-vi \
locale-mousetweaks-zh-CN \
locale-mousetweaks-zh-HK \
locale-mousetweaks-zh-TW \
mousetweaks-lang \
mousetweaks-lang-all"

RDEPENDS:${PN} += "mousetweaks"

inherit rpm
