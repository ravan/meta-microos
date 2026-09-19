SUMMARY = "Translations for package breeze6-style"
DESCRIPTION = "Provides translations for the 'breeze6-style' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-style-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "be00aa538f0c6e9c69f23287411965bd35b2267968f5e097ce2b2507be635d50b8ea7865fbba593f399abe7657443442a4ecd65070c1376e2cbc0d3086c46291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze6-style-lang \
breeze6-style-lang-all \
locale-breeze6-style-ar \
locale-breeze6-style-ast \
locale-breeze6-style-az \
locale-breeze6-style-bg \
locale-breeze6-style-bs \
locale-breeze6-style-ca \
locale-breeze6-style-ca@valencia \
locale-breeze6-style-cs \
locale-breeze6-style-da \
locale-breeze6-style-de \
locale-breeze6-style-el \
locale-breeze6-style-en-GB \
locale-breeze6-style-eo \
locale-breeze6-style-es \
locale-breeze6-style-et \
locale-breeze6-style-eu \
locale-breeze6-style-fi \
locale-breeze6-style-fr \
locale-breeze6-style-ga \
locale-breeze6-style-gl \
locale-breeze6-style-he \
locale-breeze6-style-hi \
locale-breeze6-style-hr \
locale-breeze6-style-hu \
locale-breeze6-style-ia \
locale-breeze6-style-id \
locale-breeze6-style-is \
locale-breeze6-style-it \
locale-breeze6-style-ja \
locale-breeze6-style-ka \
locale-breeze6-style-ko \
locale-breeze6-style-lt \
locale-breeze6-style-lv \
locale-breeze6-style-ml \
locale-breeze6-style-nb \
locale-breeze6-style-nds \
locale-breeze6-style-nl \
locale-breeze6-style-nn \
locale-breeze6-style-pa \
locale-breeze6-style-pl \
locale-breeze6-style-pt \
locale-breeze6-style-pt-BR \
locale-breeze6-style-ro \
locale-breeze6-style-ru \
locale-breeze6-style-sk \
locale-breeze6-style-sl \
locale-breeze6-style-sr \
locale-breeze6-style-sr@ijekavian \
locale-breeze6-style-sr@ijekavianlatin \
locale-breeze6-style-sr@latin \
locale-breeze6-style-sv \
locale-breeze6-style-ta \
locale-breeze6-style-tr \
locale-breeze6-style-uk \
locale-breeze6-style-zh-CN \
locale-breeze6-style-zh-TW"

RDEPENDS:${PN} += "breeze6-style"

inherit rpm
