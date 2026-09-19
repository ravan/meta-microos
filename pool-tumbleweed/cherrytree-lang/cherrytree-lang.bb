SUMMARY = "Translations for package cherrytree"
DESCRIPTION = "Provides translations for the 'cherrytree' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.6.3"

RPM_NAME = "cherrytree-lang-1.6.3-2.4.noarch.rpm"
RPM_HASH = "b3f644dfc7d90836594cbb4baf89005ceeec1fc6651ccc778a4b4b1c6df8b36c3c877ffba1512fa26dc55b904d1c4538b24f0da4fed83fb4284f397d88bcc749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cherrytree-lang \
cherrytree-lang-all \
locale-cherrytree-ar \
locale-cherrytree-bg \
locale-cherrytree-cs \
locale-cherrytree-de \
locale-cherrytree-el \
locale-cherrytree-es \
locale-cherrytree-fa \
locale-cherrytree-fi \
locale-cherrytree-fr \
locale-cherrytree-hr \
locale-cherrytree-hu \
locale-cherrytree-it \
locale-cherrytree-ja \
locale-cherrytree-ko \
locale-cherrytree-lt \
locale-cherrytree-nl \
locale-cherrytree-pl \
locale-cherrytree-pt \
locale-cherrytree-pt-BR \
locale-cherrytree-ro \
locale-cherrytree-ru \
locale-cherrytree-sk \
locale-cherrytree-sl \
locale-cherrytree-sv \
locale-cherrytree-tr \
locale-cherrytree-uk \
locale-cherrytree-zh-CN \
locale-cherrytree-zh-TW"

RDEPENDS:${PN} += "cherrytree"

inherit rpm
