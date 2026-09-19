SUMMARY = "Translations for package libhandy"
DESCRIPTION = "Provides translations for the 'libhandy' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "libhandy-lang-1.8.3-2.3.noarch.rpm"
RPM_HASH = "9dbd0e2a215fe19478071853343d95916d41c7c4ff57acf9f208dbc8afcce5d53cc3c29e5c7774796b29240a48d9c943054c975b31c42cc1abe5681289a038dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libhandy-lang \
libhandy-lang-all \
locale-libhandy-ca \
locale-libhandy-cs \
locale-libhandy-de \
locale-libhandy-en-GB \
locale-libhandy-es \
locale-libhandy-eu \
locale-libhandy-fa \
locale-libhandy-fi \
locale-libhandy-fr \
locale-libhandy-fur \
locale-libhandy-gl \
locale-libhandy-hr \
locale-libhandy-hu \
locale-libhandy-id \
locale-libhandy-ka \
locale-libhandy-ko \
locale-libhandy-nl \
locale-libhandy-oc \
locale-libhandy-pl \
locale-libhandy-pt \
locale-libhandy-pt-BR \
locale-libhandy-ro \
locale-libhandy-ru \
locale-libhandy-sl \
locale-libhandy-sr \
locale-libhandy-sv \
locale-libhandy-tr \
locale-libhandy-uk \
locale-libhandy-zh-CN"

RDEPENDS:${PN} += "libhandy"

inherit rpm
