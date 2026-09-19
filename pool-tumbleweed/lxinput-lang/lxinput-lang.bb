SUMMARY = "Translations for package lxinput"
DESCRIPTION = "Provides translations for the 'lxinput' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.6"

RPM_NAME = "lxinput-lang-0.3.6-1.3.noarch.rpm"
RPM_HASH = "a88e9f6d0a7e6a867b8dd6a6c900907c6a4ab0fd09bd6e3fae8ff4ecc60c16e5aff9c8654d36b9ad5091d83b9f1d4db09654ce285ae6631dfdf4598fc65b447a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxinput-af \
locale-lxinput-ar \
locale-lxinput-ast \
locale-lxinput-be \
locale-lxinput-bg \
locale-lxinput-bn \
locale-lxinput-bn-IN \
locale-lxinput-ca \
locale-lxinput-cs \
locale-lxinput-da \
locale-lxinput-de \
locale-lxinput-el \
locale-lxinput-en-GB \
locale-lxinput-eo \
locale-lxinput-es \
locale-lxinput-et \
locale-lxinput-eu \
locale-lxinput-fa \
locale-lxinput-fi \
locale-lxinput-fr \
locale-lxinput-gl \
locale-lxinput-he \
locale-lxinput-hr \
locale-lxinput-hu \
locale-lxinput-id \
locale-lxinput-is \
locale-lxinput-it \
locale-lxinput-ja \
locale-lxinput-kk \
locale-lxinput-ko \
locale-lxinput-lt \
locale-lxinput-ml \
locale-lxinput-ms \
locale-lxinput-nb \
locale-lxinput-nl \
locale-lxinput-nn \
locale-lxinput-pa \
locale-lxinput-pl \
locale-lxinput-pt \
locale-lxinput-pt-BR \
locale-lxinput-ro \
locale-lxinput-ru \
locale-lxinput-si \
locale-lxinput-sk \
locale-lxinput-sl \
locale-lxinput-sr \
locale-lxinput-sr@latin \
locale-lxinput-sv \
locale-lxinput-te \
locale-lxinput-th \
locale-lxinput-tr \
locale-lxinput-ug \
locale-lxinput-uk \
locale-lxinput-vi \
locale-lxinput-zh-CN \
locale-lxinput-zh-TW \
lxinput-lang \
lxinput-lang-all"

RDEPENDS:${PN} += "lxinput"

inherit rpm
