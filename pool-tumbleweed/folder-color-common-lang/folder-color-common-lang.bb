SUMMARY = "Translations for package folder-color-common"
DESCRIPTION = "Provides translations for the 'folder-color-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "folder-color-common-lang-0.0.88-3.4.noarch.rpm"
RPM_HASH = "a8d437a0abc90a2d4f623b709cf33382705f3aa0778f4a5c122c334881a2e51408298fe1fc7f80b4235b2ca97df165f2c5bea88fac597eeafbbb5a5cf56e0577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-common-lang \
folder-color-common-lang-all \
locale-folder-color-common-ar \
locale-folder-color-common-ast \
locale-folder-color-common-az \
locale-folder-color-common-be \
locale-folder-color-common-bg \
locale-folder-color-common-ca \
locale-folder-color-common-cs \
locale-folder-color-common-de \
locale-folder-color-common-el \
locale-folder-color-common-en-AU \
locale-folder-color-common-en-GB \
locale-folder-color-common-es \
locale-folder-color-common-eu \
locale-folder-color-common-fi \
locale-folder-color-common-fr \
locale-folder-color-common-gd \
locale-folder-color-common-gl \
locale-folder-color-common-he \
locale-folder-color-common-hi \
locale-folder-color-common-hr \
locale-folder-color-common-hu \
locale-folder-color-common-id \
locale-folder-color-common-is \
locale-folder-color-common-it \
locale-folder-color-common-ja \
locale-folder-color-common-km \
locale-folder-color-common-ko \
locale-folder-color-common-lt \
locale-folder-color-common-lv \
locale-folder-color-common-ms \
locale-folder-color-common-nb \
locale-folder-color-common-nl \
locale-folder-color-common-pl \
locale-folder-color-common-pt \
locale-folder-color-common-pt-BR \
locale-folder-color-common-ro \
locale-folder-color-common-ru \
locale-folder-color-common-sk \
locale-folder-color-common-sl \
locale-folder-color-common-sr \
locale-folder-color-common-ta \
locale-folder-color-common-te \
locale-folder-color-common-tr \
locale-folder-color-common-ug \
locale-folder-color-common-uk \
locale-folder-color-common-zh-CN \
locale-folder-color-common-zh-TW"

RDEPENDS:${PN} += "folder-color-common"

inherit rpm
