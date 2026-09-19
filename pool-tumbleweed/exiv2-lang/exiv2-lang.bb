SUMMARY = "Translations for package exiv2"
DESCRIPTION = "Provides translations for the 'exiv2' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.9"

RPM_NAME = "exiv2-lang-0.28.9-2.1.noarch.rpm"
RPM_HASH = "9cc3c879aadcb5de9a1eb57b86261442069b778c70150b262695070c1fc0d0154963ca81f6f4f662869d861d65b0de11a8a80f06d87ff36a2024650bb6337e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiv2-lang \
exiv2-lang-all \
locale-exiv2-bs \
locale-exiv2-ca \
locale-exiv2-da \
locale-exiv2-de \
locale-exiv2-es \
locale-exiv2-fi \
locale-exiv2-fr \
locale-exiv2-gl \
locale-exiv2-it \
locale-exiv2-ka \
locale-exiv2-ms \
locale-exiv2-nl \
locale-exiv2-pl \
locale-exiv2-pt \
locale-exiv2-pt-BR \
locale-exiv2-ru \
locale-exiv2-sk \
locale-exiv2-sv \
locale-exiv2-ug \
locale-exiv2-uk \
locale-exiv2-vi"

RDEPENDS:${PN} += "exiv2"

inherit rpm
