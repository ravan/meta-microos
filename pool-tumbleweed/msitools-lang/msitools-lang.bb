SUMMARY = "Translations for package msitools"
DESCRIPTION = "Provides translations for the 'msitools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.106"

RPM_NAME = "msitools-lang-0.106-1.7.noarch.rpm"
RPM_HASH = "8c9846e2d15d3d7dbd8118cdb419cfdc018462abdf94a1764435d1ab5381cec2fd9af934f38af8773f431c3b1a0b5d29902fd3c37a4c17cde1cb9af2454c9299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-msitools-bs \
locale-msitools-ca \
locale-msitools-cs \
locale-msitools-da \
locale-msitools-de \
locale-msitools-el \
locale-msitools-es \
locale-msitools-eu \
locale-msitools-fi \
locale-msitools-fr \
locale-msitools-fur \
locale-msitools-gl \
locale-msitools-hi \
locale-msitools-hr \
locale-msitools-hu \
locale-msitools-id \
locale-msitools-it \
locale-msitools-ka \
locale-msitools-ko \
locale-msitools-lt \
locale-msitools-lv \
locale-msitools-nb \
locale-msitools-nl \
locale-msitools-oc \
locale-msitools-pl \
locale-msitools-pt \
locale-msitools-pt-BR \
locale-msitools-ro \
locale-msitools-ru \
locale-msitools-sl \
locale-msitools-sr \
locale-msitools-sr@latin \
locale-msitools-sv \
locale-msitools-tr \
locale-msitools-uk \
locale-msitools-zh-CN \
msitools-lang \
msitools-lang-all"

RDEPENDS:${PN} += "msitools"

inherit rpm
