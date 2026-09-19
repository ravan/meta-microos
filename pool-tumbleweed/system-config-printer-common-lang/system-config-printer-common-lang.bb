SUMMARY = "Translations for package system-config-printer-common"
DESCRIPTION = "Provides translations for the 'system-config-printer-common' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-common-lang-1.5.18-9.6.noarch.rpm"
RPM_HASH = "8c4eb68cac902a1dbc38ffff51c8a6bce30640e72eea27d970dcfcf18e0565079ae20f6470d38c0a42b55e68b7796b4921fd0dc3d7becf868838704aca860318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-system-config-printer-common-ar \
locale-system-config-printer-common-as \
locale-system-config-printer-common-ast \
locale-system-config-printer-common-bg \
locale-system-config-printer-common-bn \
locale-system-config-printer-common-bn-IN \
locale-system-config-printer-common-br \
locale-system-config-printer-common-bs \
locale-system-config-printer-common-ca \
locale-system-config-printer-common-cs \
locale-system-config-printer-common-cy \
locale-system-config-printer-common-da \
locale-system-config-printer-common-de \
locale-system-config-printer-common-el \
locale-system-config-printer-common-en-GB \
locale-system-config-printer-common-es \
locale-system-config-printer-common-et \
locale-system-config-printer-common-fa \
locale-system-config-printer-common-fi \
locale-system-config-printer-common-fr \
locale-system-config-printer-common-fur \
locale-system-config-printer-common-gu \
locale-system-config-printer-common-he \
locale-system-config-printer-common-hi \
locale-system-config-printer-common-hr \
locale-system-config-printer-common-hu \
locale-system-config-printer-common-id \
locale-system-config-printer-common-is \
locale-system-config-printer-common-it \
locale-system-config-printer-common-ja \
locale-system-config-printer-common-ka \
locale-system-config-printer-common-kn \
locale-system-config-printer-common-ko \
locale-system-config-printer-common-lt \
locale-system-config-printer-common-lv \
locale-system-config-printer-common-mai \
locale-system-config-printer-common-ml \
locale-system-config-printer-common-mr \
locale-system-config-printer-common-ms \
locale-system-config-printer-common-nb \
locale-system-config-printer-common-nds \
locale-system-config-printer-common-nl \
locale-system-config-printer-common-nn \
locale-system-config-printer-common-oc \
locale-system-config-printer-common-or \
locale-system-config-printer-common-pa \
locale-system-config-printer-common-pl \
locale-system-config-printer-common-pt \
locale-system-config-printer-common-pt-BR \
locale-system-config-printer-common-ro \
locale-system-config-printer-common-ru \
locale-system-config-printer-common-si \
locale-system-config-printer-common-sk \
locale-system-config-printer-common-sl \
locale-system-config-printer-common-sr \
locale-system-config-printer-common-sr@latin \
locale-system-config-printer-common-sv \
locale-system-config-printer-common-ta \
locale-system-config-printer-common-te \
locale-system-config-printer-common-th \
locale-system-config-printer-common-tr \
locale-system-config-printer-common-uk \
locale-system-config-printer-common-vi \
locale-system-config-printer-common-zh-CN \
locale-system-config-printer-common-zh-TW \
system-config-printer-common-lang \
system-config-printer-common-lang-all"

RDEPENDS:${PN} += "system-config-printer-common"

inherit rpm
