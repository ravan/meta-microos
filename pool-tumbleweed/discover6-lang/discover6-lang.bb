SUMMARY = "Translations for package discover6"
DESCRIPTION = "Provides translations for the 'discover6' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "discover6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "ea70026d28a0aed0f9de8e90ea0fa6053e7e82ade0abc9fae97711a996c370008ea1cc29735c601677d8f770d93bc0bfddb5c646f70d78f8fb7ecf0f4ba2c57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "discover6-lang \
discover6-lang-all \
locale-discover6-ar \
locale-discover6-ast \
locale-discover6-az \
locale-discover6-be \
locale-discover6-bg \
locale-discover6-bs \
locale-discover6-ca \
locale-discover6-ca@valencia \
locale-discover6-cs \
locale-discover6-da \
locale-discover6-de \
locale-discover6-el \
locale-discover6-en-GB \
locale-discover6-eo \
locale-discover6-es \
locale-discover6-et \
locale-discover6-eu \
locale-discover6-fa \
locale-discover6-fi \
locale-discover6-fr \
locale-discover6-ga \
locale-discover6-gl \
locale-discover6-he \
locale-discover6-hi \
locale-discover6-hu \
locale-discover6-ia \
locale-discover6-id \
locale-discover6-is \
locale-discover6-it \
locale-discover6-ja \
locale-discover6-ka \
locale-discover6-kk \
locale-discover6-ko \
locale-discover6-lt \
locale-discover6-lv \
locale-discover6-ml \
locale-discover6-mr \
locale-discover6-nb \
locale-discover6-nds \
locale-discover6-nl \
locale-discover6-nn \
locale-discover6-pa \
locale-discover6-pl \
locale-discover6-pt \
locale-discover6-pt-BR \
locale-discover6-ro \
locale-discover6-ru \
locale-discover6-sk \
locale-discover6-sl \
locale-discover6-sr \
locale-discover6-sr@ijekavian \
locale-discover6-sr@ijekavianlatin \
locale-discover6-sr@latin \
locale-discover6-sv \
locale-discover6-ta \
locale-discover6-tr \
locale-discover6-ug \
locale-discover6-uk \
locale-discover6-vi \
locale-discover6-zh-CN \
locale-discover6-zh-TW"

RDEPENDS:${PN} += "discover6"

inherit rpm
