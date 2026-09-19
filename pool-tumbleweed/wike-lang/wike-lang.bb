SUMMARY = "Translations for package wike"
DESCRIPTION = "Provides translations for the 'wike' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "wike-lang-3.2.1-1.2.noarch.rpm"
RPM_HASH = "d8a931199385785decc0e1ee4861b094f018ade1498230cde51a22faea51f838de5d9e072f2aa0c722a9287c23a47b920d5ef03428650b073f19d771ec3aae10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wike-ar \
locale-wike-bg \
locale-wike-bn \
locale-wike-ca \
locale-wike-cs \
locale-wike-de \
locale-wike-el \
locale-wike-es \
locale-wike-et \
locale-wike-eu \
locale-wike-fa \
locale-wike-fi \
locale-wike-fr \
locale-wike-gl \
locale-wike-he \
locale-wike-hi \
locale-wike-hr \
locale-wike-hu \
locale-wike-ia \
locale-wike-id \
locale-wike-it \
locale-wike-ja \
locale-wike-ka \
locale-wike-kk \
locale-wike-nl \
locale-wike-oc \
locale-wike-pl \
locale-wike-pt-BR \
locale-wike-ru \
locale-wike-sv \
locale-wike-ta \
locale-wike-tr \
locale-wike-uk \
locale-wike-vi \
locale-wike-zh-CN \
locale-wike-zh-TW \
wike-lang \
wike-lang-all"

RDEPENDS:${PN} += "wike"

inherit rpm
