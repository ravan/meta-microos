SUMMARY = "Translations for package pinta"
DESCRIPTION = "Provides translations for the 'pinta' package."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "pinta-lang-1.7.1-1.12.noarch.rpm"
RPM_HASH = "9f319f88fe08c695d2e99898bd5552708a7b49ee890d9770067b80ac40fb233bd2f32adf986640a485d8745e593fe1cc5eb348b74e5ec9770f0c6db9465cbbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pinta-af \
locale-pinta-ar \
locale-pinta-ast \
locale-pinta-az \
locale-pinta-be \
locale-pinta-bg \
locale-pinta-bn \
locale-pinta-br \
locale-pinta-bs \
locale-pinta-ca \
locale-pinta-cs \
locale-pinta-da \
locale-pinta-de \
locale-pinta-el \
locale-pinta-en-AU \
locale-pinta-en-CA \
locale-pinta-en-GB \
locale-pinta-eo \
locale-pinta-es \
locale-pinta-et \
locale-pinta-eu \
locale-pinta-fi \
locale-pinta-fr \
locale-pinta-ga \
locale-pinta-gl \
locale-pinta-he \
locale-pinta-hi \
locale-pinta-hr \
locale-pinta-hu \
locale-pinta-id \
locale-pinta-it \
locale-pinta-ja \
locale-pinta-ka \
locale-pinta-ko \
locale-pinta-lt \
locale-pinta-lv \
locale-pinta-ms \
locale-pinta-nb \
locale-pinta-nl \
locale-pinta-nn \
locale-pinta-oc \
locale-pinta-pl \
locale-pinta-pt \
locale-pinta-pt-BR \
locale-pinta-ro \
locale-pinta-ru \
locale-pinta-si \
locale-pinta-sk \
locale-pinta-sl \
locale-pinta-sq \
locale-pinta-sr \
locale-pinta-sv \
locale-pinta-th \
locale-pinta-tr \
locale-pinta-uk \
locale-pinta-vi \
locale-pinta-zh-CN \
locale-pinta-zh-HK \
locale-pinta-zh-TW \
pinta-lang \
pinta-lang-all"

RDEPENDS:${PN} += "pinta"

inherit rpm
