SUMMARY = "Translations for package libgedit-gfls"
DESCRIPTION = "Provides translations for the 'libgedit-gfls' package."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "libgedit-gfls-lang-0.4.2-1.1.noarch.rpm"
RPM_HASH = "02b1dade23dd26a7f5ef4a0bd43cf2a982a391bbbabe06c5cd7b46c88e67a88cb279c30606686468d1fa7b328045e53a21a758c47550bd33891be24bd4a7b770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgedit-gfls-lang \
libgedit-gfls-lang-all \
locale-libgedit-gfls-be \
locale-libgedit-gfls-bg \
locale-libgedit-gfls-cs \
locale-libgedit-gfls-da \
locale-libgedit-gfls-de \
locale-libgedit-gfls-el \
locale-libgedit-gfls-eu \
locale-libgedit-gfls-hu \
locale-libgedit-gfls-ka \
locale-libgedit-gfls-kk \
locale-libgedit-gfls-lt \
locale-libgedit-gfls-pl \
locale-libgedit-gfls-pt-BR \
locale-libgedit-gfls-ru \
locale-libgedit-gfls-sl \
locale-libgedit-gfls-sr \
locale-libgedit-gfls-sv \
locale-libgedit-gfls-tr \
locale-libgedit-gfls-uk \
locale-libgedit-gfls-zh-CN"

RDEPENDS:${PN} += "libgedit-gfls"

inherit rpm
