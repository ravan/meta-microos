SUMMARY = "Translations for package polkit-kde-agent-6"
DESCRIPTION = "Provides translations for the 'polkit-kde-agent-6' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "polkit-kde-agent-6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "16c83ae8aeb3fef262125dd3c1427e909913b3322f44391182641fd416e9af6097bf8084c8afffd137731c28262b10d471d2611415680c8bf01dde86f14e44d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-polkit-kde-agent-6-ar \
locale-polkit-kde-agent-6-ast \
locale-polkit-kde-agent-6-be \
locale-polkit-kde-agent-6-bg \
locale-polkit-kde-agent-6-bs \
locale-polkit-kde-agent-6-ca \
locale-polkit-kde-agent-6-ca@valencia \
locale-polkit-kde-agent-6-cs \
locale-polkit-kde-agent-6-da \
locale-polkit-kde-agent-6-de \
locale-polkit-kde-agent-6-el \
locale-polkit-kde-agent-6-en-GB \
locale-polkit-kde-agent-6-eo \
locale-polkit-kde-agent-6-es \
locale-polkit-kde-agent-6-et \
locale-polkit-kde-agent-6-eu \
locale-polkit-kde-agent-6-fi \
locale-polkit-kde-agent-6-fr \
locale-polkit-kde-agent-6-ga \
locale-polkit-kde-agent-6-gl \
locale-polkit-kde-agent-6-he \
locale-polkit-kde-agent-6-hi \
locale-polkit-kde-agent-6-hr \
locale-polkit-kde-agent-6-hu \
locale-polkit-kde-agent-6-ia \
locale-polkit-kde-agent-6-id \
locale-polkit-kde-agent-6-is \
locale-polkit-kde-agent-6-it \
locale-polkit-kde-agent-6-ja \
locale-polkit-kde-agent-6-ka \
locale-polkit-kde-agent-6-kk \
locale-polkit-kde-agent-6-km \
locale-polkit-kde-agent-6-ko \
locale-polkit-kde-agent-6-lt \
locale-polkit-kde-agent-6-lv \
locale-polkit-kde-agent-6-mai \
locale-polkit-kde-agent-6-ml \
locale-polkit-kde-agent-6-mr \
locale-polkit-kde-agent-6-ms \
locale-polkit-kde-agent-6-nb \
locale-polkit-kde-agent-6-nds \
locale-polkit-kde-agent-6-nl \
locale-polkit-kde-agent-6-nn \
locale-polkit-kde-agent-6-pa \
locale-polkit-kde-agent-6-pl \
locale-polkit-kde-agent-6-pt \
locale-polkit-kde-agent-6-pt-BR \
locale-polkit-kde-agent-6-ro \
locale-polkit-kde-agent-6-ru \
locale-polkit-kde-agent-6-sk \
locale-polkit-kde-agent-6-sl \
locale-polkit-kde-agent-6-sr \
locale-polkit-kde-agent-6-sr@ijekavian \
locale-polkit-kde-agent-6-sr@ijekavianlatin \
locale-polkit-kde-agent-6-sr@latin \
locale-polkit-kde-agent-6-sv \
locale-polkit-kde-agent-6-th \
locale-polkit-kde-agent-6-tr \
locale-polkit-kde-agent-6-ug \
locale-polkit-kde-agent-6-uk \
locale-polkit-kde-agent-6-vi \
locale-polkit-kde-agent-6-zh-CN \
locale-polkit-kde-agent-6-zh-TW \
polkit-kde-agent-6-lang \
polkit-kde-agent-6-lang-all"

RDEPENDS:${PN} += "polkit-kde-agent-6"

inherit rpm
