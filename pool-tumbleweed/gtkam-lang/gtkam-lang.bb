SUMMARY = "Translations for package gtkam"
DESCRIPTION = "Provides translations for the 'gtkam' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "gtkam-lang-1.1-4.4.noarch.rpm"
RPM_HASH = "2a11593c4eb05efd11677311d3fdb5b1cadbc4c0ed929d84801025110715bcbfaccefa590f49c80767e1bed8e596d62d488fbc25a1cdef7bb3384702c7113528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkam-lang \
gtkam-lang-all \
locale-gtkam-be \
locale-gtkam-cs \
locale-gtkam-da \
locale-gtkam-de \
locale-gtkam-eo \
locale-gtkam-es \
locale-gtkam-fi \
locale-gtkam-fr \
locale-gtkam-he \
locale-gtkam-hu \
locale-gtkam-id \
locale-gtkam-is \
locale-gtkam-it \
locale-gtkam-ja \
locale-gtkam-nb \
locale-gtkam-nl \
locale-gtkam-pa \
locale-gtkam-pl \
locale-gtkam-pt \
locale-gtkam-pt-BR \
locale-gtkam-ro \
locale-gtkam-ru \
locale-gtkam-sk \
locale-gtkam-sl \
locale-gtkam-sr \
locale-gtkam-sv \
locale-gtkam-uk \
locale-gtkam-vi \
locale-gtkam-zh-CN"

RDEPENDS:${PN} += "gtkam"

inherit rpm
