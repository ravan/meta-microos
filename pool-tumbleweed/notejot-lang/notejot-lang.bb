SUMMARY = "Translations for package notejot"
DESCRIPTION = "Provides translations for the 'notejot' package."
LICENSE = "GPL-3.0-only"

PV = "3.5.1"

RPM_NAME = "notejot-lang-3.5.1-1.7.noarch.rpm"
RPM_HASH = "e1fbe939b8121a04ea75afb668778b6e5b93748952f84dd4517b91e0fbee35db91a09c2994fb84f6e6647bf07f4c387791b67f17cbed509b8f011df38c61edef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-notejot-ca \
locale-notejot-cs \
locale-notejot-da \
locale-notejot-de \
locale-notejot-es \
locale-notejot-fr \
locale-notejot-gl \
locale-notejot-hr \
locale-notejot-it \
locale-notejot-ja \
locale-notejot-lt \
locale-notejot-nl \
locale-notejot-pl \
locale-notejot-pt \
locale-notejot-pt-BR \
locale-notejot-ru \
locale-notejot-sv \
locale-notejot-tr-TR \
notejot-lang \
notejot-lang-all"

RDEPENDS:${PN} += "notejot"

inherit rpm
