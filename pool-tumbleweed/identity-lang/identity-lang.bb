SUMMARY = "Translations for package identity"
DESCRIPTION = "Provides translations for the 'identity' package."
LICENSE = "GPL-3.0-or-later"

PV = "25.10.1"

RPM_NAME = "identity-lang-25.10.1-1.10.noarch.rpm"
RPM_HASH = "e3cae31a063fa342c24629b59cf6306c4593897a8f90c84c1c5b25f00fa586ef40ec876332cfa665cd3741944f17526c8fc9e264b6ed1f1b08026d2b2e2adce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "identity-lang \
identity-lang-all \
locale-identity-bg \
locale-identity-cs \
locale-identity-da \
locale-identity-de \
locale-identity-el \
locale-identity-en-GB \
locale-identity-es \
locale-identity-eu \
locale-identity-fa \
locale-identity-fi \
locale-identity-fr \
locale-identity-fur \
locale-identity-gl \
locale-identity-he \
locale-identity-hi \
locale-identity-hr \
locale-identity-hu \
locale-identity-id \
locale-identity-is \
locale-identity-it \
locale-identity-ja \
locale-identity-ka \
locale-identity-nl \
locale-identity-oc \
locale-identity-pl \
locale-identity-pt \
locale-identity-pt-BR \
locale-identity-ro \
locale-identity-ru \
locale-identity-sk \
locale-identity-sl \
locale-identity-sr \
locale-identity-sv \
locale-identity-ta \
locale-identity-tr \
locale-identity-uk \
locale-identity-zh-CN \
locale-identity-zh-TW"

RDEPENDS:${PN} += "identity"

inherit rpm
