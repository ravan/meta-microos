SUMMARY = "Translations for package neomutt"
DESCRIPTION = "Provides translations for the 'neomutt' package."
LICENSE = "GPL-2.0-or-later"

PV = "20260406"

RPM_NAME = "neomutt-lang-20260406-1.4.noarch.rpm"
RPM_HASH = "ef708794efd8ec3e8459a1f50e6eaabdb19cef7afbd5c64ead99c2baadd3820b93f353e8155d53e2d088ceb97bf6c6458a8f980d2a100446fce570af7cb5b02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neomutt-bg \
locale-neomutt-ca \
locale-neomutt-cs \
locale-neomutt-da \
locale-neomutt-de \
locale-neomutt-el \
locale-neomutt-en-GB \
locale-neomutt-eo \
locale-neomutt-es \
locale-neomutt-et \
locale-neomutt-eu \
locale-neomutt-fi \
locale-neomutt-fr \
locale-neomutt-ga \
locale-neomutt-gl \
locale-neomutt-hu \
locale-neomutt-id \
locale-neomutt-it \
locale-neomutt-ja \
locale-neomutt-ko \
locale-neomutt-lt \
locale-neomutt-nb-NO \
locale-neomutt-nl \
locale-neomutt-pl \
locale-neomutt-pt-BR \
locale-neomutt-ru \
locale-neomutt-sk \
locale-neomutt-sr \
locale-neomutt-sv \
locale-neomutt-tr \
locale-neomutt-uk \
locale-neomutt-zh-CN \
locale-neomutt-zh-TW \
neomutt-lang \
neomutt-lang-all"

RDEPENDS:${PN} += "neomutt"

inherit rpm
