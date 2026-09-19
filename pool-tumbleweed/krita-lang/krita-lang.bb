SUMMARY = "Translations for package krita"
DESCRIPTION = "Provides translations for the 'krita' package."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.3.3"

RPM_NAME = "krita-lang-5.3.3-1.2.noarch.rpm"
RPM_HASH = "7c879b53400b2ec8679ce79bc6a2aa334c157e328b18e156a7d035ef0636eff1fd88a1befac619021d108c21e631e08b62375e0c644e07d9e32787703b81b920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krita-lang \
krita-lang-all \
locale-krita-af \
locale-krita-ar \
locale-krita-be \
locale-krita-bg \
locale-krita-br \
locale-krita-bs \
locale-krita-ca \
locale-krita-ca@valencia \
locale-krita-cs \
locale-krita-cy \
locale-krita-da \
locale-krita-de \
locale-krita-el \
locale-krita-en-GB \
locale-krita-eo \
locale-krita-es \
locale-krita-et \
locale-krita-eu \
locale-krita-fa \
locale-krita-fi \
locale-krita-fr \
locale-krita-ga \
locale-krita-gl \
locale-krita-he \
locale-krita-hi \
locale-krita-hr \
locale-krita-hu \
locale-krita-ia \
locale-krita-id \
locale-krita-is \
locale-krita-it \
locale-krita-ja \
locale-krita-ka \
locale-krita-kk \
locale-krita-km \
locale-krita-ko \
locale-krita-lt \
locale-krita-lv \
locale-krita-mai \
locale-krita-mk \
locale-krita-mr \
locale-krita-ms \
locale-krita-nb \
locale-krita-nds \
locale-krita-ne \
locale-krita-nl \
locale-krita-nn \
locale-krita-oc \
locale-krita-pa \
locale-krita-pl \
locale-krita-pt \
locale-krita-pt-BR \
locale-krita-ro \
locale-krita-ru \
locale-krita-sk \
locale-krita-sl \
locale-krita-sq \
locale-krita-sv \
locale-krita-ta \
locale-krita-th \
locale-krita-tr \
locale-krita-ug \
locale-krita-uk \
locale-krita-vi \
locale-krita-wa \
locale-krita-zh-CN \
locale-krita-zh-TW"

RDEPENDS:${PN} += "krita"

inherit rpm
