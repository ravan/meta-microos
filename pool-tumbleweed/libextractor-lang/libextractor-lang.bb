SUMMARY = "Translations for package libextractor"
DESCRIPTION = "Provides translations for the 'libextractor' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-lang-1.14-1.2.noarch.rpm"
RPM_HASH = "18c276992ada615fc9990051e8d76115b3edb385f75822cf3db070c8e32cd379d3beb5eb4cd85749ec1b68ba7bf22f8f9e0e2a4b8e1edb26b1514b950d728a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libextractor-lang \
libextractor-lang-all \
locale-libextractor-ar \
locale-libextractor-da \
locale-libextractor-de \
locale-libextractor-es \
locale-libextractor-fr \
locale-libextractor-ga \
locale-libextractor-it \
locale-libextractor-ka \
locale-libextractor-nl \
locale-libextractor-pl \
locale-libextractor-pt-BR \
locale-libextractor-ro \
locale-libextractor-sr \
locale-libextractor-sv \
locale-libextractor-uk \
locale-libextractor-vi"

RDEPENDS:${PN} += "libextractor"

inherit rpm
