SUMMARY = "Translations for package kaffeine"
DESCRIPTION = "Provides translations for the 'kaffeine' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.19git.20250316T013712~afc3f87"

RPM_NAME = "kaffeine-lang-2.0.19git.20250316T013712~afc3f87-1.6.noarch.rpm"
RPM_HASH = "7dffca4077dde0076f13b914681c8f34b09fde79eff029a02e7fa74215b65e5b9e9ac4240c66ad44ca6062e22c813c1eb0a779d1a5309c4b89bbec4037d98e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaffeine-lang \
kaffeine-lang-all \
locale-kaffeine-ar \
locale-kaffeine-be \
locale-kaffeine-bg \
locale-kaffeine-bs \
locale-kaffeine-ca \
locale-kaffeine-ca@valencia \
locale-kaffeine-cs \
locale-kaffeine-da \
locale-kaffeine-de \
locale-kaffeine-el \
locale-kaffeine-en-GB \
locale-kaffeine-eo \
locale-kaffeine-es \
locale-kaffeine-et \
locale-kaffeine-eu \
locale-kaffeine-fi \
locale-kaffeine-fr \
locale-kaffeine-ga \
locale-kaffeine-gl \
locale-kaffeine-he \
locale-kaffeine-hi \
locale-kaffeine-hr \
locale-kaffeine-hu \
locale-kaffeine-ia \
locale-kaffeine-id \
locale-kaffeine-it \
locale-kaffeine-ja \
locale-kaffeine-ka \
locale-kaffeine-km \
locale-kaffeine-ko \
locale-kaffeine-lt \
locale-kaffeine-mai \
locale-kaffeine-mr \
locale-kaffeine-nb \
locale-kaffeine-nds \
locale-kaffeine-nl \
locale-kaffeine-nn \
locale-kaffeine-pa \
locale-kaffeine-pl \
locale-kaffeine-pt \
locale-kaffeine-pt-BR \
locale-kaffeine-ro \
locale-kaffeine-ru \
locale-kaffeine-sk \
locale-kaffeine-sl \
locale-kaffeine-sq \
locale-kaffeine-sr \
locale-kaffeine-sr@ijekavian \
locale-kaffeine-sr@ijekavianlatin \
locale-kaffeine-sr@latin \
locale-kaffeine-sv \
locale-kaffeine-th \
locale-kaffeine-tr \
locale-kaffeine-ug \
locale-kaffeine-uk \
locale-kaffeine-zh-CN \
locale-kaffeine-zh-TW"

RDEPENDS:${PN} += "kaffeine"

inherit rpm
