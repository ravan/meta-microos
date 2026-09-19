SUMMARY = "Translations for package ardour"
DESCRIPTION = "Provides translations for the 'ardour' package."
LICENSE = "GPL-3.0-only"

PV = "9.8.0"

RPM_NAME = "ardour-lang-9.8.0-1.1.noarch.rpm"
RPM_HASH = "c40bec3424218e79f6eafaee1367ea7be18268ed886f52e435b29e50961114e925d3c6584ebcc2edeabee8ee0e8bce5279197ba9d57f1bff26c57f3374e7b813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ardour-lang \
ardour-lang-all \
locale-ardour-ca \
locale-ardour-cs \
locale-ardour-de \
locale-ardour-el \
locale-ardour-en-GB \
locale-ardour-es \
locale-ardour-eu \
locale-ardour-fr \
locale-ardour-it \
locale-ardour-ja \
locale-ardour-ko \
locale-ardour-nn \
locale-ardour-pl \
locale-ardour-pt \
locale-ardour-pt-BR \
locale-ardour-pt-PT \
locale-ardour-ru \
locale-ardour-sv \
locale-ardour-zh"

RDEPENDS:${PN} += "ardour"

inherit rpm
