SUMMARY = "Translations for package switchboard-plug-bluetooth"
DESCRIPTION = "Provides translations for the 'switchboard-plug-bluetooth' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-bluetooth-lang-8.0.2-1.4.noarch.rpm"
RPM_HASH = "b748d68ea8e30952a8ee576fb1db1ea9082582501d40f5e3d0c5b73455105aef9004d63d257a531aff30c2649cb9ec58936b15c6021a5ddba08b58a363398d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-bluetooth-af \
locale-switchboard-plug-bluetooth-ar \
locale-switchboard-plug-bluetooth-as \
locale-switchboard-plug-bluetooth-ast \
locale-switchboard-plug-bluetooth-az \
locale-switchboard-plug-bluetooth-be \
locale-switchboard-plug-bluetooth-bg \
locale-switchboard-plug-bluetooth-bn \
locale-switchboard-plug-bluetooth-br \
locale-switchboard-plug-bluetooth-bs \
locale-switchboard-plug-bluetooth-ca \
locale-switchboard-plug-bluetooth-cs \
locale-switchboard-plug-bluetooth-cy \
locale-switchboard-plug-bluetooth-da \
locale-switchboard-plug-bluetooth-de \
locale-switchboard-plug-bluetooth-dz \
locale-switchboard-plug-bluetooth-el \
locale-switchboard-plug-bluetooth-en-AU \
locale-switchboard-plug-bluetooth-en-CA \
locale-switchboard-plug-bluetooth-en-GB \
locale-switchboard-plug-bluetooth-eo \
locale-switchboard-plug-bluetooth-es \
locale-switchboard-plug-bluetooth-et \
locale-switchboard-plug-bluetooth-eu \
locale-switchboard-plug-bluetooth-fa \
locale-switchboard-plug-bluetooth-fi \
locale-switchboard-plug-bluetooth-fr \
locale-switchboard-plug-bluetooth-fr-CA \
locale-switchboard-plug-bluetooth-ga \
locale-switchboard-plug-bluetooth-gd \
locale-switchboard-plug-bluetooth-gl \
locale-switchboard-plug-bluetooth-gu \
locale-switchboard-plug-bluetooth-he \
locale-switchboard-plug-bluetooth-hi \
locale-switchboard-plug-bluetooth-hr \
locale-switchboard-plug-bluetooth-hu \
locale-switchboard-plug-bluetooth-ia \
locale-switchboard-plug-bluetooth-id \
locale-switchboard-plug-bluetooth-is \
locale-switchboard-plug-bluetooth-it \
locale-switchboard-plug-bluetooth-ja \
locale-switchboard-plug-bluetooth-ka \
locale-switchboard-plug-bluetooth-kk \
locale-switchboard-plug-bluetooth-km \
locale-switchboard-plug-bluetooth-kn \
locale-switchboard-plug-bluetooth-ko \
locale-switchboard-plug-bluetooth-lt \
locale-switchboard-plug-bluetooth-lv \
locale-switchboard-plug-bluetooth-mk \
locale-switchboard-plug-bluetooth-ml \
locale-switchboard-plug-bluetooth-mr \
locale-switchboard-plug-bluetooth-ms \
locale-switchboard-plug-bluetooth-nb \
locale-switchboard-plug-bluetooth-ne \
locale-switchboard-plug-bluetooth-nl \
locale-switchboard-plug-bluetooth-nn \
locale-switchboard-plug-bluetooth-oc \
locale-switchboard-plug-bluetooth-or \
locale-switchboard-plug-bluetooth-pa \
locale-switchboard-plug-bluetooth-pl \
locale-switchboard-plug-bluetooth-pt \
locale-switchboard-plug-bluetooth-pt-BR \
locale-switchboard-plug-bluetooth-ro \
locale-switchboard-plug-bluetooth-ru \
locale-switchboard-plug-bluetooth-si \
locale-switchboard-plug-bluetooth-sk \
locale-switchboard-plug-bluetooth-sl \
locale-switchboard-plug-bluetooth-sq \
locale-switchboard-plug-bluetooth-sr \
locale-switchboard-plug-bluetooth-sr@latin \
locale-switchboard-plug-bluetooth-sv \
locale-switchboard-plug-bluetooth-ta \
locale-switchboard-plug-bluetooth-te \
locale-switchboard-plug-bluetooth-th \
locale-switchboard-plug-bluetooth-tr \
locale-switchboard-plug-bluetooth-ug \
locale-switchboard-plug-bluetooth-uk \
locale-switchboard-plug-bluetooth-vi \
locale-switchboard-plug-bluetooth-wa \
locale-switchboard-plug-bluetooth-zh \
locale-switchboard-plug-bluetooth-zh-CN \
locale-switchboard-plug-bluetooth-zh-HK \
locale-switchboard-plug-bluetooth-zh-TW \
switchboard-plug-bluetooth-lang \
switchboard-plug-bluetooth-lang-all"

RDEPENDS:${PN} += "switchboard-plug-bluetooth"

inherit rpm
