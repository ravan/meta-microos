SUMMARY = "Translations for package AppStream"
DESCRIPTION = "Provides translations for the 'AppStream' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-lang-1.1.5-1.1.noarch.rpm"
RPM_HASH = "bac84cd97495b446cdfa5b810109e59f76561d3766f25225182f98d739f538e00d6ea884756253d10f2816881239509fc796a67d91a37cfb63d04c07c533dd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AppStream-lang \
AppStream-lang-all \
locale-AppStream-ar \
locale-AppStream-bg \
locale-AppStream-bn \
locale-AppStream-ca \
locale-AppStream-cs \
locale-AppStream-da \
locale-AppStream-de \
locale-AppStream-en-GB \
locale-AppStream-eo \
locale-AppStream-es \
locale-AppStream-et \
locale-AppStream-eu \
locale-AppStream-fi \
locale-AppStream-fr \
locale-AppStream-gd \
locale-AppStream-gl \
locale-AppStream-he \
locale-AppStream-hi \
locale-AppStream-hr \
locale-AppStream-hu \
locale-AppStream-ia \
locale-AppStream-id \
locale-AppStream-it \
locale-AppStream-ja \
locale-AppStream-ka \
locale-AppStream-kk \
locale-AppStream-ko \
locale-AppStream-lt \
locale-AppStream-nb \
locale-AppStream-nl \
locale-AppStream-oc \
locale-AppStream-pl \
locale-AppStream-pt \
locale-AppStream-pt-BR \
locale-AppStream-ro \
locale-AppStream-ru \
locale-AppStream-sk \
locale-AppStream-sl \
locale-AppStream-sr \
locale-AppStream-sr@latin \
locale-AppStream-sv \
locale-AppStream-ta \
locale-AppStream-th \
locale-AppStream-tr \
locale-AppStream-uk \
locale-AppStream-zh-CN \
locale-AppStream-zh-TW"

RDEPENDS:${PN} += "AppStream"

inherit rpm
