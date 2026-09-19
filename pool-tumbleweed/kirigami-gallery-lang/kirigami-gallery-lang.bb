SUMMARY = "Translations for package kirigami-gallery"
DESCRIPTION = "Provides translations for the 'kirigami-gallery' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kirigami-gallery-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0ff821bf0e575fbeb5e7d222f9f29db5ffc7ba7a01f35f8e44a7cf0e2f0affd33617fe93fb72b27c7e0fbdb8c3bc870c8badf8561770f4b22e2e0f211459cfeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-gallery-lang \
kirigami-gallery-lang-all \
locale-kirigami-gallery-ar \
locale-kirigami-gallery-ca \
locale-kirigami-gallery-ca@valencia \
locale-kirigami-gallery-cs \
locale-kirigami-gallery-da \
locale-kirigami-gallery-de \
locale-kirigami-gallery-el \
locale-kirigami-gallery-en-GB \
locale-kirigami-gallery-eo \
locale-kirigami-gallery-es \
locale-kirigami-gallery-et \
locale-kirigami-gallery-eu \
locale-kirigami-gallery-fi \
locale-kirigami-gallery-fr \
locale-kirigami-gallery-ga \
locale-kirigami-gallery-gl \
locale-kirigami-gallery-he \
locale-kirigami-gallery-hi \
locale-kirigami-gallery-ia \
locale-kirigami-gallery-it \
locale-kirigami-gallery-ja \
locale-kirigami-gallery-ka \
locale-kirigami-gallery-ko \
locale-kirigami-gallery-lt \
locale-kirigami-gallery-lv \
locale-kirigami-gallery-nl \
locale-kirigami-gallery-nn \
locale-kirigami-gallery-pa \
locale-kirigami-gallery-pl \
locale-kirigami-gallery-pt \
locale-kirigami-gallery-pt-BR \
locale-kirigami-gallery-ro \
locale-kirigami-gallery-ru \
locale-kirigami-gallery-sk \
locale-kirigami-gallery-sl \
locale-kirigami-gallery-sv \
locale-kirigami-gallery-tr \
locale-kirigami-gallery-ug \
locale-kirigami-gallery-uk \
locale-kirigami-gallery-zh-CN \
locale-kirigami-gallery-zh-TW"

RDEPENDS:${PN} += "kirigami-gallery"

inherit rpm
