SUMMARY = "Translations for package sharutils"
DESCRIPTION = "Provides translations for the 'sharutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-lang-4.15.2-10.5.noarch.rpm"
RPM_HASH = "3295203f6919f2b2ad6f0ce641a611beb8aa541bc4827c69aa27c64cd7795573768213f31321040e0275d1d102918c7f09a9ea721e79e8b7168a4ba4491bca29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sharutils-bg \
locale-sharutils-ca \
locale-sharutils-cs \
locale-sharutils-da \
locale-sharutils-de \
locale-sharutils-el \
locale-sharutils-eo \
locale-sharutils-es \
locale-sharutils-et \
locale-sharutils-fi \
locale-sharutils-fr \
locale-sharutils-ga \
locale-sharutils-gl \
locale-sharutils-hu \
locale-sharutils-id \
locale-sharutils-it \
locale-sharutils-ja \
locale-sharutils-nl \
locale-sharutils-pl \
locale-sharutils-pt-BR \
locale-sharutils-ru \
locale-sharutils-sr \
locale-sharutils-sv \
locale-sharutils-tr \
locale-sharutils-uk \
locale-sharutils-vi \
locale-sharutils-zh-CN \
locale-sharutils-zh-TW \
sharutils-lang \
sharutils-lang-all"

RDEPENDS:${PN} += "sharutils"

inherit rpm
