SUMMARY = "Translations for package efl"
DESCRIPTION = "Provides translations for the 'efl' package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-lang-1.26.3-37.1.noarch.rpm"
RPM_HASH = "f2864587d49d415a316d2e12c41bf447feb5d453ea0fa8dc82926dc4c282a4bb5df20bd9291c69f20ee4a33ecbc271063e9c3e250b8a587e21f56709aa9a43eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "efl-lang \
efl-lang-all \
locale-efl-ar \
locale-efl-ca \
locale-efl-cs \
locale-efl-da \
locale-efl-de \
locale-efl-el \
locale-efl-eo \
locale-efl-es \
locale-efl-fa \
locale-efl-fi \
locale-efl-fr \
locale-efl-gl \
locale-efl-he \
locale-efl-hu \
locale-efl-it \
locale-efl-ja \
locale-efl-ko \
locale-efl-lt \
locale-efl-nl \
locale-efl-pl \
locale-efl-pt \
locale-efl-ru \
locale-efl-sl \
locale-efl-sr \
locale-efl-tr \
locale-efl-vi \
locale-efl-zh-CN"

RDEPENDS:${PN} += "efl"

inherit rpm
