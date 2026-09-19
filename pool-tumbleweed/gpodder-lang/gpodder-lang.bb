SUMMARY = "Translations for package gpodder"
DESCRIPTION = "Provides translations for the 'gpodder' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.11.5"

RPM_NAME = "gpodder-lang-3.11.5-1.5.noarch.rpm"
RPM_HASH = "9d9dfbf5af9846aa35fd2304f7830faa912f36e8a909ded72046e271cbbbc070e0e8b895d65be955bc8008b3dd30f7b31236236335ac915f11c9d4d3a1e31596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpodder-lang \
gpodder-lang-all \
locale-gpodder-ca \
locale-gpodder-cs \
locale-gpodder-cs-CZ \
locale-gpodder-da \
locale-gpodder-de \
locale-gpodder-el \
locale-gpodder-es \
locale-gpodder-es-ES \
locale-gpodder-es-MX \
locale-gpodder-eu \
locale-gpodder-fi \
locale-gpodder-fr \
locale-gpodder-gl \
locale-gpodder-he \
locale-gpodder-hu \
locale-gpodder-it \
locale-gpodder-kk \
locale-gpodder-nb \
locale-gpodder-nl \
locale-gpodder-nn \
locale-gpodder-pl \
locale-gpodder-pt \
locale-gpodder-pt-BR \
locale-gpodder-ro \
locale-gpodder-ru \
locale-gpodder-sk \
locale-gpodder-sv \
locale-gpodder-tr \
locale-gpodder-uk \
locale-gpodder-zh-CN"

RDEPENDS:${PN} += "gpodder"

inherit rpm
