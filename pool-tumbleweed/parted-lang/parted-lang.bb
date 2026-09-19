SUMMARY = "Translations for package parted"
DESCRIPTION = "Provides translations for the 'parted' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.7"

RPM_NAME = "parted-lang-3.7-1.3.noarch.rpm"
RPM_HASH = "6c4b4604de71c263a3ac7bcd7d8f362673d3e1585ee7ea760fe7da502860932133c67505a561e6471b989bc8536400690951ecee95fda8985e248060e99c4881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parted-ca \
locale-parted-cs \
locale-parted-da \
locale-parted-de \
locale-parted-es \
locale-parted-fi \
locale-parted-fr \
locale-parted-fur \
locale-parted-gl \
locale-parted-hu \
locale-parted-id \
locale-parted-it \
locale-parted-ja \
locale-parted-ka \
locale-parted-ko \
locale-parted-nl \
locale-parted-nn \
locale-parted-pl \
locale-parted-pt \
locale-parted-pt-BR \
locale-parted-ro \
locale-parted-ru \
locale-parted-sk \
locale-parted-sl \
locale-parted-sr \
locale-parted-sv \
locale-parted-tr \
locale-parted-uk \
locale-parted-vi \
locale-parted-zh-CN \
locale-parted-zh-TW \
parted-lang \
parted-lang-all"

RDEPENDS:${PN} += "parted"

inherit rpm
