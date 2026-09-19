SUMMARY = "Translations for package compiz-emerald"
DESCRIPTION = "Provides translations for the 'compiz-emerald' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-lang-0.8.18-2.25.noarch.rpm"
RPM_HASH = "467a97108d804421b6f637818c10bef192f5352b4382ce2495e2435114689d004481d5bfd7b7a1a43137f34c331aa8aaac47aa837cd1275a70dab14f4894d713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-emerald-lang \
compiz-emerald-lang-all \
locale-compiz-emerald-ar \
locale-compiz-emerald-bn \
locale-compiz-emerald-bn-IN \
locale-compiz-emerald-ca \
locale-compiz-emerald-cs \
locale-compiz-emerald-de \
locale-compiz-emerald-el \
locale-compiz-emerald-en-GB \
locale-compiz-emerald-es \
locale-compiz-emerald-es-AR \
locale-compiz-emerald-eu \
locale-compiz-emerald-fi \
locale-compiz-emerald-fr \
locale-compiz-emerald-gl \
locale-compiz-emerald-gu \
locale-compiz-emerald-he \
locale-compiz-emerald-hi \
locale-compiz-emerald-hu \
locale-compiz-emerald-it \
locale-compiz-emerald-ja \
locale-compiz-emerald-ko \
locale-compiz-emerald-nb \
locale-compiz-emerald-nl \
locale-compiz-emerald-or \
locale-compiz-emerald-pa \
locale-compiz-emerald-pl \
locale-compiz-emerald-pt \
locale-compiz-emerald-pt-BR \
locale-compiz-emerald-ru \
locale-compiz-emerald-sk \
locale-compiz-emerald-sv \
locale-compiz-emerald-tr \
locale-compiz-emerald-zh-CN \
locale-compiz-emerald-zh-HK \
locale-compiz-emerald-zh-TW"

RDEPENDS:${PN} += "compiz-emerald"

inherit rpm
