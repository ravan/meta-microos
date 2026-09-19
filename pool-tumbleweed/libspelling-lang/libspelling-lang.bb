SUMMARY = "Translations for package libspelling"
DESCRIPTION = "Provides translations for the 'libspelling' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.10"

RPM_NAME = "libspelling-lang-0.4.10-4.1.noarch.rpm"
RPM_HASH = "ca857cf16c746f9b763a122723ead89d62bb24ba6528ba2e8faba2d0e5d57fd5cbcfda9b4c2cd37653630c9b6ab570459c8e1f0844563a09016f6665fd3d3916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspelling-lang \
libspelling-lang-all \
locale-libspelling-ar \
locale-libspelling-be \
locale-libspelling-bg \
locale-libspelling-ca \
locale-libspelling-cs \
locale-libspelling-da \
locale-libspelling-de \
locale-libspelling-el \
locale-libspelling-en-GB \
locale-libspelling-eo \
locale-libspelling-es \
locale-libspelling-eu \
locale-libspelling-fa \
locale-libspelling-fi \
locale-libspelling-fr \
locale-libspelling-fur \
locale-libspelling-gl \
locale-libspelling-he \
locale-libspelling-hi \
locale-libspelling-hr \
locale-libspelling-hu \
locale-libspelling-ia \
locale-libspelling-id \
locale-libspelling-is \
locale-libspelling-it \
locale-libspelling-ja \
locale-libspelling-ka \
locale-libspelling-kk \
locale-libspelling-ko \
locale-libspelling-lt \
locale-libspelling-lv \
locale-libspelling-nb \
locale-libspelling-ne \
locale-libspelling-nl \
locale-libspelling-oc \
locale-libspelling-pa \
locale-libspelling-pl \
locale-libspelling-pt \
locale-libspelling-pt-BR \
locale-libspelling-ro \
locale-libspelling-ru \
locale-libspelling-sk \
locale-libspelling-sl \
locale-libspelling-sr \
locale-libspelling-sv \
locale-libspelling-th \
locale-libspelling-tr \
locale-libspelling-ug \
locale-libspelling-uk \
locale-libspelling-vi \
locale-libspelling-zh-CN \
locale-libspelling-zh-TW"

RDEPENDS:${PN} += "libspelling"

inherit rpm
