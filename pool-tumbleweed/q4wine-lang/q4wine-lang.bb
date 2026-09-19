SUMMARY = "Translations for package q4wine"
DESCRIPTION = "Provides translations for the 'q4wine' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.2"

RPM_NAME = "q4wine-lang-1.4.2-1.11.noarch.rpm"
RPM_HASH = "c769ba6cb1cb2d3b6a35853b0ebde274ae41e779a62223046d5e0a5ba93c0d1eba68ffb5398543b5241b9cf56980c42d61f94ac92c8fac0fe8c07eaf7bd3b971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "q4wine-lang \
q4wine-lang-all"

RDEPENDS:${PN} += "q4wine"

inherit rpm
