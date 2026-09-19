SUMMARY = "Translations for package coreutils"
DESCRIPTION = "Provides translations for the 'coreutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "9.11"

RPM_NAME = "coreutils-lang-9.11-5.1.noarch.rpm"
RPM_HASH = "32762447023407590f0e3a889dd8dab5dcb613d50743b307c78a6c9415c321d0425d2669c646df50dd570cb293acecdfad069a8915bb3dbfb1cd15dc24182340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-lang \
coreutils-lang-all \
locale-coreutils-af \
locale-coreutils-ar \
locale-coreutils-be \
locale-coreutils-bg \
locale-coreutils-ca \
locale-coreutils-cs \
locale-coreutils-da \
locale-coreutils-de \
locale-coreutils-el \
locale-coreutils-eo \
locale-coreutils-es \
locale-coreutils-et \
locale-coreutils-eu \
locale-coreutils-fi \
locale-coreutils-fr \
locale-coreutils-ga \
locale-coreutils-gl \
locale-coreutils-hr \
locale-coreutils-hu \
locale-coreutils-ia \
locale-coreutils-id \
locale-coreutils-it \
locale-coreutils-ja \
locale-coreutils-ka \
locale-coreutils-kk \
locale-coreutils-ko \
locale-coreutils-lt \
locale-coreutils-ms \
locale-coreutils-nb \
locale-coreutils-nl \
locale-coreutils-pl \
locale-coreutils-pt \
locale-coreutils-pt-BR \
locale-coreutils-ro \
locale-coreutils-ru \
locale-coreutils-sk \
locale-coreutils-sl \
locale-coreutils-sr \
locale-coreutils-sv \
locale-coreutils-ta \
locale-coreutils-tr \
locale-coreutils-uk \
locale-coreutils-vi \
locale-coreutils-zh-CN \
locale-coreutils-zh-TW"

RDEPENDS:${PN} += "coreutils"

inherit rpm
