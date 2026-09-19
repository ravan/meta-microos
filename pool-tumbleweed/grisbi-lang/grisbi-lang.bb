SUMMARY = "Translations for package grisbi"
DESCRIPTION = "Provides translations for the 'grisbi' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.90.1"

RPM_NAME = "grisbi-lang-3.90.1-1.6.noarch.rpm"
RPM_HASH = "5e3709c672daadefa49f467238af5b6b44ad3c35772e6a0a3eaf2dbb2a3d63b8d37d37c5b750d64c42ebf7c0fe2082e546d8e3d808d3c6f7a38f0073de51480a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grisbi-lang \
grisbi-lang-all \
locale-grisbi-cs \
locale-grisbi-da \
locale-grisbi-de \
locale-grisbi-el \
locale-grisbi-en-GB \
locale-grisbi-en-US \
locale-grisbi-eo \
locale-grisbi-es \
locale-grisbi-fa \
locale-grisbi-fr \
locale-grisbi-he \
locale-grisbi-it \
locale-grisbi-lv \
locale-grisbi-nl \
locale-grisbi-pl \
locale-grisbi-pt-BR \
locale-grisbi-ro \
locale-grisbi-ru \
locale-grisbi-zh-CN"

RDEPENDS:${PN} += "grisbi"

inherit rpm
