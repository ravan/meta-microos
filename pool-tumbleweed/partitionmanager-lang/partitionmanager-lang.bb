SUMMARY = "Translations for package partitionmanager"
DESCRIPTION = "Provides translations for the 'partitionmanager' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "partitionmanager-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4b8827a69272c05ed6b294b87991e527ff6babb1f3a6413fd62eaf211bd37f72d7457da2c5a2fa6fc7ec4fc2a349e1bf3477e6b1da6d32635daafd8bd61b86e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-partitionmanager-ar \
locale-partitionmanager-ast \
locale-partitionmanager-az \
locale-partitionmanager-bg \
locale-partitionmanager-bs \
locale-partitionmanager-ca \
locale-partitionmanager-ca@valencia \
locale-partitionmanager-cs \
locale-partitionmanager-da \
locale-partitionmanager-de \
locale-partitionmanager-el \
locale-partitionmanager-en-GB \
locale-partitionmanager-eo \
locale-partitionmanager-es \
locale-partitionmanager-et \
locale-partitionmanager-eu \
locale-partitionmanager-fi \
locale-partitionmanager-fr \
locale-partitionmanager-ga \
locale-partitionmanager-gl \
locale-partitionmanager-he \
locale-partitionmanager-hi \
locale-partitionmanager-hr \
locale-partitionmanager-hu \
locale-partitionmanager-ia \
locale-partitionmanager-id \
locale-partitionmanager-is \
locale-partitionmanager-it \
locale-partitionmanager-ja \
locale-partitionmanager-ka \
locale-partitionmanager-ko \
locale-partitionmanager-lt \
locale-partitionmanager-lv \
locale-partitionmanager-mai \
locale-partitionmanager-mr \
locale-partitionmanager-nb \
locale-partitionmanager-nds \
locale-partitionmanager-nl \
locale-partitionmanager-nn \
locale-partitionmanager-pa \
locale-partitionmanager-pl \
locale-partitionmanager-pt \
locale-partitionmanager-pt-BR \
locale-partitionmanager-ro \
locale-partitionmanager-ru \
locale-partitionmanager-sk \
locale-partitionmanager-sl \
locale-partitionmanager-sr \
locale-partitionmanager-sr@ijekavian \
locale-partitionmanager-sr@ijekavianlatin \
locale-partitionmanager-sr@latin \
locale-partitionmanager-sv \
locale-partitionmanager-ta \
locale-partitionmanager-th \
locale-partitionmanager-tr \
locale-partitionmanager-ug \
locale-partitionmanager-uk \
locale-partitionmanager-zh-CN \
locale-partitionmanager-zh-TW \
partitionmanager-lang \
partitionmanager-lang-all"

RDEPENDS:${PN} += "partitionmanager"

inherit rpm
