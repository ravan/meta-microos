SUMMARY = "Translations for package switchboard-plug-applications"
DESCRIPTION = "Provides translations for the 'switchboard-plug-applications' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.0"

RPM_NAME = "switchboard-plug-applications-lang-8.3.0-1.3.noarch.rpm"
RPM_HASH = "3d5b9a40a95f3f0d59e5f3d66bcbb8c973d0a74d1ee1f1243f55c2a69f470d7421fc852468728e0e4c1ee6dc22ba02092c658a1e72d8a8f922d8d1c0b73560ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-applications-af \
locale-switchboard-plug-applications-ar \
locale-switchboard-plug-applications-as \
locale-switchboard-plug-applications-ast \
locale-switchboard-plug-applications-az \
locale-switchboard-plug-applications-be \
locale-switchboard-plug-applications-bg \
locale-switchboard-plug-applications-bn \
locale-switchboard-plug-applications-br \
locale-switchboard-plug-applications-bs \
locale-switchboard-plug-applications-ca \
locale-switchboard-plug-applications-cs \
locale-switchboard-plug-applications-cy \
locale-switchboard-plug-applications-da \
locale-switchboard-plug-applications-de \
locale-switchboard-plug-applications-dz \
locale-switchboard-plug-applications-el \
locale-switchboard-plug-applications-en-AU \
locale-switchboard-plug-applications-en-CA \
locale-switchboard-plug-applications-en-GB \
locale-switchboard-plug-applications-eo \
locale-switchboard-plug-applications-es \
locale-switchboard-plug-applications-et \
locale-switchboard-plug-applications-eu \
locale-switchboard-plug-applications-fa \
locale-switchboard-plug-applications-fi \
locale-switchboard-plug-applications-fr \
locale-switchboard-plug-applications-fr-CA \
locale-switchboard-plug-applications-ga \
locale-switchboard-plug-applications-gd \
locale-switchboard-plug-applications-gl \
locale-switchboard-plug-applications-gu \
locale-switchboard-plug-applications-he \
locale-switchboard-plug-applications-hi \
locale-switchboard-plug-applications-hr \
locale-switchboard-plug-applications-hu \
locale-switchboard-plug-applications-ia \
locale-switchboard-plug-applications-id \
locale-switchboard-plug-applications-is \
locale-switchboard-plug-applications-it \
locale-switchboard-plug-applications-ja \
locale-switchboard-plug-applications-ka \
locale-switchboard-plug-applications-kk \
locale-switchboard-plug-applications-km \
locale-switchboard-plug-applications-kn \
locale-switchboard-plug-applications-ko \
locale-switchboard-plug-applications-lt \
locale-switchboard-plug-applications-lv \
locale-switchboard-plug-applications-mk \
locale-switchboard-plug-applications-ml \
locale-switchboard-plug-applications-mr \
locale-switchboard-plug-applications-ms \
locale-switchboard-plug-applications-nb \
locale-switchboard-plug-applications-ne \
locale-switchboard-plug-applications-nl \
locale-switchboard-plug-applications-nn \
locale-switchboard-plug-applications-oc \
locale-switchboard-plug-applications-or \
locale-switchboard-plug-applications-pa \
locale-switchboard-plug-applications-pl \
locale-switchboard-plug-applications-pt \
locale-switchboard-plug-applications-pt-BR \
locale-switchboard-plug-applications-ro \
locale-switchboard-plug-applications-ru \
locale-switchboard-plug-applications-si \
locale-switchboard-plug-applications-sk \
locale-switchboard-plug-applications-sl \
locale-switchboard-plug-applications-sq \
locale-switchboard-plug-applications-sr \
locale-switchboard-plug-applications-sv \
locale-switchboard-plug-applications-ta \
locale-switchboard-plug-applications-te \
locale-switchboard-plug-applications-th \
locale-switchboard-plug-applications-tr \
locale-switchboard-plug-applications-ug \
locale-switchboard-plug-applications-uk \
locale-switchboard-plug-applications-vi \
locale-switchboard-plug-applications-wa \
locale-switchboard-plug-applications-zh \
locale-switchboard-plug-applications-zh-CN \
locale-switchboard-plug-applications-zh-TW \
switchboard-plug-applications-lang \
switchboard-plug-applications-lang-all"

RDEPENDS:${PN} += "switchboard-plug-applications"

inherit rpm
