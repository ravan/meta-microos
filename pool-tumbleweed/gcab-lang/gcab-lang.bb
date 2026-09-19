SUMMARY = "Translations for package gcab"
DESCRIPTION = "Provides translations for the 'gcab' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-lang-1.6-2.1.noarch.rpm"
RPM_HASH = "b12f20a5437314f7ca9fd140cd2b9a77cd33ff6eaf50298dcc090b287a382380505980191a0e984d2009987765df10140acb7ede03983d32bbf56572e403ad6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcab-lang \
gcab-lang-all \
locale-gcab-bs \
locale-gcab-cs \
locale-gcab-da \
locale-gcab-de \
locale-gcab-el \
locale-gcab-en-GB \
locale-gcab-es \
locale-gcab-eu \
locale-gcab-fi \
locale-gcab-fr \
locale-gcab-fur \
locale-gcab-gl \
locale-gcab-hr \
locale-gcab-hu \
locale-gcab-id \
locale-gcab-ja \
locale-gcab-ka \
locale-gcab-lt \
locale-gcab-lv \
locale-gcab-nb \
locale-gcab-nl \
locale-gcab-oc \
locale-gcab-pl \
locale-gcab-pt \
locale-gcab-pt-BR \
locale-gcab-ro \
locale-gcab-ru \
locale-gcab-sl \
locale-gcab-sr \
locale-gcab-sr@latin \
locale-gcab-sv \
locale-gcab-tr \
locale-gcab-uk \
locale-gcab-zh-CN"

RDEPENDS:${PN} += "gcab"

inherit rpm
