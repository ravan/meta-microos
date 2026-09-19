SUMMARY = "Translations for package libgedit-tepl-6"
DESCRIPTION = "Provides translations for the 'libgedit-tepl-6' package."
LICENSE = "LGPL-3.0-or-later"

PV = "6.14.0"

RPM_NAME = "libgedit-tepl-6-lang-6.14.0-2.5.noarch.rpm"
RPM_HASH = "e2b95fb2665beb14183dbdc37adff962134bf507699f7e8e79070d5d63750490af0631af54ae5fc8effb024a59f656887848c82c708939fafb105e10bbc92c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgedit-tepl-6-lang \
libgedit-tepl-6-lang-all \
locale-libgedit-tepl-6-be \
locale-libgedit-tepl-6-ca \
locale-libgedit-tepl-6-cs \
locale-libgedit-tepl-6-da \
locale-libgedit-tepl-6-de \
locale-libgedit-tepl-6-el \
locale-libgedit-tepl-6-en-GB \
locale-libgedit-tepl-6-es \
locale-libgedit-tepl-6-eu \
locale-libgedit-tepl-6-fr \
locale-libgedit-tepl-6-fur \
locale-libgedit-tepl-6-hr \
locale-libgedit-tepl-6-hu \
locale-libgedit-tepl-6-id \
locale-libgedit-tepl-6-ja \
locale-libgedit-tepl-6-ka \
locale-libgedit-tepl-6-nl \
locale-libgedit-tepl-6-pl \
locale-libgedit-tepl-6-pt-BR \
locale-libgedit-tepl-6-ro \
locale-libgedit-tepl-6-ru \
locale-libgedit-tepl-6-sl \
locale-libgedit-tepl-6-sr \
locale-libgedit-tepl-6-sv \
locale-libgedit-tepl-6-tr \
locale-libgedit-tepl-6-uk \
locale-libgedit-tepl-6-zh-CN"

RDEPENDS:${PN} += "libgedit-tepl-6"

inherit rpm
