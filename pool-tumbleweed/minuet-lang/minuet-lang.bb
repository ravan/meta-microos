SUMMARY = "Translations for package minuet"
DESCRIPTION = "Provides translations for the 'minuet' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "minuet-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cb3d205c3dd63a7da80a10b71fda78f8bfe029bf3f33721d628fe186ded22fb8f57378de207434ee9dec6cce359a21b7abb5206abeb3876a1e41c25d33ec3a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minuet-ar \
locale-minuet-ca \
locale-minuet-ca@valencia \
locale-minuet-cs \
locale-minuet-da \
locale-minuet-de \
locale-minuet-en-GB \
locale-minuet-eo \
locale-minuet-es \
locale-minuet-et \
locale-minuet-eu \
locale-minuet-fi \
locale-minuet-fr \
locale-minuet-ga \
locale-minuet-gl \
locale-minuet-he \
locale-minuet-it \
locale-minuet-ja \
locale-minuet-ka \
locale-minuet-ko \
locale-minuet-lt \
locale-minuet-ml \
locale-minuet-nl \
locale-minuet-nn \
locale-minuet-pl \
locale-minuet-pt \
locale-minuet-pt-BR \
locale-minuet-ru \
locale-minuet-sk \
locale-minuet-sl \
locale-minuet-sv \
locale-minuet-tr \
locale-minuet-ug \
locale-minuet-uk \
locale-minuet-zh-CN \
locale-minuet-zh-TW \
minuet-lang \
minuet-lang-all"

RDEPENDS:${PN} += "minuet"

inherit rpm
