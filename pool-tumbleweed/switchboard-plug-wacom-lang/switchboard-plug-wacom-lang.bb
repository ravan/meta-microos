SUMMARY = "Translations for package switchboard-plug-wacom"
DESCRIPTION = "Provides translations for the 'switchboard-plug-wacom' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-wacom-lang-8.0.2-1.3.noarch.rpm"
RPM_HASH = "d94d6c6a089dfeef77dd144f3d0eaa96a733c7ae77eb86490b4a5310498b13d1f4345070fd6ce6555edb5f3ea60841e198ec5a26e18020743b873e3104e52235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-wacom-af \
locale-switchboard-plug-wacom-ar \
locale-switchboard-plug-wacom-as \
locale-switchboard-plug-wacom-ast \
locale-switchboard-plug-wacom-az \
locale-switchboard-plug-wacom-be \
locale-switchboard-plug-wacom-bg \
locale-switchboard-plug-wacom-bn \
locale-switchboard-plug-wacom-br \
locale-switchboard-plug-wacom-bs \
locale-switchboard-plug-wacom-ca \
locale-switchboard-plug-wacom-cs \
locale-switchboard-plug-wacom-cy \
locale-switchboard-plug-wacom-da \
locale-switchboard-plug-wacom-de \
locale-switchboard-plug-wacom-dz \
locale-switchboard-plug-wacom-el \
locale-switchboard-plug-wacom-en-AU \
locale-switchboard-plug-wacom-en-CA \
locale-switchboard-plug-wacom-en-GB \
locale-switchboard-plug-wacom-eo \
locale-switchboard-plug-wacom-es \
locale-switchboard-plug-wacom-et \
locale-switchboard-plug-wacom-eu \
locale-switchboard-plug-wacom-fa \
locale-switchboard-plug-wacom-fi \
locale-switchboard-plug-wacom-fr \
locale-switchboard-plug-wacom-fr-CA \
locale-switchboard-plug-wacom-ga \
locale-switchboard-plug-wacom-gd \
locale-switchboard-plug-wacom-gl \
locale-switchboard-plug-wacom-gu \
locale-switchboard-plug-wacom-he \
locale-switchboard-plug-wacom-hi \
locale-switchboard-plug-wacom-hr \
locale-switchboard-plug-wacom-hu \
locale-switchboard-plug-wacom-ia \
locale-switchboard-plug-wacom-id \
locale-switchboard-plug-wacom-is \
locale-switchboard-plug-wacom-it \
locale-switchboard-plug-wacom-ja \
locale-switchboard-plug-wacom-ka \
locale-switchboard-plug-wacom-kk \
locale-switchboard-plug-wacom-km \
locale-switchboard-plug-wacom-kn \
locale-switchboard-plug-wacom-ko \
locale-switchboard-plug-wacom-lt \
locale-switchboard-plug-wacom-lv \
locale-switchboard-plug-wacom-mk \
locale-switchboard-plug-wacom-ml \
locale-switchboard-plug-wacom-mr \
locale-switchboard-plug-wacom-ms \
locale-switchboard-plug-wacom-nb \
locale-switchboard-plug-wacom-ne \
locale-switchboard-plug-wacom-nl \
locale-switchboard-plug-wacom-nn \
locale-switchboard-plug-wacom-oc \
locale-switchboard-plug-wacom-or \
locale-switchboard-plug-wacom-pa \
locale-switchboard-plug-wacom-pl \
locale-switchboard-plug-wacom-pt \
locale-switchboard-plug-wacom-pt-BR \
locale-switchboard-plug-wacom-ro \
locale-switchboard-plug-wacom-ru \
locale-switchboard-plug-wacom-si \
locale-switchboard-plug-wacom-sk \
locale-switchboard-plug-wacom-sl \
locale-switchboard-plug-wacom-sq \
locale-switchboard-plug-wacom-sr \
locale-switchboard-plug-wacom-sr@latin \
locale-switchboard-plug-wacom-sv \
locale-switchboard-plug-wacom-ta \
locale-switchboard-plug-wacom-te \
locale-switchboard-plug-wacom-th \
locale-switchboard-plug-wacom-tr \
locale-switchboard-plug-wacom-ug \
locale-switchboard-plug-wacom-uk \
locale-switchboard-plug-wacom-vi \
locale-switchboard-plug-wacom-wa \
locale-switchboard-plug-wacom-zh \
locale-switchboard-plug-wacom-zh-CN \
locale-switchboard-plug-wacom-zh-TW \
switchboard-plug-wacom-lang \
switchboard-plug-wacom-lang-all"

RDEPENDS:${PN} += "switchboard-plug-wacom"

inherit rpm
