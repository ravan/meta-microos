SUMMARY = "Translations for package csound"
DESCRIPTION = "Provides translations for the 'csound' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-lang-6.18.1-6.4.noarch.rpm"
RPM_HASH = "51b26ea215cf299aa3ef20a8b9c11e0c28183a37a0f225868d44529785826437742edc766e6a61ebb9a82cb5977e2cf333f5c8f1a790c1bd0df1f13f22857f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "csound-lang \
csound-lang-all \
locale-csound-de \
locale-csound-en-US \
locale-csound-es \
locale-csound-es-CO \
locale-csound-fr \
locale-csound-it \
locale-csound-ru"

RDEPENDS:${PN} += "csound"

inherit rpm
