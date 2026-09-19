SUMMARY = "Translations for package libkchart"
DESCRIPTION = "Provides translations for the 'libkchart' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkchart-lang-2.8.0-2.5.noarch.rpm"
RPM_HASH = "e713a09134a710d25739624c66e18f8057568a26cfa1d8fce19abbf768746678c9b43a65c2d3678315dd9008ae424a6f1140c9d2bbc223c21a67fb3499572c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkchart-lang \
libkchart-lang-all \
locale-libkchart-ar \
locale-libkchart-ast \
locale-libkchart-bs \
locale-libkchart-ca \
locale-libkchart-ca@valencia \
locale-libkchart-cs \
locale-libkchart-de \
locale-libkchart-el \
locale-libkchart-en-GB \
locale-libkchart-es \
locale-libkchart-et \
locale-libkchart-eu \
locale-libkchart-fi \
locale-libkchart-fr \
locale-libkchart-gl \
locale-libkchart-it \
locale-libkchart-ko \
locale-libkchart-nl \
locale-libkchart-nn \
locale-libkchart-pl \
locale-libkchart-pt \
locale-libkchart-pt-BR \
locale-libkchart-ro \
locale-libkchart-ru \
locale-libkchart-sk \
locale-libkchart-sv \
locale-libkchart-tr \
locale-libkchart-uk \
locale-libkchart-zh-CN \
locale-libkchart-zh-TW"

RDEPENDS:${PN} += "libkchart"

inherit rpm
