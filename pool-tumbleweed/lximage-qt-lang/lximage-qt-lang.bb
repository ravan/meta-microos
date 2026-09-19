SUMMARY = "Translations for package lximage-qt"
DESCRIPTION = "Provides translations for the 'lximage-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "lximage-qt-lang-2.4.0-1.3.noarch.rpm"
RPM_HASH = "a1a91c2de037da82ea55fa846cab1c7dec4107909fcb9cc90dcdd32f8eaad80af8a1f2fd90892a605bb37d39c96ebd1c5096f01f54c86b85a22c1eba5c7f06b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lximage-qt-lang \
lximage-qt-lang-all"

RDEPENDS:${PN} += "lximage-qt"

inherit rpm
