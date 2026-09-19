SUMMARY = "Translations for package Komikku"
DESCRIPTION = "Provides translations for the 'Komikku' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later"

PV = "50.15.0"

RPM_NAME = "Komikku-lang-50.15.0-1.1.noarch.rpm"
RPM_HASH = "5f5c68e6881bb3355290435a9919ab4ff1824cb225155c7b7601273ff9c9e26e2aac1f96ae13d71b1a33508fec9f8c29ad3b6462d0dc0dc273f079554bc5c12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Komikku-lang \
Komikku-lang-all \
locale-Komikku-ar \
locale-Komikku-bg \
locale-Komikku-bn \
locale-Komikku-ca \
locale-Komikku-cs \
locale-Komikku-de \
locale-Komikku-es \
locale-Komikku-fa \
locale-Komikku-fi \
locale-Komikku-fr \
locale-Komikku-hi \
locale-Komikku-hr \
locale-Komikku-id \
locale-Komikku-it \
locale-Komikku-ka \
locale-Komikku-kk \
locale-Komikku-ko \
locale-Komikku-lt \
locale-Komikku-ml \
locale-Komikku-ms \
locale-Komikku-nl \
locale-Komikku-oc \
locale-Komikku-pl \
locale-Komikku-pt \
locale-Komikku-pt-BR \
locale-Komikku-ru \
locale-Komikku-sv \
locale-Komikku-ta \
locale-Komikku-tr \
locale-Komikku-uk \
locale-Komikku-vi \
locale-Komikku-zh-CN \
locale-Komikku-zh-Hant"

RDEPENDS:${PN} += "Komikku"

inherit rpm
