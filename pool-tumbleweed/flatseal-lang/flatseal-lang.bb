SUMMARY = "Translations for package flatseal"
DESCRIPTION = "Provides translations for the 'flatseal' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "flatseal-lang-2.4.1-2.1.noarch.rpm"
RPM_HASH = "6f01f2bd191dd11880d2cba264e73611a6d95a7f9b37a566ab9f4a562b31c2b0450430507f5b421037ef46da11e8dd8c5ad9554efc917965f88a64d78adcb930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatseal-lang \
flatseal-lang-all \
locale-flatseal-ar \
locale-flatseal-ca \
locale-flatseal-cs \
locale-flatseal-da \
locale-flatseal-de \
locale-flatseal-el \
locale-flatseal-es \
locale-flatseal-fa \
locale-flatseal-fr \
locale-flatseal-he \
locale-flatseal-hi \
locale-flatseal-hu \
locale-flatseal-id \
locale-flatseal-it \
locale-flatseal-ja \
locale-flatseal-nb \
locale-flatseal-nl \
locale-flatseal-pl \
locale-flatseal-pt-BR \
locale-flatseal-ru \
locale-flatseal-sv \
locale-flatseal-ta \
locale-flatseal-tr \
locale-flatseal-uk \
locale-flatseal-vi \
locale-flatseal-zh-CN"

RDEPENDS:${PN} += "flatseal"

inherit rpm
