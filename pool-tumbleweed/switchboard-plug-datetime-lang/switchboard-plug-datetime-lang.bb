SUMMARY = "Translations for package switchboard-plug-datetime"
DESCRIPTION = "Provides translations for the 'switchboard-plug-datetime' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "switchboard-plug-datetime-lang-8.1.0-1.7.noarch.rpm"
RPM_HASH = "ee9e8526986308261672e9957507d568b9df6f5e8db20133db3781354a8e1616354a6c9ee2a21e7a0fb2e3e4a5e157f99c347a5dd51b9efaa4416e55f8e9b54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-datetime-af \
locale-switchboard-plug-datetime-ar \
locale-switchboard-plug-datetime-as \
locale-switchboard-plug-datetime-ast \
locale-switchboard-plug-datetime-az \
locale-switchboard-plug-datetime-be \
locale-switchboard-plug-datetime-bg \
locale-switchboard-plug-datetime-bn \
locale-switchboard-plug-datetime-br \
locale-switchboard-plug-datetime-bs \
locale-switchboard-plug-datetime-ca \
locale-switchboard-plug-datetime-cs \
locale-switchboard-plug-datetime-cy \
locale-switchboard-plug-datetime-da \
locale-switchboard-plug-datetime-de \
locale-switchboard-plug-datetime-dz \
locale-switchboard-plug-datetime-el \
locale-switchboard-plug-datetime-en-AU \
locale-switchboard-plug-datetime-en-CA \
locale-switchboard-plug-datetime-en-GB \
locale-switchboard-plug-datetime-eo \
locale-switchboard-plug-datetime-es \
locale-switchboard-plug-datetime-et \
locale-switchboard-plug-datetime-eu \
locale-switchboard-plug-datetime-fa \
locale-switchboard-plug-datetime-fi \
locale-switchboard-plug-datetime-fr \
locale-switchboard-plug-datetime-fr-CA \
locale-switchboard-plug-datetime-ga \
locale-switchboard-plug-datetime-gd \
locale-switchboard-plug-datetime-gl \
locale-switchboard-plug-datetime-gu \
locale-switchboard-plug-datetime-he \
locale-switchboard-plug-datetime-hi \
locale-switchboard-plug-datetime-hr \
locale-switchboard-plug-datetime-hu \
locale-switchboard-plug-datetime-ia \
locale-switchboard-plug-datetime-id \
locale-switchboard-plug-datetime-is \
locale-switchboard-plug-datetime-it \
locale-switchboard-plug-datetime-ja \
locale-switchboard-plug-datetime-ka \
locale-switchboard-plug-datetime-kk \
locale-switchboard-plug-datetime-km \
locale-switchboard-plug-datetime-kn \
locale-switchboard-plug-datetime-ko \
locale-switchboard-plug-datetime-lt \
locale-switchboard-plug-datetime-lv \
locale-switchboard-plug-datetime-mk \
locale-switchboard-plug-datetime-ml \
locale-switchboard-plug-datetime-mr \
locale-switchboard-plug-datetime-ms \
locale-switchboard-plug-datetime-nb \
locale-switchboard-plug-datetime-ne \
locale-switchboard-plug-datetime-nl \
locale-switchboard-plug-datetime-nn \
locale-switchboard-plug-datetime-oc \
locale-switchboard-plug-datetime-or \
locale-switchboard-plug-datetime-pa \
locale-switchboard-plug-datetime-pl \
locale-switchboard-plug-datetime-pt \
locale-switchboard-plug-datetime-pt-BR \
locale-switchboard-plug-datetime-ro \
locale-switchboard-plug-datetime-ru \
locale-switchboard-plug-datetime-si \
locale-switchboard-plug-datetime-sk \
locale-switchboard-plug-datetime-sl \
locale-switchboard-plug-datetime-sq \
locale-switchboard-plug-datetime-sr \
locale-switchboard-plug-datetime-sr@latin \
locale-switchboard-plug-datetime-sv \
locale-switchboard-plug-datetime-ta \
locale-switchboard-plug-datetime-te \
locale-switchboard-plug-datetime-th \
locale-switchboard-plug-datetime-tr \
locale-switchboard-plug-datetime-ug \
locale-switchboard-plug-datetime-uk \
locale-switchboard-plug-datetime-vi \
locale-switchboard-plug-datetime-wa \
locale-switchboard-plug-datetime-zh \
locale-switchboard-plug-datetime-zh-CN \
locale-switchboard-plug-datetime-zh-HK \
locale-switchboard-plug-datetime-zh-TW \
switchboard-plug-datetime-lang \
switchboard-plug-datetime-lang-all"

RDEPENDS:${PN} += "switchboard-plug-datetime"

inherit rpm
