SUMMARY = "Translations for package switchboard"
DESCRIPTION = "Provides translations for the 'switchboard' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-lang-8.0.3-1.5.noarch.rpm"
RPM_HASH = "32141bcc50a1dbcc562e6f58a361d26c16a1771d6aa28d811353f62a33c541ab210e1b7ebb00d990a69dafe7cd954ed746b1d6803a6121299607d52be9dd2e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-af \
locale-switchboard-ar \
locale-switchboard-as \
locale-switchboard-ast \
locale-switchboard-az \
locale-switchboard-be \
locale-switchboard-bg \
locale-switchboard-bn \
locale-switchboard-br \
locale-switchboard-bs \
locale-switchboard-ca \
locale-switchboard-cs \
locale-switchboard-cy \
locale-switchboard-da \
locale-switchboard-de \
locale-switchboard-dz \
locale-switchboard-el \
locale-switchboard-en-AU \
locale-switchboard-en-CA \
locale-switchboard-en-GB \
locale-switchboard-eo \
locale-switchboard-es \
locale-switchboard-et \
locale-switchboard-eu \
locale-switchboard-fa \
locale-switchboard-fi \
locale-switchboard-fr \
locale-switchboard-fr-CA \
locale-switchboard-ga \
locale-switchboard-gd \
locale-switchboard-gl \
locale-switchboard-gu \
locale-switchboard-he \
locale-switchboard-hi \
locale-switchboard-hr \
locale-switchboard-hu \
locale-switchboard-ia \
locale-switchboard-id \
locale-switchboard-is \
locale-switchboard-it \
locale-switchboard-ja \
locale-switchboard-ka \
locale-switchboard-kk \
locale-switchboard-km \
locale-switchboard-kn \
locale-switchboard-ko \
locale-switchboard-lt \
locale-switchboard-lv \
locale-switchboard-mk \
locale-switchboard-ml \
locale-switchboard-mr \
locale-switchboard-ms \
locale-switchboard-nb \
locale-switchboard-ne \
locale-switchboard-nl \
locale-switchboard-nn \
locale-switchboard-oc \
locale-switchboard-or \
locale-switchboard-pa \
locale-switchboard-pl \
locale-switchboard-pt \
locale-switchboard-pt-BR \
locale-switchboard-ro \
locale-switchboard-ru \
locale-switchboard-si \
locale-switchboard-sk \
locale-switchboard-sl \
locale-switchboard-sq \
locale-switchboard-sr \
locale-switchboard-sr@latin \
locale-switchboard-sv \
locale-switchboard-ta \
locale-switchboard-te \
locale-switchboard-th \
locale-switchboard-tr \
locale-switchboard-ug \
locale-switchboard-uk \
locale-switchboard-vi \
locale-switchboard-wa \
locale-switchboard-zh \
locale-switchboard-zh-CN \
locale-switchboard-zh-HK \
locale-switchboard-zh-TW \
switchboard-lang \
switchboard-lang-all"

RDEPENDS:${PN} += "switchboard"

inherit rpm
