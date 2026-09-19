SUMMARY = "Translations for package thunar-shares-plugin"
DESCRIPTION = "Provides translations for the 'thunar-shares-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "thunar-shares-plugin-lang-0.5.0-1.6.noarch.rpm"
RPM_HASH = "bb343cb1cad4d01dfbda230b2549a389503e8029d252d72dce2d08526ec4f9f7cb2fc22e25f55c9ce50a1e1443ee5eb10657e62a82f3d4e56dace7dcdb267304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-shares-plugin-ar \
locale-thunar-shares-plugin-be \
locale-thunar-shares-plugin-bg \
locale-thunar-shares-plugin-ca \
locale-thunar-shares-plugin-cs \
locale-thunar-shares-plugin-da \
locale-thunar-shares-plugin-de \
locale-thunar-shares-plugin-el \
locale-thunar-shares-plugin-en-AU \
locale-thunar-shares-plugin-en-GB \
locale-thunar-shares-plugin-es \
locale-thunar-shares-plugin-et \
locale-thunar-shares-plugin-eu \
locale-thunar-shares-plugin-fi \
locale-thunar-shares-plugin-fr \
locale-thunar-shares-plugin-gl \
locale-thunar-shares-plugin-he \
locale-thunar-shares-plugin-hr \
locale-thunar-shares-plugin-hu \
locale-thunar-shares-plugin-id \
locale-thunar-shares-plugin-is \
locale-thunar-shares-plugin-it \
locale-thunar-shares-plugin-ja \
locale-thunar-shares-plugin-ko \
locale-thunar-shares-plugin-lt \
locale-thunar-shares-plugin-lv \
locale-thunar-shares-plugin-ms \
locale-thunar-shares-plugin-nb \
locale-thunar-shares-plugin-nl \
locale-thunar-shares-plugin-oc \
locale-thunar-shares-plugin-pl \
locale-thunar-shares-plugin-pt \
locale-thunar-shares-plugin-pt-BR \
locale-thunar-shares-plugin-ro \
locale-thunar-shares-plugin-ru \
locale-thunar-shares-plugin-sk \
locale-thunar-shares-plugin-sl \
locale-thunar-shares-plugin-sq \
locale-thunar-shares-plugin-sr \
locale-thunar-shares-plugin-sv \
locale-thunar-shares-plugin-tr \
locale-thunar-shares-plugin-ug \
locale-thunar-shares-plugin-uk \
locale-thunar-shares-plugin-vi \
locale-thunar-shares-plugin-zh-CN \
locale-thunar-shares-plugin-zh-TW \
thunar-shares-plugin-lang \
thunar-shares-plugin-lang-all"

RDEPENDS:${PN} += "thunar-shares-plugin"

inherit rpm
