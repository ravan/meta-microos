SUMMARY = "Translations for package gramps"
DESCRIPTION = "Provides translations for the 'gramps' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.8"

RPM_NAME = "gramps-lang-6.0.8-1.2.noarch.rpm"
RPM_HASH = "41494828cdd0303bc9723211562fa3488ab7da8c51272446878f43444d28662babf50a1eb23f2791ca926b5425207da42c580d07ea7d254ea7fbff10d2e730be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gramps-lang \
gramps-lang-all \
locale-gramps-ar \
locale-gramps-bg \
locale-gramps-ca \
locale-gramps-cs \
locale-gramps-da \
locale-gramps-de \
locale-gramps-de-AT \
locale-gramps-el \
locale-gramps-en-GB \
locale-gramps-eo \
locale-gramps-es \
locale-gramps-fi \
locale-gramps-fr \
locale-gramps-ga \
locale-gramps-he \
locale-gramps-hr \
locale-gramps-hu \
locale-gramps-is \
locale-gramps-it \
locale-gramps-ja \
locale-gramps-ko \
locale-gramps-lt \
locale-gramps-nb \
locale-gramps-nl \
locale-gramps-nn \
locale-gramps-pl \
locale-gramps-pt-BR \
locale-gramps-pt-PT \
locale-gramps-ru \
locale-gramps-sk \
locale-gramps-sl \
locale-gramps-sq \
locale-gramps-sr \
locale-gramps-sv \
locale-gramps-ta \
locale-gramps-tr \
locale-gramps-uk \
locale-gramps-vi \
locale-gramps-zh-CN \
locale-gramps-zh-HK \
locale-gramps-zh-TW"

RDEPENDS:${PN} += "gramps"

inherit rpm
