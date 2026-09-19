SUMMARY = "Translations for package calamares"
DESCRIPTION = "Provides translations for the 'calamares' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.2"

RPM_NAME = "calamares-lang-3.4.2-1.1.noarch.rpm"
RPM_HASH = "c52836880edfdc149afb83de11a6343fc2f1764707d56bf80a48f546089ef0de1810220a765ac66e4d3a4c940fccfb3baea7646678179957af4a4c548213ff6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-lang \
calamares-lang-all \
locale-calamares-ar \
locale-calamares-as \
locale-calamares-ast \
locale-calamares-az \
locale-calamares-be \
locale-calamares-bg \
locale-calamares-bn \
locale-calamares-ca \
locale-calamares-ca@valencia \
locale-calamares-cs-CZ \
locale-calamares-da \
locale-calamares-de \
locale-calamares-el \
locale-calamares-en-GB \
locale-calamares-eo \
locale-calamares-es \
locale-calamares-es-AR \
locale-calamares-es-MX \
locale-calamares-et \
locale-calamares-eu \
locale-calamares-fa \
locale-calamares-fi-FI \
locale-calamares-fr \
locale-calamares-fur \
locale-calamares-gl \
locale-calamares-he \
locale-calamares-hi \
locale-calamares-hr \
locale-calamares-hu \
locale-calamares-ia \
locale-calamares-id \
locale-calamares-is \
locale-calamares-it-IT \
locale-calamares-ja \
locale-calamares-ka \
locale-calamares-kk \
locale-calamares-ko \
locale-calamares-lt \
locale-calamares-ml \
locale-calamares-mr \
locale-calamares-nb \
locale-calamares-nl \
locale-calamares-oc \
locale-calamares-pl \
locale-calamares-pt-BR \
locale-calamares-pt-PT \
locale-calamares-ro \
locale-calamares-ru \
locale-calamares-si \
locale-calamares-sk \
locale-calamares-sl \
locale-calamares-sq \
locale-calamares-sr \
locale-calamares-sr@latin \
locale-calamares-sv \
locale-calamares-th \
locale-calamares-tr-TR \
locale-calamares-uk \
locale-calamares-vi \
locale-calamares-zh-CN \
locale-calamares-zh-TW"

RDEPENDS:${PN} += "calamares"

inherit rpm
