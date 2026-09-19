SUMMARY = "Translations for package switchboard-plug-sharing"
DESCRIPTION = "Provides translations for the 'switchboard-plug-sharing' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-plug-sharing-lang-8.0.3-1.4.noarch.rpm"
RPM_HASH = "6cc4020ee2d9d7343b4770d4a003f360fc950c3afe66856654c14271d91e137697c35f73271d4c2226bbeecc2218cc4f9f751056f7655408ce9ac6eebdac817d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-sharing-af \
locale-switchboard-plug-sharing-ar \
locale-switchboard-plug-sharing-as \
locale-switchboard-plug-sharing-ast \
locale-switchboard-plug-sharing-az \
locale-switchboard-plug-sharing-be \
locale-switchboard-plug-sharing-bg \
locale-switchboard-plug-sharing-bn \
locale-switchboard-plug-sharing-br \
locale-switchboard-plug-sharing-bs \
locale-switchboard-plug-sharing-ca \
locale-switchboard-plug-sharing-cs \
locale-switchboard-plug-sharing-cy \
locale-switchboard-plug-sharing-da \
locale-switchboard-plug-sharing-de \
locale-switchboard-plug-sharing-dz \
locale-switchboard-plug-sharing-el \
locale-switchboard-plug-sharing-en-AU \
locale-switchboard-plug-sharing-en-CA \
locale-switchboard-plug-sharing-en-GB \
locale-switchboard-plug-sharing-eo \
locale-switchboard-plug-sharing-es \
locale-switchboard-plug-sharing-et \
locale-switchboard-plug-sharing-eu \
locale-switchboard-plug-sharing-fa \
locale-switchboard-plug-sharing-fi \
locale-switchboard-plug-sharing-fr \
locale-switchboard-plug-sharing-fr-CA \
locale-switchboard-plug-sharing-ga \
locale-switchboard-plug-sharing-gd \
locale-switchboard-plug-sharing-gl \
locale-switchboard-plug-sharing-gu \
locale-switchboard-plug-sharing-he \
locale-switchboard-plug-sharing-hi \
locale-switchboard-plug-sharing-hr \
locale-switchboard-plug-sharing-hu \
locale-switchboard-plug-sharing-ia \
locale-switchboard-plug-sharing-id \
locale-switchboard-plug-sharing-is \
locale-switchboard-plug-sharing-it \
locale-switchboard-plug-sharing-ja \
locale-switchboard-plug-sharing-ka \
locale-switchboard-plug-sharing-kk \
locale-switchboard-plug-sharing-km \
locale-switchboard-plug-sharing-kn \
locale-switchboard-plug-sharing-ko \
locale-switchboard-plug-sharing-lt \
locale-switchboard-plug-sharing-lv \
locale-switchboard-plug-sharing-mk \
locale-switchboard-plug-sharing-ml \
locale-switchboard-plug-sharing-mr \
locale-switchboard-plug-sharing-ms \
locale-switchboard-plug-sharing-nb \
locale-switchboard-plug-sharing-ne \
locale-switchboard-plug-sharing-nl \
locale-switchboard-plug-sharing-nn \
locale-switchboard-plug-sharing-oc \
locale-switchboard-plug-sharing-or \
locale-switchboard-plug-sharing-pa \
locale-switchboard-plug-sharing-pl \
locale-switchboard-plug-sharing-pt \
locale-switchboard-plug-sharing-pt-BR \
locale-switchboard-plug-sharing-ro \
locale-switchboard-plug-sharing-ru \
locale-switchboard-plug-sharing-si \
locale-switchboard-plug-sharing-sk \
locale-switchboard-plug-sharing-sl \
locale-switchboard-plug-sharing-sq \
locale-switchboard-plug-sharing-sr \
locale-switchboard-plug-sharing-sv \
locale-switchboard-plug-sharing-ta \
locale-switchboard-plug-sharing-te \
locale-switchboard-plug-sharing-th \
locale-switchboard-plug-sharing-tr \
locale-switchboard-plug-sharing-ug \
locale-switchboard-plug-sharing-uk \
locale-switchboard-plug-sharing-vi \
locale-switchboard-plug-sharing-wa \
locale-switchboard-plug-sharing-zh \
locale-switchboard-plug-sharing-zh-CN \
locale-switchboard-plug-sharing-zh-TW \
switchboard-plug-sharing-lang \
switchboard-plug-sharing-lang-all"

RDEPENDS:${PN} += "switchboard-plug-sharing"

inherit rpm
