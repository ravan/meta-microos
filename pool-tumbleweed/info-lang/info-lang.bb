SUMMARY = "Translations for package info"
DESCRIPTION = "Provides translations for the 'info' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "info-lang-7.3-1.5.noarch.rpm"
RPM_HASH = "71ae64ceca391bb8d6f37556b837ae30786096364ee55a920361f4717b601d719e818e118adc25ce0ae619c84d6fca9459dcc6f782521b31bb6165ca57f42295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-lang \
info-lang-all \
locale-info-ca \
locale-info-cs \
locale-info-da \
locale-info-de \
locale-info-el \
locale-info-eo \
locale-info-es \
locale-info-fi \
locale-info-fr \
locale-info-he \
locale-info-hr \
locale-info-hu \
locale-info-id \
locale-info-it \
locale-info-ja \
locale-info-ka \
locale-info-nb \
locale-info-nl \
locale-info-pl \
locale-info-pt \
locale-info-pt-BR \
locale-info-ro \
locale-info-ru \
locale-info-sk \
locale-info-sl \
locale-info-sr \
locale-info-sv \
locale-info-tr \
locale-info-uk \
locale-info-vi \
locale-info-zh-CN \
locale-info-zh-TW"

RDEPENDS:${PN} += "info"

inherit rpm
