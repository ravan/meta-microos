SUMMARY = "Translations for package gpick"
DESCRIPTION = "Provides translations for the 'gpick' package."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "gpick-lang-0.3-2.7.noarch.rpm"
RPM_HASH = "801a1b2941d2e555b20b0ec452ea83f14a8dc07835258d589f8004927acba8e3e2ab00b9c8574b5049457bee926846a8acfdc5164a547c97a6ef742da605a84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpick-lang \
gpick-lang-all \
locale-gpick-cs \
locale-gpick-es \
locale-gpick-lt \
locale-gpick-ru \
locale-gpick-sv"

RDEPENDS:${PN} += "gpick"

inherit rpm
