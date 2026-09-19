SUMMARY = "Translations for package catfish"
DESCRIPTION = "Provides translations for the 'catfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "catfish-lang-4.20.1-1.5.noarch.rpm"
RPM_HASH = "bcdf2942fcba81eb5b2d3914a48514c543e35ac0f0a45a111fd59afefcf5746bf25b2bb6f4258917f07b04c954ef05a062fd6662750b7635ebfed9b34062a460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish-lang \
catfish-lang-all \
locale-catfish-af \
locale-catfish-ar \
locale-catfish-ast \
locale-catfish-be \
locale-catfish-bg \
locale-catfish-ca \
locale-catfish-cs \
locale-catfish-da \
locale-catfish-de \
locale-catfish-el \
locale-catfish-en-AU \
locale-catfish-en-GB \
locale-catfish-eo \
locale-catfish-es \
locale-catfish-et \
locale-catfish-eu \
locale-catfish-fi \
locale-catfish-fr \
locale-catfish-gl \
locale-catfish-he \
locale-catfish-hr \
locale-catfish-hu \
locale-catfish-id \
locale-catfish-is \
locale-catfish-it \
locale-catfish-ja \
locale-catfish-kk \
locale-catfish-ko \
locale-catfish-lt \
locale-catfish-lv \
locale-catfish-ml \
locale-catfish-ms \
locale-catfish-nb \
locale-catfish-nl \
locale-catfish-nn \
locale-catfish-oc \
locale-catfish-pl \
locale-catfish-pt \
locale-catfish-pt-BR \
locale-catfish-ro \
locale-catfish-ru \
locale-catfish-si \
locale-catfish-sk \
locale-catfish-sl \
locale-catfish-sq \
locale-catfish-sr \
locale-catfish-sv \
locale-catfish-th \
locale-catfish-tr \
locale-catfish-uk \
locale-catfish-zh-CN \
locale-catfish-zh-TW"

RDEPENDS:${PN} += "catfish"

inherit rpm
