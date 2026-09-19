SUMMARY = "Translations for package switchboard-plug-keyboard"
DESCRIPTION = "Provides translations for the 'switchboard-plug-keyboard' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.1"

RPM_NAME = "switchboard-plug-keyboard-lang-8.1.1-1.3.noarch.rpm"
RPM_HASH = "cad7b37998e01bf7fe8fef60c23d808088234bd7cf0d2c69dd8b1d4567cea87c12a9d27d116122879763dfe30430a2c88acda1c159af9c308ae042a69d321516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-keyboard-af \
locale-switchboard-plug-keyboard-ar \
locale-switchboard-plug-keyboard-as \
locale-switchboard-plug-keyboard-ast \
locale-switchboard-plug-keyboard-az \
locale-switchboard-plug-keyboard-be \
locale-switchboard-plug-keyboard-bg \
locale-switchboard-plug-keyboard-bn \
locale-switchboard-plug-keyboard-br \
locale-switchboard-plug-keyboard-bs \
locale-switchboard-plug-keyboard-ca \
locale-switchboard-plug-keyboard-cs \
locale-switchboard-plug-keyboard-cy \
locale-switchboard-plug-keyboard-da \
locale-switchboard-plug-keyboard-de \
locale-switchboard-plug-keyboard-dz \
locale-switchboard-plug-keyboard-el \
locale-switchboard-plug-keyboard-en-AU \
locale-switchboard-plug-keyboard-en-CA \
locale-switchboard-plug-keyboard-en-GB \
locale-switchboard-plug-keyboard-eo \
locale-switchboard-plug-keyboard-es \
locale-switchboard-plug-keyboard-et \
locale-switchboard-plug-keyboard-eu \
locale-switchboard-plug-keyboard-fa \
locale-switchboard-plug-keyboard-fi \
locale-switchboard-plug-keyboard-fr \
locale-switchboard-plug-keyboard-fr-CA \
locale-switchboard-plug-keyboard-ga \
locale-switchboard-plug-keyboard-gd \
locale-switchboard-plug-keyboard-gl \
locale-switchboard-plug-keyboard-gu \
locale-switchboard-plug-keyboard-he \
locale-switchboard-plug-keyboard-hi \
locale-switchboard-plug-keyboard-hr \
locale-switchboard-plug-keyboard-hu \
locale-switchboard-plug-keyboard-ia \
locale-switchboard-plug-keyboard-id \
locale-switchboard-plug-keyboard-is \
locale-switchboard-plug-keyboard-it \
locale-switchboard-plug-keyboard-ja \
locale-switchboard-plug-keyboard-ka \
locale-switchboard-plug-keyboard-kk \
locale-switchboard-plug-keyboard-km \
locale-switchboard-plug-keyboard-kn \
locale-switchboard-plug-keyboard-ko \
locale-switchboard-plug-keyboard-lt \
locale-switchboard-plug-keyboard-lv \
locale-switchboard-plug-keyboard-mk \
locale-switchboard-plug-keyboard-ml \
locale-switchboard-plug-keyboard-mr \
locale-switchboard-plug-keyboard-ms \
locale-switchboard-plug-keyboard-nb \
locale-switchboard-plug-keyboard-ne \
locale-switchboard-plug-keyboard-nl \
locale-switchboard-plug-keyboard-nn \
locale-switchboard-plug-keyboard-oc \
locale-switchboard-plug-keyboard-or \
locale-switchboard-plug-keyboard-pa \
locale-switchboard-plug-keyboard-pl \
locale-switchboard-plug-keyboard-pt \
locale-switchboard-plug-keyboard-pt-BR \
locale-switchboard-plug-keyboard-ro \
locale-switchboard-plug-keyboard-ru \
locale-switchboard-plug-keyboard-si \
locale-switchboard-plug-keyboard-sk \
locale-switchboard-plug-keyboard-sl \
locale-switchboard-plug-keyboard-sq \
locale-switchboard-plug-keyboard-sr \
locale-switchboard-plug-keyboard-sv \
locale-switchboard-plug-keyboard-ta \
locale-switchboard-plug-keyboard-te \
locale-switchboard-plug-keyboard-th \
locale-switchboard-plug-keyboard-tr \
locale-switchboard-plug-keyboard-ug \
locale-switchboard-plug-keyboard-uk \
locale-switchboard-plug-keyboard-vi \
locale-switchboard-plug-keyboard-wa \
locale-switchboard-plug-keyboard-zh \
locale-switchboard-plug-keyboard-zh-CN \
locale-switchboard-plug-keyboard-zh-TW \
switchboard-plug-keyboard-lang \
switchboard-plug-keyboard-lang-all"

RDEPENDS:${PN} += "switchboard-plug-keyboard"

inherit rpm
