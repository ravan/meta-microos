SUMMARY = "Translations for package ruqola"
DESCRIPTION = "Provides translations for the 'ruqola' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "ruqola-lang-2.6.1-1.4.noarch.rpm"
RPM_HASH = "3ab0b8f7a5f50141aeb86830c72286132056327b4fb0e19991d8792fd6b5db1b7aa912028678021055b18a32e9c57a6ef72a2918563550192bd8677293989e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ruqola-ar \
locale-ruqola-ast \
locale-ruqola-ca \
locale-ruqola-ca@valencia \
locale-ruqola-cs \
locale-ruqola-de \
locale-ruqola-en-GB \
locale-ruqola-eo \
locale-ruqola-es \
locale-ruqola-et \
locale-ruqola-eu \
locale-ruqola-fi \
locale-ruqola-fr \
locale-ruqola-ga \
locale-ruqola-gl \
locale-ruqola-hu \
locale-ruqola-ia \
locale-ruqola-it \
locale-ruqola-ja \
locale-ruqola-ka \
locale-ruqola-lt \
locale-ruqola-nl \
locale-ruqola-pl \
locale-ruqola-pt \
locale-ruqola-pt-BR \
locale-ruqola-ru \
locale-ruqola-sk \
locale-ruqola-sl \
locale-ruqola-sv \
locale-ruqola-tr \
locale-ruqola-uk \
locale-ruqola-zh-CN \
locale-ruqola-zh-TW \
ruqola-lang \
ruqola-lang-all"

RDEPENDS:${PN} += "ruqola"

inherit rpm
