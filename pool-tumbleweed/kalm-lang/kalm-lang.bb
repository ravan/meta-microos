SUMMARY = "Translations for package kalm"
DESCRIPTION = "Provides translations for the 'kalm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kalm-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4172f2fabb74215ac908c156c2005a7fd765bcf797c2641e8f43e09b7205f8a11e0ecd67204126c550e54a2a3e020d75c24bd092c9f8f8a0b32f660021c5c92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalm-lang \
kalm-lang-all \
locale-kalm-ar \
locale-kalm-ast \
locale-kalm-ca \
locale-kalm-ca@valencia \
locale-kalm-cs \
locale-kalm-de \
locale-kalm-en-GB \
locale-kalm-eo \
locale-kalm-es \
locale-kalm-eu \
locale-kalm-fr \
locale-kalm-ga \
locale-kalm-gl \
locale-kalm-he \
locale-kalm-hi \
locale-kalm-is \
locale-kalm-it \
locale-kalm-ja \
locale-kalm-ka \
locale-kalm-ko \
locale-kalm-lt \
locale-kalm-nl \
locale-kalm-nn \
locale-kalm-pl \
locale-kalm-pt-BR \
locale-kalm-ru \
locale-kalm-sk \
locale-kalm-sl \
locale-kalm-sv \
locale-kalm-tr \
locale-kalm-ug \
locale-kalm-uk \
locale-kalm-zh-CN \
locale-kalm-zh-TW"

RDEPENDS:${PN} += "kalm"

inherit rpm
