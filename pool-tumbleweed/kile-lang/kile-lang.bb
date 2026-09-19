SUMMARY = "Translations for package kile"
DESCRIPTION = "Provides translations for the 'kile' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.95git.20260802T020133~eeeb6da4"

RPM_NAME = "kile-lang-2.9.95git.20260802T020133~eeeb6da4-1.1.noarch.rpm"
RPM_HASH = "ecb30dce7c402457e951ffbb4629f1dc73674c7be18948eb518890f3be4954d7ff38dd696f047d5825498b6834c39b0acc0b3aff1ddcc57a52bf2fdfa141d24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kile-lang \
kile-lang-all \
locale-kile-ar \
locale-kile-ast \
locale-kile-bs \
locale-kile-ca \
locale-kile-ca@valencia \
locale-kile-cs \
locale-kile-da \
locale-kile-de \
locale-kile-el \
locale-kile-en-GB \
locale-kile-eo \
locale-kile-es \
locale-kile-et \
locale-kile-eu \
locale-kile-fi \
locale-kile-fr \
locale-kile-ga \
locale-kile-gl \
locale-kile-hi \
locale-kile-hu \
locale-kile-ia \
locale-kile-it \
locale-kile-ja \
locale-kile-ka \
locale-kile-kk \
locale-kile-ko \
locale-kile-lt \
locale-kile-mai \
locale-kile-mr \
locale-kile-ms \
locale-kile-nb \
locale-kile-nds \
locale-kile-nl \
locale-kile-nn \
locale-kile-pl \
locale-kile-pt \
locale-kile-pt-BR \
locale-kile-ro \
locale-kile-ru \
locale-kile-sk \
locale-kile-sl \
locale-kile-sv \
locale-kile-ta \
locale-kile-tr \
locale-kile-ug \
locale-kile-uk \
locale-kile-zh-CN \
locale-kile-zh-TW"

RDEPENDS:${PN} += "kile"

inherit rpm
