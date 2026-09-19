SUMMARY = "Translations for package granite6"
DESCRIPTION = "Provides translations for the 'granite6' package."
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite6-lang-6.2.0-2.8.noarch.rpm"
RPM_HASH = "87189c479b00ddb11fd3db70cb2029236112dc60fcbd6f1c7a5c4eb1b76d1c9769c7ff22ef44dd1d436ac87d52e3b67bcae6ff8aeec83a04ee70c1c15069703f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granite6-lang \
granite6-lang-all \
locale-granite6-af \
locale-granite6-ar \
locale-granite6-as \
locale-granite6-ast \
locale-granite6-az \
locale-granite6-be \
locale-granite6-bg \
locale-granite6-bn \
locale-granite6-br \
locale-granite6-bs \
locale-granite6-ca \
locale-granite6-cs \
locale-granite6-cy \
locale-granite6-da \
locale-granite6-de \
locale-granite6-dz \
locale-granite6-el \
locale-granite6-en-AU \
locale-granite6-en-CA \
locale-granite6-en-GB \
locale-granite6-eo \
locale-granite6-es \
locale-granite6-et \
locale-granite6-eu \
locale-granite6-fa \
locale-granite6-fi \
locale-granite6-fr \
locale-granite6-fr-CA \
locale-granite6-ga \
locale-granite6-gd \
locale-granite6-gl \
locale-granite6-gu \
locale-granite6-he \
locale-granite6-hi \
locale-granite6-hr \
locale-granite6-hu \
locale-granite6-ia \
locale-granite6-id \
locale-granite6-is \
locale-granite6-it \
locale-granite6-ja \
locale-granite6-ka \
locale-granite6-kk \
locale-granite6-km \
locale-granite6-kn \
locale-granite6-ko \
locale-granite6-lt \
locale-granite6-lv \
locale-granite6-mk \
locale-granite6-ml \
locale-granite6-mr \
locale-granite6-ms \
locale-granite6-nb \
locale-granite6-ne \
locale-granite6-nl \
locale-granite6-nn \
locale-granite6-oc \
locale-granite6-or \
locale-granite6-pa \
locale-granite6-pl \
locale-granite6-pt \
locale-granite6-pt-BR \
locale-granite6-ro \
locale-granite6-ru \
locale-granite6-si \
locale-granite6-sk \
locale-granite6-sl \
locale-granite6-sq \
locale-granite6-sr \
locale-granite6-sr@latin \
locale-granite6-sv \
locale-granite6-ta \
locale-granite6-te \
locale-granite6-th \
locale-granite6-tr \
locale-granite6-ug \
locale-granite6-uk \
locale-granite6-vi \
locale-granite6-wa \
locale-granite6-zh \
locale-granite6-zh-CN \
locale-granite6-zh-HK \
locale-granite6-zh-TW"

RDEPENDS:${PN} += "granite6"

inherit rpm
