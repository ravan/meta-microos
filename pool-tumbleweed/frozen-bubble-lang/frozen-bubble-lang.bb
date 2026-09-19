SUMMARY = "Translations for package frozen-bubble"
DESCRIPTION = "Provides translations for the 'frozen-bubble' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-lang-2.212-18.5.noarch.rpm"
RPM_HASH = "723da7e5598f576c34d51f58aa05521d273f11af01201e576331150fbb100a52a8c42bc82a6d257e75d00d8d93dd8bf101cb16ad469b39129632088b28343242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frozen-bubble-lang \
frozen-bubble-lang-all"

RDEPENDS:${PN} += "frozen-bubble"

inherit rpm
