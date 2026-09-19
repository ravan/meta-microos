SUMMARY = "Translations for package firewalld"
DESCRIPTION = "Provides translations for the 'firewalld' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewalld-lang-2.3.2-2.1.noarch.rpm"
RPM_HASH = "fd397aa7137de5eb73b522289d54dad9c8e333e98b61a8972405fc915d1a9fcc07810cdab753064390dbffee5471eec877d2347c11625a5b489aa7f682988791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-lang \
firewalld-lang-all \
locale-firewalld-ar \
locale-firewalld-as \
locale-firewalld-ast \
locale-firewalld-bg \
locale-firewalld-bn-IN \
locale-firewalld-ca \
locale-firewalld-cs \
locale-firewalld-da \
locale-firewalld-de \
locale-firewalld-el \
locale-firewalld-es \
locale-firewalld-et \
locale-firewalld-eu \
locale-firewalld-fa \
locale-firewalld-fi \
locale-firewalld-fr \
locale-firewalld-gl \
locale-firewalld-gu \
locale-firewalld-hi \
locale-firewalld-hr \
locale-firewalld-hu \
locale-firewalld-ia \
locale-firewalld-id \
locale-firewalld-it \
locale-firewalld-ja \
locale-firewalld-ka \
locale-firewalld-kn \
locale-firewalld-ko \
locale-firewalld-lt \
locale-firewalld-ml \
locale-firewalld-mr \
locale-firewalld-nl \
locale-firewalld-or \
locale-firewalld-pa \
locale-firewalld-pl \
locale-firewalld-pt \
locale-firewalld-pt-BR \
locale-firewalld-ro \
locale-firewalld-ru \
locale-firewalld-si \
locale-firewalld-sk \
locale-firewalld-sl \
locale-firewalld-sq \
locale-firewalld-sr \
locale-firewalld-sr@latin \
locale-firewalld-sv \
locale-firewalld-ta \
locale-firewalld-te \
locale-firewalld-tr \
locale-firewalld-uk \
locale-firewalld-zh-CN \
locale-firewalld-zh-TW"

RDEPENDS:${PN} += "firewalld"

inherit rpm
