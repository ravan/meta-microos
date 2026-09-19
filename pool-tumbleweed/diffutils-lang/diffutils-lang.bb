SUMMARY = "Translations for package diffutils"
DESCRIPTION = "Provides translations for the 'diffutils' package."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.12"

RPM_NAME = "diffutils-lang-3.12-1.6.noarch.rpm"
RPM_HASH = "76a884a9ce2403dab5e383ea4be0ca3e9ee5e315cd30b18b230ce57b6221e95ff96ddf88d0505e58d4cf1d9dd853c1c090de04bfff9ebdc8870b20475051551e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffutils-lang \
diffutils-lang-all \
locale-diffutils-bg \
locale-diffutils-ca \
locale-diffutils-cs \
locale-diffutils-da \
locale-diffutils-de \
locale-diffutils-el \
locale-diffutils-eo \
locale-diffutils-es \
locale-diffutils-fi \
locale-diffutils-fr \
locale-diffutils-ga \
locale-diffutils-gl \
locale-diffutils-he \
locale-diffutils-hr \
locale-diffutils-hu \
locale-diffutils-id \
locale-diffutils-it \
locale-diffutils-ja \
locale-diffutils-ka \
locale-diffutils-ko \
locale-diffutils-lv \
locale-diffutils-ms \
locale-diffutils-nb \
locale-diffutils-nl \
locale-diffutils-pl \
locale-diffutils-pt \
locale-diffutils-pt-BR \
locale-diffutils-ro \
locale-diffutils-ru \
locale-diffutils-sr \
locale-diffutils-sv \
locale-diffutils-tr \
locale-diffutils-uk \
locale-diffutils-vi \
locale-diffutils-zh-CN \
locale-diffutils-zh-TW"

RDEPENDS:${PN} += "diffutils"

inherit rpm
