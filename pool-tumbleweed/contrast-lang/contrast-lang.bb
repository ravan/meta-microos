SUMMARY = "Translations for package contrast"
DESCRIPTION = "Provides translations for the 'contrast' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.11+53"

RPM_NAME = "contrast-lang-0.0.11+53-1.3.noarch.rpm"
RPM_HASH = "3aade5a73d5c62e457a65da13b646ad2835a1ad3256bdd6261ab6bfa0435bf762e477427c25ebd93131f315271ebbc8d6eb108326c8ccc6c209698dc32cef233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "contrast-lang \
contrast-lang-all \
locale-contrast-az \
locale-contrast-bg \
locale-contrast-ca \
locale-contrast-cs \
locale-contrast-da \
locale-contrast-de \
locale-contrast-el \
locale-contrast-en-GB \
locale-contrast-es \
locale-contrast-eu \
locale-contrast-fa \
locale-contrast-fi \
locale-contrast-fr \
locale-contrast-fur \
locale-contrast-gl \
locale-contrast-he \
locale-contrast-hi \
locale-contrast-hr \
locale-contrast-hu \
locale-contrast-id \
locale-contrast-it \
locale-contrast-ja \
locale-contrast-ka \
locale-contrast-kk \
locale-contrast-ko \
locale-contrast-nb \
locale-contrast-nl \
locale-contrast-oc \
locale-contrast-pl \
locale-contrast-pt \
locale-contrast-pt-BR \
locale-contrast-ro \
locale-contrast-ru \
locale-contrast-sk \
locale-contrast-sl \
locale-contrast-sr \
locale-contrast-sv \
locale-contrast-tr \
locale-contrast-uk \
locale-contrast-zh-CN"

RDEPENDS:${PN} += "contrast"

inherit rpm
