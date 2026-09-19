SUMMARY = "Translations for package warpinator"
DESCRIPTION = "Provides translations for the 'warpinator' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "warpinator-lang-2.0.4-1.2.noarch.rpm"
RPM_HASH = "87c88876183c3b73532e1e390e1db2ff728f112083dd62c2d63881552ddc158d5524954703a989f1ae582804490d3af556a2d996727a1f94f5d615bc46e32a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-warpinator-ar \
locale-warpinator-ast \
locale-warpinator-be \
locale-warpinator-bg \
locale-warpinator-bn \
locale-warpinator-br \
locale-warpinator-ca \
locale-warpinator-cs \
locale-warpinator-cy \
locale-warpinator-da \
locale-warpinator-de \
locale-warpinator-el \
locale-warpinator-en-CA \
locale-warpinator-en-GB \
locale-warpinator-eo \
locale-warpinator-es \
locale-warpinator-et \
locale-warpinator-eu \
locale-warpinator-fa \
locale-warpinator-fi \
locale-warpinator-fr \
locale-warpinator-fr-CA \
locale-warpinator-he \
locale-warpinator-hi \
locale-warpinator-hr \
locale-warpinator-hu \
locale-warpinator-ia \
locale-warpinator-id \
locale-warpinator-is \
locale-warpinator-it \
locale-warpinator-ja \
locale-warpinator-ka \
locale-warpinator-kk \
locale-warpinator-kn \
locale-warpinator-ko \
locale-warpinator-lt \
locale-warpinator-lv \
locale-warpinator-ms \
locale-warpinator-nb \
locale-warpinator-ne \
locale-warpinator-nl \
locale-warpinator-nn \
locale-warpinator-oc \
locale-warpinator-pa \
locale-warpinator-pl \
locale-warpinator-pt \
locale-warpinator-pt-BR \
locale-warpinator-ro \
locale-warpinator-ru \
locale-warpinator-sk \
locale-warpinator-sl \
locale-warpinator-sq \
locale-warpinator-sr \
locale-warpinator-sr@latin \
locale-warpinator-sv \
locale-warpinator-te \
locale-warpinator-tr \
locale-warpinator-uk \
locale-warpinator-vi \
locale-warpinator-zh-CN \
locale-warpinator-zh-HK \
locale-warpinator-zh-TW \
warpinator-lang \
warpinator-lang-all"

RDEPENDS:${PN} += "warpinator"

inherit rpm
