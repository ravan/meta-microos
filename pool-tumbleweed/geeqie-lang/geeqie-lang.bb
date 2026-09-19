SUMMARY = "Translations for package geeqie"
DESCRIPTION = "Provides translations for the 'geeqie' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.1"

RPM_NAME = "geeqie-lang-3.1-1.1.noarch.rpm"
RPM_HASH = "5010bc324b433c4bc2471a8e337fde65e2e1441b8ab1f818a70eddeedb962049e3eb356746fed23f2ea25a45eb2cb536ca9205f7b6e287cdf373be9ce54140bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geeqie-lang \
geeqie-lang-all \
locale-geeqie-ar \
locale-geeqie-be \
locale-geeqie-bg \
locale-geeqie-ca \
locale-geeqie-cs \
locale-geeqie-da \
locale-geeqie-de \
locale-geeqie-el \
locale-geeqie-en-GB \
locale-geeqie-eo \
locale-geeqie-es \
locale-geeqie-et \
locale-geeqie-eu \
locale-geeqie-fi \
locale-geeqie-fr \
locale-geeqie-hu \
locale-geeqie-id \
locale-geeqie-it \
locale-geeqie-ja \
locale-geeqie-ko \
locale-geeqie-nb \
locale-geeqie-nl \
locale-geeqie-pl \
locale-geeqie-pt-BR \
locale-geeqie-ro \
locale-geeqie-ru \
locale-geeqie-sk \
locale-geeqie-sl \
locale-geeqie-sr \
locale-geeqie-sr@latin \
locale-geeqie-sv \
locale-geeqie-th \
locale-geeqie-tr \
locale-geeqie-uk \
locale-geeqie-vi \
locale-geeqie-zh-CN \
locale-geeqie-zh-TW"

RDEPENDS:${PN} += "geeqie"

inherit rpm
