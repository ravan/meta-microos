SUMMARY = "Translations for package rnote"
DESCRIPTION = "Provides translations for the 'rnote' package."
LICENSE = "GPL-3.0-only"

PV = "0.14.2"

RPM_NAME = "rnote-lang-0.14.2-1.2.noarch.rpm"
RPM_HASH = "50577f29728ee42bf058b9e71dca6b8529626483c5198e96d909ce4a26e2f507570375425fff1a630fa9e902d499f3fa6870bc70413f492ca7f5b9199ee7a21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rnote-ar \
locale-rnote-bn \
locale-rnote-bs \
locale-rnote-cs \
locale-rnote-de \
locale-rnote-eo \
locale-rnote-es \
locale-rnote-eu \
locale-rnote-fa \
locale-rnote-fi \
locale-rnote-fr \
locale-rnote-he \
locale-rnote-hi \
locale-rnote-hu \
locale-rnote-ia \
locale-rnote-id \
locale-rnote-it \
locale-rnote-ja \
locale-rnote-ka \
locale-rnote-ko \
locale-rnote-mk \
locale-rnote-ml \
locale-rnote-ms \
locale-rnote-nb-NO \
locale-rnote-ne \
locale-rnote-nl \
locale-rnote-pl \
locale-rnote-pt \
locale-rnote-pt-BR \
locale-rnote-ro \
locale-rnote-ru \
locale-rnote-sl \
locale-rnote-sv \
locale-rnote-ta \
locale-rnote-th \
locale-rnote-tr \
locale-rnote-uk \
locale-rnote-vi \
locale-rnote-zh-CN \
locale-rnote-zh-HK \
locale-rnote-zh-TW \
rnote-lang \
rnote-lang-all"

RDEPENDS:${PN} += "rnote"

inherit rpm
