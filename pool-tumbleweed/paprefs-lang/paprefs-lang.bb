SUMMARY = "Translations for package paprefs"
DESCRIPTION = "Provides translations for the 'paprefs' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "paprefs-lang-1.2-2.8.noarch.rpm"
RPM_HASH = "28332cade009ed3b2bc365b0e6d76b49b7125329720b59557156b1e39fcb288bb624d147d3b3c79f524c193816a661d23bbaeb7a0e85bded8c30b69ea056d604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-paprefs-as \
locale-paprefs-ast \
locale-paprefs-bn-IN \
locale-paprefs-ca \
locale-paprefs-cs \
locale-paprefs-da \
locale-paprefs-de \
locale-paprefs-el \
locale-paprefs-es \
locale-paprefs-fi \
locale-paprefs-fr \
locale-paprefs-gl \
locale-paprefs-gu \
locale-paprefs-he \
locale-paprefs-hi \
locale-paprefs-hr \
locale-paprefs-hu \
locale-paprefs-id \
locale-paprefs-it \
locale-paprefs-ja \
locale-paprefs-kk \
locale-paprefs-kn \
locale-paprefs-ko \
locale-paprefs-lt \
locale-paprefs-ml \
locale-paprefs-mr \
locale-paprefs-ms \
locale-paprefs-nl \
locale-paprefs-nn \
locale-paprefs-or \
locale-paprefs-pa \
locale-paprefs-pl \
locale-paprefs-pt \
locale-paprefs-pt-BR \
locale-paprefs-si \
locale-paprefs-sk \
locale-paprefs-sr \
locale-paprefs-sr@latin \
locale-paprefs-sv \
locale-paprefs-ta \
locale-paprefs-te \
locale-paprefs-th \
locale-paprefs-tr \
locale-paprefs-uk \
locale-paprefs-zh-CN \
locale-paprefs-zh-TW \
paprefs-lang \
paprefs-lang-all"

RDEPENDS:${PN} += "paprefs"

inherit rpm
