SUMMARY = "Collection of day-to-day tools (data)"
DESCRIPTION = "Architecture-independent data from hxtools. \
 \
* VAIO U3 keymap \
* additional fonts for console and xterm \
* additional syntax highlighting definitions for mcedit"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "hxtools-data-20251011-1.6.noarch.rpm"
RPM_HASH = "e2615186c5d67179a9efda6eda87889c9e359ce7cbb79453498c1bd5aba2c0fbb712b502ca894d8a7cee665a2a7b3d053ceacbf3fda71783a138a7cf44c01c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hxtools-data \
hxtools-data"

RDEPENDS:${PN} += ""

inherit rpm
