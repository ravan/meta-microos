SUMMARY = "Translations for package caja-dropbox"
DESCRIPTION = "Provides translations for the 'caja-dropbox' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-dropbox-lang-1.28.0-2.7.noarch.rpm"
RPM_HASH = "7a0918e466536e098c5dc06bd1e022280ae6682e11052d6da5833c974fbc22dca16a664240648e266c3d97436fbec087921679efd6facdab78ce6a6838e4bba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-dropbox-lang \
caja-dropbox-lang-all \
locale-caja-dropbox-ca \
locale-caja-dropbox-cs \
locale-caja-dropbox-da \
locale-caja-dropbox-el \
locale-caja-dropbox-en-GB \
locale-caja-dropbox-es \
locale-caja-dropbox-fr \
locale-caja-dropbox-id \
locale-caja-dropbox-it \
locale-caja-dropbox-ja \
locale-caja-dropbox-ko \
locale-caja-dropbox-ms \
locale-caja-dropbox-nb \
locale-caja-dropbox-nl \
locale-caja-dropbox-oc \
locale-caja-dropbox-pl \
locale-caja-dropbox-pt-BR \
locale-caja-dropbox-ru \
locale-caja-dropbox-sl \
locale-caja-dropbox-sr \
locale-caja-dropbox-sv \
locale-caja-dropbox-tr \
locale-caja-dropbox-uk \
locale-caja-dropbox-zh-CN \
locale-caja-dropbox-zh-TW"

RDEPENDS:${PN} += "caja-dropbox"

inherit rpm
