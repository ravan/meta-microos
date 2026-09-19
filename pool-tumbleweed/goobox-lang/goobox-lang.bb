SUMMARY = "Translations for package goobox"
DESCRIPTION = "Provides translations for the 'goobox' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "goobox-lang-3.6.0-5.6.noarch.rpm"
RPM_HASH = "5b195130682afdec8afd1561a692501d2d86ead068c371e99be656c0d673cfb17c233581b006cce239e5f43efa10bbe31f1ad749070b11a8c061d5cfc8a90115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goobox-lang \
goobox-lang-all \
locale-goobox-ar \
locale-goobox-bg \
locale-goobox-bs \
locale-goobox-ca \
locale-goobox-cs \
locale-goobox-da \
locale-goobox-de \
locale-goobox-dz \
locale-goobox-el \
locale-goobox-en-CA \
locale-goobox-en-GB \
locale-goobox-es \
locale-goobox-eu \
locale-goobox-fi \
locale-goobox-fr \
locale-goobox-fur \
locale-goobox-gl \
locale-goobox-he \
locale-goobox-hu \
locale-goobox-id \
locale-goobox-it \
locale-goobox-ja \
locale-goobox-ko \
locale-goobox-lt \
locale-goobox-lv \
locale-goobox-nb \
locale-goobox-ne \
locale-goobox-nl \
locale-goobox-oc \
locale-goobox-pa \
locale-goobox-pl \
locale-goobox-pt \
locale-goobox-pt-BR \
locale-goobox-ro \
locale-goobox-ru \
locale-goobox-sl \
locale-goobox-sq \
locale-goobox-sr \
locale-goobox-sr@latin \
locale-goobox-sv \
locale-goobox-tr \
locale-goobox-vi \
locale-goobox-zh-CN \
locale-goobox-zh-TW"

RDEPENDS:${PN} += "goobox"

inherit rpm
