SUMMARY = "Translations for package accountsservice"
DESCRIPTION = "Provides translations for the 'accountsservice' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-lang-23.13.9-12.3.noarch.rpm"
RPM_HASH = "8cc7272451ca9d154d1e83a3d654e9777d70c50733de17a0fce6dce4e6b4ca08184241047aee46cc7f464a205990272d61bd963177fc09c2d9ff81bf0afdc24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accountsservice-lang \
accountsservice-lang-all \
locale-accountsservice-af \
locale-accountsservice-ar \
locale-accountsservice-as \
locale-accountsservice-ast \
locale-accountsservice-az \
locale-accountsservice-be \
locale-accountsservice-bg \
locale-accountsservice-bn-IN \
locale-accountsservice-ca \
locale-accountsservice-ca@valencia \
locale-accountsservice-cs \
locale-accountsservice-cy \
locale-accountsservice-da \
locale-accountsservice-de \
locale-accountsservice-el \
locale-accountsservice-eo \
locale-accountsservice-es \
locale-accountsservice-et \
locale-accountsservice-eu \
locale-accountsservice-fa \
locale-accountsservice-fi \
locale-accountsservice-fr \
locale-accountsservice-fur \
locale-accountsservice-ga \
locale-accountsservice-gl \
locale-accountsservice-gu \
locale-accountsservice-he \
locale-accountsservice-hi \
locale-accountsservice-hr \
locale-accountsservice-hu \
locale-accountsservice-ia \
locale-accountsservice-id \
locale-accountsservice-it \
locale-accountsservice-ja \
locale-accountsservice-ka \
locale-accountsservice-kk \
locale-accountsservice-kn \
locale-accountsservice-ko \
locale-accountsservice-lt \
locale-accountsservice-lv \
locale-accountsservice-ml \
locale-accountsservice-mr \
locale-accountsservice-ms \
locale-accountsservice-nb \
locale-accountsservice-nl \
locale-accountsservice-nn \
locale-accountsservice-oc \
locale-accountsservice-or \
locale-accountsservice-pa \
locale-accountsservice-pl \
locale-accountsservice-pt \
locale-accountsservice-pt-BR \
locale-accountsservice-ro \
locale-accountsservice-ru \
locale-accountsservice-sk \
locale-accountsservice-sl \
locale-accountsservice-sq \
locale-accountsservice-sr \
locale-accountsservice-sr@latin \
locale-accountsservice-sv \
locale-accountsservice-ta \
locale-accountsservice-te \
locale-accountsservice-th \
locale-accountsservice-tr \
locale-accountsservice-uk \
locale-accountsservice-vi \
locale-accountsservice-wa \
locale-accountsservice-zh-CN \
locale-accountsservice-zh-HK \
locale-accountsservice-zh-TW"

RDEPENDS:${PN} += "accountsservice"

inherit rpm
