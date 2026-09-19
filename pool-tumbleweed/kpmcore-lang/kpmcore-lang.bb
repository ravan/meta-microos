SUMMARY = "Translations for package kpmcore"
DESCRIPTION = "Provides translations for the 'kpmcore' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpmcore-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "30634041f2c34a7cd4f2a366cc731c3626d86131ff55b373e5ba243a8c9ec72ae853b582c319f9a5a07fbd9b599f88f3402298896084e41a6e032b1d0acfa84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpmcore-lang \
kpmcore-lang-all \
locale-kpmcore-ar \
locale-kpmcore-ast \
locale-kpmcore-bg \
locale-kpmcore-bs \
locale-kpmcore-ca \
locale-kpmcore-ca@valencia \
locale-kpmcore-cs \
locale-kpmcore-da \
locale-kpmcore-de \
locale-kpmcore-el \
locale-kpmcore-en-GB \
locale-kpmcore-eo \
locale-kpmcore-es \
locale-kpmcore-et \
locale-kpmcore-eu \
locale-kpmcore-fi \
locale-kpmcore-fr \
locale-kpmcore-ga \
locale-kpmcore-gl \
locale-kpmcore-he \
locale-kpmcore-hi \
locale-kpmcore-hr \
locale-kpmcore-hu \
locale-kpmcore-ia \
locale-kpmcore-id \
locale-kpmcore-is \
locale-kpmcore-it \
locale-kpmcore-ja \
locale-kpmcore-ka \
locale-kpmcore-ko \
locale-kpmcore-lt \
locale-kpmcore-lv \
locale-kpmcore-mai \
locale-kpmcore-mr \
locale-kpmcore-nb \
locale-kpmcore-nds \
locale-kpmcore-nl \
locale-kpmcore-nn \
locale-kpmcore-pa \
locale-kpmcore-pl \
locale-kpmcore-pt \
locale-kpmcore-pt-BR \
locale-kpmcore-ro \
locale-kpmcore-ru \
locale-kpmcore-sk \
locale-kpmcore-sl \
locale-kpmcore-sr \
locale-kpmcore-sr@ijekavian \
locale-kpmcore-sr@ijekavianlatin \
locale-kpmcore-sr@latin \
locale-kpmcore-sv \
locale-kpmcore-th \
locale-kpmcore-tr \
locale-kpmcore-ug \
locale-kpmcore-uk \
locale-kpmcore-zh-CN \
locale-kpmcore-zh-TW"

RDEPENDS:${PN} += "kpmcore"

inherit rpm
