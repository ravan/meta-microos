SUMMARY = "Translations for package minder"
DESCRIPTION = "Provides translations for the 'minder' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.9"

RPM_NAME = "minder-lang-2.0.9-1.3.noarch.rpm"
RPM_HASH = "bddec346e7b042b8a247bfe151fbb859157cdb3644dff90dc0a4c36fe79d86b1d17373c01ac52d9ee8ab75739036aa11823e265daa4443ace119e23fdb61ec8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minder-cs \
locale-minder-de \
locale-minder-es \
locale-minder-fr \
locale-minder-it \
locale-minder-ka \
locale-minder-nl \
locale-minder-pl \
locale-minder-pt \
locale-minder-pt-BR \
locale-minder-ru \
locale-minder-sv \
locale-minder-zh-CN \
minder-lang \
minder-lang-all"

RDEPENDS:${PN} += "minder"

inherit rpm
