SUMMARY = "Translations for package switchboard-plug-network"
DESCRIPTION = "Provides translations for the 'switchboard-plug-network' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "switchboard-plug-network-lang-8.2.0-1.4.noarch.rpm"
RPM_HASH = "4bf57d9157931faf2e7f4e5ad435008733fc778f2ede668adb2cfe7e9ee3edcb304898de97c524f330e7356047b64ae25ac423839f15bb101f7aa692e9151e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-network-af \
locale-switchboard-plug-network-ar \
locale-switchboard-plug-network-as \
locale-switchboard-plug-network-ast \
locale-switchboard-plug-network-az \
locale-switchboard-plug-network-be \
locale-switchboard-plug-network-bg \
locale-switchboard-plug-network-bn \
locale-switchboard-plug-network-br \
locale-switchboard-plug-network-bs \
locale-switchboard-plug-network-ca \
locale-switchboard-plug-network-cs \
locale-switchboard-plug-network-cy \
locale-switchboard-plug-network-da \
locale-switchboard-plug-network-de \
locale-switchboard-plug-network-dz \
locale-switchboard-plug-network-el \
locale-switchboard-plug-network-en-AU \
locale-switchboard-plug-network-en-CA \
locale-switchboard-plug-network-en-GB \
locale-switchboard-plug-network-eo \
locale-switchboard-plug-network-es \
locale-switchboard-plug-network-et \
locale-switchboard-plug-network-eu \
locale-switchboard-plug-network-fa \
locale-switchboard-plug-network-fi \
locale-switchboard-plug-network-fr \
locale-switchboard-plug-network-fr-CA \
locale-switchboard-plug-network-ga \
locale-switchboard-plug-network-gd \
locale-switchboard-plug-network-gl \
locale-switchboard-plug-network-gu \
locale-switchboard-plug-network-he \
locale-switchboard-plug-network-hi \
locale-switchboard-plug-network-hr \
locale-switchboard-plug-network-hu \
locale-switchboard-plug-network-ia \
locale-switchboard-plug-network-id \
locale-switchboard-plug-network-is \
locale-switchboard-plug-network-it \
locale-switchboard-plug-network-ja \
locale-switchboard-plug-network-ka \
locale-switchboard-plug-network-kk \
locale-switchboard-plug-network-km \
locale-switchboard-plug-network-kn \
locale-switchboard-plug-network-ko \
locale-switchboard-plug-network-lt \
locale-switchboard-plug-network-lv \
locale-switchboard-plug-network-mk \
locale-switchboard-plug-network-ml \
locale-switchboard-plug-network-mr \
locale-switchboard-plug-network-ms \
locale-switchboard-plug-network-nb \
locale-switchboard-plug-network-ne \
locale-switchboard-plug-network-nl \
locale-switchboard-plug-network-nn \
locale-switchboard-plug-network-oc \
locale-switchboard-plug-network-or \
locale-switchboard-plug-network-pa \
locale-switchboard-plug-network-pl \
locale-switchboard-plug-network-pt \
locale-switchboard-plug-network-pt-BR \
locale-switchboard-plug-network-ro \
locale-switchboard-plug-network-ru \
locale-switchboard-plug-network-si \
locale-switchboard-plug-network-sk \
locale-switchboard-plug-network-sl \
locale-switchboard-plug-network-sq \
locale-switchboard-plug-network-sr \
locale-switchboard-plug-network-sv \
locale-switchboard-plug-network-ta \
locale-switchboard-plug-network-te \
locale-switchboard-plug-network-th \
locale-switchboard-plug-network-tr \
locale-switchboard-plug-network-ug \
locale-switchboard-plug-network-uk \
locale-switchboard-plug-network-vi \
locale-switchboard-plug-network-wa \
locale-switchboard-plug-network-zh \
locale-switchboard-plug-network-zh-CN \
locale-switchboard-plug-network-zh-HK \
locale-switchboard-plug-network-zh-TW \
switchboard-plug-network-lang \
switchboard-plug-network-lang-all"

RDEPENDS:${PN} += "switchboard-plug-network"

inherit rpm
