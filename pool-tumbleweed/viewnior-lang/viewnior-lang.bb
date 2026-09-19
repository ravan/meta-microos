SUMMARY = "Translations for package viewnior"
DESCRIPTION = "Provides translations for the 'viewnior' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-lang-1.8-2.13.noarch.rpm"
RPM_HASH = "51759d8c004c6f2ea7dd8d1f8d6764b249c1e5796b3243eae458754101d22cdcd581456d7f9e4755e6aad10eeb76f74759b7a138232c7ad99e2a40411cd11492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-viewnior-ar \
locale-viewnior-bg \
locale-viewnior-bs \
locale-viewnior-ca \
locale-viewnior-ca@valencia \
locale-viewnior-cs \
locale-viewnior-da \
locale-viewnior-de \
locale-viewnior-el \
locale-viewnior-en-GB \
locale-viewnior-es \
locale-viewnior-fi \
locale-viewnior-fr \
locale-viewnior-gl \
locale-viewnior-he \
locale-viewnior-hu \
locale-viewnior-it \
locale-viewnior-ja \
locale-viewnior-lt \
locale-viewnior-nb-NO \
locale-viewnior-nl \
locale-viewnior-oc \
locale-viewnior-pl \
locale-viewnior-pt \
locale-viewnior-pt-BR \
locale-viewnior-ru \
locale-viewnior-sk \
locale-viewnior-sr \
locale-viewnior-sv \
locale-viewnior-tr \
locale-viewnior-uk \
locale-viewnior-zh-CN \
locale-viewnior-zh-TW \
viewnior-lang \
viewnior-lang-all"

RDEPENDS:${PN} += "viewnior"

inherit rpm
