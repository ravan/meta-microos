SUMMARY = "Translations for package kdbg"
DESCRIPTION = "Provides translations for the 'kdbg' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kdbg-lang-3.2.0-1.4.noarch.rpm"
RPM_HASH = "8c38a8b3425c9c0b875677e0d8b685838102f554a6b9a141102eebbdac093d118e44e81c0e095a766764f31d1749ffc448c00f462a2bcf0fa4a37f53c932b1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdbg-lang \
kdbg-lang-all \
locale-kdbg-cs \
locale-kdbg-da \
locale-kdbg-de \
locale-kdbg-es \
locale-kdbg-fr \
locale-kdbg-hr \
locale-kdbg-hu \
locale-kdbg-it \
locale-kdbg-ja \
locale-kdbg-nb \
locale-kdbg-nn \
locale-kdbg-pl \
locale-kdbg-pt \
locale-kdbg-ro \
locale-kdbg-ru \
locale-kdbg-sk \
locale-kdbg-sr \
locale-kdbg-sv \
locale-kdbg-tr \
locale-kdbg-zh-CN"

RDEPENDS:${PN} += "kdbg"

inherit rpm
