SUMMARY = "Translations for package switchboard-plug-notifications"
DESCRIPTION = "Provides translations for the 'switchboard-plug-notifications' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.1"

RPM_NAME = "switchboard-plug-notifications-lang-8.0.1-1.4.noarch.rpm"
RPM_HASH = "428a4fa0adea001e5fc2eb902d8cd42bab99eb25034f662c77901beb8f714547c2cbc41982711ee0e0c9acfb1e6364cb817eed2045cec90315659c9e91c99343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-notifications-af \
locale-switchboard-plug-notifications-ar \
locale-switchboard-plug-notifications-as \
locale-switchboard-plug-notifications-ast \
locale-switchboard-plug-notifications-az \
locale-switchboard-plug-notifications-be \
locale-switchboard-plug-notifications-bg \
locale-switchboard-plug-notifications-bn \
locale-switchboard-plug-notifications-br \
locale-switchboard-plug-notifications-bs \
locale-switchboard-plug-notifications-ca \
locale-switchboard-plug-notifications-cs \
locale-switchboard-plug-notifications-cy \
locale-switchboard-plug-notifications-da \
locale-switchboard-plug-notifications-de \
locale-switchboard-plug-notifications-dz \
locale-switchboard-plug-notifications-el \
locale-switchboard-plug-notifications-en-AU \
locale-switchboard-plug-notifications-en-CA \
locale-switchboard-plug-notifications-en-GB \
locale-switchboard-plug-notifications-eo \
locale-switchboard-plug-notifications-es \
locale-switchboard-plug-notifications-et \
locale-switchboard-plug-notifications-eu \
locale-switchboard-plug-notifications-fa \
locale-switchboard-plug-notifications-fi \
locale-switchboard-plug-notifications-fr \
locale-switchboard-plug-notifications-fr-CA \
locale-switchboard-plug-notifications-ga \
locale-switchboard-plug-notifications-gd \
locale-switchboard-plug-notifications-gl \
locale-switchboard-plug-notifications-gu \
locale-switchboard-plug-notifications-he \
locale-switchboard-plug-notifications-hi \
locale-switchboard-plug-notifications-hr \
locale-switchboard-plug-notifications-hu \
locale-switchboard-plug-notifications-ia \
locale-switchboard-plug-notifications-id \
locale-switchboard-plug-notifications-is \
locale-switchboard-plug-notifications-it \
locale-switchboard-plug-notifications-ja \
locale-switchboard-plug-notifications-ka \
locale-switchboard-plug-notifications-kk \
locale-switchboard-plug-notifications-km \
locale-switchboard-plug-notifications-kn \
locale-switchboard-plug-notifications-ko \
locale-switchboard-plug-notifications-lt \
locale-switchboard-plug-notifications-lv \
locale-switchboard-plug-notifications-mk \
locale-switchboard-plug-notifications-ml \
locale-switchboard-plug-notifications-mr \
locale-switchboard-plug-notifications-ms \
locale-switchboard-plug-notifications-nb \
locale-switchboard-plug-notifications-ne \
locale-switchboard-plug-notifications-nl \
locale-switchboard-plug-notifications-nn \
locale-switchboard-plug-notifications-oc \
locale-switchboard-plug-notifications-or \
locale-switchboard-plug-notifications-pa \
locale-switchboard-plug-notifications-pl \
locale-switchboard-plug-notifications-pt \
locale-switchboard-plug-notifications-pt-BR \
locale-switchboard-plug-notifications-ro \
locale-switchboard-plug-notifications-ru \
locale-switchboard-plug-notifications-si \
locale-switchboard-plug-notifications-sk \
locale-switchboard-plug-notifications-sl \
locale-switchboard-plug-notifications-sq \
locale-switchboard-plug-notifications-sr \
locale-switchboard-plug-notifications-sv \
locale-switchboard-plug-notifications-ta \
locale-switchboard-plug-notifications-te \
locale-switchboard-plug-notifications-th \
locale-switchboard-plug-notifications-tr \
locale-switchboard-plug-notifications-ug \
locale-switchboard-plug-notifications-uk \
locale-switchboard-plug-notifications-vi \
locale-switchboard-plug-notifications-wa \
locale-switchboard-plug-notifications-zh \
locale-switchboard-plug-notifications-zh-CN \
locale-switchboard-plug-notifications-zh-TW \
switchboard-plug-notifications-lang \
switchboard-plug-notifications-lang-all"

RDEPENDS:${PN} += "switchboard-plug-notifications"

inherit rpm
