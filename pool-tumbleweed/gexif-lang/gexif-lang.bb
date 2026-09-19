SUMMARY = "Translations for package gexif"
DESCRIPTION = "Provides translations for the 'gexif' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5"

RPM_NAME = "gexif-lang-0.5-208.7.noarch.rpm"
RPM_HASH = "a39a419693d41ba227cc2c4d1ca0ccd9d9f7dddd04abd8a05f844a67fae7157bf27614f5391b331182771517a8007e33ffead324ea6401fba15d0a0401d3ee72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gexif-lang \
gexif-lang-all \
locale-gexif-de \
locale-gexif-es \
locale-gexif-fr"

RDEPENDS:${PN} += "gexif"

inherit rpm
