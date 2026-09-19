SUMMARY = "Translations for package qpdfview"
DESCRIPTION = "Provides translations for the 'qpdfview' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-lang-0.5.0-4.5.noarch.rpm"
RPM_HASH = "f2b9bd1d968e017dff13fd88c43b696e1e90fa55d7879f83204a83f5baf3e3bb4026808edac14051905fcbe6eaa6f7e148a9e264990e57de11e4cde38cc02fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdfview-lang \
qpdfview-lang-all"

RDEPENDS:${PN} += "qpdfview"

inherit rpm
