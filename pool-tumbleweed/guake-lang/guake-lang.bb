SUMMARY = "Translations for package guake"
DESCRIPTION = "Provides translations for the 'guake' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-lang-3.10-7.5.noarch.rpm"
RPM_HASH = "9acce9b8c7075b8bc6f0d37c9e67fadcc3a08ad2cdaa7c2492c1742b5eeaab991408c6cca366d6bc28d6449db33643019abe595b017f57bf7f034db116f63e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-lang \
guake-lang-all \
locale-guake-ca \
locale-guake-cs \
locale-guake-de \
locale-guake-el \
locale-guake-es \
locale-guake-fa \
locale-guake-fi \
locale-guake-fr \
locale-guake-gl \
locale-guake-hr \
locale-guake-hu \
locale-guake-id \
locale-guake-it \
locale-guake-ja \
locale-guake-ko \
locale-guake-nb \
locale-guake-nl \
locale-guake-pa \
locale-guake-pl \
locale-guake-pt-BR \
locale-guake-ru \
locale-guake-sv \
locale-guake-tr \
locale-guake-uk \
locale-guake-zh-CN \
locale-guake-zh-TW"

RDEPENDS:${PN} += "guake"

inherit rpm
