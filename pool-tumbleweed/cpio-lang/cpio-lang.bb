SUMMARY = "Translations for package cpio"
DESCRIPTION = "Provides translations for the 'cpio' package."
LICENSE = "GPL-3.0-only"

PV = "2.15"

RPM_NAME = "cpio-lang-2.15-9.1.noarch.rpm"
RPM_HASH = "bd86be0512ae7b1ce8433439df69a36a4fbdbf20beda598826958cca3065d8fdbca213e93230670d2620ce4d3d7bfbb144a15c4c1f1956ee62542fbc0eee3a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpio-lang \
cpio-lang-all \
locale-cpio-bg \
locale-cpio-da \
locale-cpio-de \
locale-cpio-es \
locale-cpio-fi \
locale-cpio-fr \
locale-cpio-ga \
locale-cpio-gl \
locale-cpio-hr \
locale-cpio-hu \
locale-cpio-id \
locale-cpio-it \
locale-cpio-ja \
locale-cpio-ka \
locale-cpio-ko \
locale-cpio-nl \
locale-cpio-pl \
locale-cpio-pt \
locale-cpio-pt-BR \
locale-cpio-ro \
locale-cpio-ru \
locale-cpio-sr \
locale-cpio-sv \
locale-cpio-tr \
locale-cpio-uk \
locale-cpio-vi \
locale-cpio-zh-CN \
locale-cpio-zh-TW"

RDEPENDS:${PN} += "cpio"

inherit rpm
