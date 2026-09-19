SUMMARY = "Translations for package libgovirt"
DESCRIPTION = "Provides translations for the 'libgovirt' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "libgovirt-lang-0.3.11-1.3.noarch.rpm"
RPM_HASH = "3ccad615990c3c48319598a8ec8049ccf4e109b668fa0d23ae8a03ab3490902893d58d4b7ebe1c19ceaf6f2e906b7b5464e5ad6b10e79b0dbdbff942daa30f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgovirt-lang \
libgovirt-lang-all \
locale-libgovirt-bg \
locale-libgovirt-bs \
locale-libgovirt-ca \
locale-libgovirt-cs \
locale-libgovirt-da \
locale-libgovirt-de \
locale-libgovirt-el \
locale-libgovirt-es \
locale-libgovirt-eu \
locale-libgovirt-fi \
locale-libgovirt-fr \
locale-libgovirt-fur \
locale-libgovirt-hi \
locale-libgovirt-hr \
locale-libgovirt-hu \
locale-libgovirt-id \
locale-libgovirt-it \
locale-libgovirt-ka \
locale-libgovirt-ko \
locale-libgovirt-lt \
locale-libgovirt-nl \
locale-libgovirt-oc \
locale-libgovirt-pl \
locale-libgovirt-pt \
locale-libgovirt-pt-BR \
locale-libgovirt-ro \
locale-libgovirt-ru \
locale-libgovirt-sl \
locale-libgovirt-sr \
locale-libgovirt-sr@latin \
locale-libgovirt-sv \
locale-libgovirt-tr \
locale-libgovirt-uk \
locale-libgovirt-zh-CN"

RDEPENDS:${PN} += "libgovirt"

inherit rpm
