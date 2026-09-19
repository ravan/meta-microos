SUMMARY = "Translations for package kpublictransport"
DESCRIPTION = "Provides translations for the 'kpublictransport' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpublictransport-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0dd9ec88845d1a2ac0c1442169c9395ba203add054c3ea3dbb619677f1818fd1f3806cbeba658706dda63c1f71ba022d322ba5350ad03e0f8ed809efc52ae5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpublictransport-lang \
kpublictransport-lang-all \
locale-kpublictransport-ar \
locale-kpublictransport-ca \
locale-kpublictransport-ca@valencia \
locale-kpublictransport-cs \
locale-kpublictransport-de \
locale-kpublictransport-en-GB \
locale-kpublictransport-eo \
locale-kpublictransport-es \
locale-kpublictransport-eu \
locale-kpublictransport-fi \
locale-kpublictransport-fr \
locale-kpublictransport-ga \
locale-kpublictransport-gl \
locale-kpublictransport-he \
locale-kpublictransport-hi \
locale-kpublictransport-hu \
locale-kpublictransport-ia \
locale-kpublictransport-it \
locale-kpublictransport-ka \
locale-kpublictransport-ko \
locale-kpublictransport-lt \
locale-kpublictransport-lv \
locale-kpublictransport-nl \
locale-kpublictransport-pl \
locale-kpublictransport-pt-BR \
locale-kpublictransport-ru \
locale-kpublictransport-sk \
locale-kpublictransport-sl \
locale-kpublictransport-sv \
locale-kpublictransport-tr \
locale-kpublictransport-ug \
locale-kpublictransport-uk \
locale-kpublictransport-zh-CN \
locale-kpublictransport-zh-TW"

RDEPENDS:${PN} += "kpublictransport"

inherit rpm
