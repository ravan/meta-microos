SUMMARY = "Translations for package lxrandr"
DESCRIPTION = "Provides translations for the 'lxrandr' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "lxrandr-lang-0.3.2-1.27.noarch.rpm"
RPM_HASH = "b7224e186fe7a7c4e521dc2078c8513473f60b2389ea9091b383f7049d3d50760e62d9f8e1678c2230447e2654e7d34297d70cd4fd49efb25a5e655ba9619054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxrandr-af \
locale-lxrandr-ar \
locale-lxrandr-ast \
locale-lxrandr-be \
locale-lxrandr-bg \
locale-lxrandr-bn \
locale-lxrandr-bn-IN \
locale-lxrandr-ca \
locale-lxrandr-cs \
locale-lxrandr-da \
locale-lxrandr-de \
locale-lxrandr-el \
locale-lxrandr-en-GB \
locale-lxrandr-es \
locale-lxrandr-et \
locale-lxrandr-eu \
locale-lxrandr-fa \
locale-lxrandr-fi \
locale-lxrandr-fr \
locale-lxrandr-gl \
locale-lxrandr-he \
locale-lxrandr-hr \
locale-lxrandr-hu \
locale-lxrandr-id \
locale-lxrandr-is \
locale-lxrandr-it \
locale-lxrandr-ja \
locale-lxrandr-kk \
locale-lxrandr-ko \
locale-lxrandr-lt \
locale-lxrandr-ml \
locale-lxrandr-ms \
locale-lxrandr-nb \
locale-lxrandr-nl \
locale-lxrandr-nn \
locale-lxrandr-pa \
locale-lxrandr-pl \
locale-lxrandr-pt \
locale-lxrandr-pt-BR \
locale-lxrandr-ro \
locale-lxrandr-ru \
locale-lxrandr-sk \
locale-lxrandr-sl \
locale-lxrandr-sr \
locale-lxrandr-sr@latin \
locale-lxrandr-sv \
locale-lxrandr-te \
locale-lxrandr-th \
locale-lxrandr-tr \
locale-lxrandr-ug \
locale-lxrandr-uk \
locale-lxrandr-vi \
locale-lxrandr-zh-CN \
locale-lxrandr-zh-TW \
lxrandr-lang \
lxrandr-lang-all"

RDEPENDS:${PN} += "lxrandr"

inherit rpm
