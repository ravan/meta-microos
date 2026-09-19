SUMMARY = "Translations for package haguichi"
DESCRIPTION = "Provides translations for the 'haguichi' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.4"

RPM_NAME = "haguichi-lang-1.5.4-1.3.noarch.rpm"
RPM_HASH = "fc5df7c5d0b031bfd840ebd877729b864016fb8db7a7149a6fce7147cb8205a9ad67c6d446b3ede8d681d8736d6b8513ee6c3e95f9a73c286857500b34aeed35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haguichi-lang \
haguichi-lang-all \
locale-haguichi-ast \
locale-haguichi-bg \
locale-haguichi-cs \
locale-haguichi-de \
locale-haguichi-es \
locale-haguichi-fi \
locale-haguichi-fr \
locale-haguichi-hu \
locale-haguichi-id \
locale-haguichi-it \
locale-haguichi-ja \
locale-haguichi-kk \
locale-haguichi-lt \
locale-haguichi-nl \
locale-haguichi-pl \
locale-haguichi-pt \
locale-haguichi-pt-BR \
locale-haguichi-ru \
locale-haguichi-sk \
locale-haguichi-sv \
locale-haguichi-tr \
locale-haguichi-uk"

RDEPENDS:${PN} += "haguichi"

inherit rpm
