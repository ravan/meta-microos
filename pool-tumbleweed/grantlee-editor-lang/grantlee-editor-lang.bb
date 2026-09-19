SUMMARY = "Translations for package grantlee-editor"
DESCRIPTION = "Provides translations for the 'grantlee-editor' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "grantlee-editor-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "7c17429fad4efe4153d5b350a701136370ebb33513febc84e18da79254f026c6ed34b8b287da19420bf5e6971b1cf096245898e9116349c2735957f0f30899da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantlee-editor-lang \
grantlee-editor-lang-all \
locale-grantlee-editor-ar \
locale-grantlee-editor-ast \
locale-grantlee-editor-bg \
locale-grantlee-editor-bs \
locale-grantlee-editor-ca \
locale-grantlee-editor-ca@valencia \
locale-grantlee-editor-cs \
locale-grantlee-editor-da \
locale-grantlee-editor-de \
locale-grantlee-editor-el \
locale-grantlee-editor-en-GB \
locale-grantlee-editor-eo \
locale-grantlee-editor-es \
locale-grantlee-editor-et \
locale-grantlee-editor-eu \
locale-grantlee-editor-fi \
locale-grantlee-editor-fr \
locale-grantlee-editor-ga \
locale-grantlee-editor-gl \
locale-grantlee-editor-he \
locale-grantlee-editor-hi \
locale-grantlee-editor-hu \
locale-grantlee-editor-ia \
locale-grantlee-editor-it \
locale-grantlee-editor-ja \
locale-grantlee-editor-ka \
locale-grantlee-editor-kk \
locale-grantlee-editor-ko \
locale-grantlee-editor-lt \
locale-grantlee-editor-mr \
locale-grantlee-editor-nb \
locale-grantlee-editor-nds \
locale-grantlee-editor-nl \
locale-grantlee-editor-pl \
locale-grantlee-editor-pt \
locale-grantlee-editor-pt-BR \
locale-grantlee-editor-ro \
locale-grantlee-editor-ru \
locale-grantlee-editor-sk \
locale-grantlee-editor-sl \
locale-grantlee-editor-sr \
locale-grantlee-editor-sr@ijekavian \
locale-grantlee-editor-sr@ijekavianlatin \
locale-grantlee-editor-sr@latin \
locale-grantlee-editor-sv \
locale-grantlee-editor-ta \
locale-grantlee-editor-tr \
locale-grantlee-editor-ug \
locale-grantlee-editor-uk \
locale-grantlee-editor-zh-CN \
locale-grantlee-editor-zh-TW"

RDEPENDS:${PN} += "grantlee-editor"

inherit rpm
