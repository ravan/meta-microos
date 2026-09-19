SUMMARY = "ISO Code Lists and Translations"
DESCRIPTION = "This package provides the ISO-639 language code list, the ISO-3166 \
territory code list, ISO-3166-2 subterritory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "iso-codes-4.20.1-2.2.noarch.rpm"
RPM_HASH = "5ffffec2b2aa0c4272b99e6e243d8bbe67e5daf22e704fd5cf2708d9d59a1c5192b3dc5c4df6993e9da815413a21bdb6835cef144f8b040511be29f07c3ae36c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes \
iso-codes-lang"

RDEPENDS:${PN} += ""

inherit rpm
