SUMMARY = "Translations for package clapper"
DESCRIPTION = "Provides translations for the 'clapper' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-lang-0.10.0-1.4.noarch.rpm"
RPM_HASH = "8994a1266be6e426128614cfd672a6bf25348df1182049cbf1068251ea8c5de457adec9e2e095ef7ad0261ebb010c5e4494b68a428a050e37712b4cc48e822ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clapper-lang \
clapper-lang-all \
locale-clapper-ar \
locale-clapper-ast \
locale-clapper-ca \
locale-clapper-cs \
locale-clapper-de \
locale-clapper-es \
locale-clapper-eu \
locale-clapper-fa \
locale-clapper-fi \
locale-clapper-fr \
locale-clapper-he \
locale-clapper-hi \
locale-clapper-hr \
locale-clapper-hu \
locale-clapper-it \
locale-clapper-ja \
locale-clapper-lt \
locale-clapper-nl \
locale-clapper-oc \
locale-clapper-pl \
locale-clapper-pt \
locale-clapper-pt-BR \
locale-clapper-ro \
locale-clapper-ru \
locale-clapper-sk \
locale-clapper-sv \
locale-clapper-tr \
locale-clapper-zh-CN"

RDEPENDS:${PN} += "clapper"

inherit rpm
