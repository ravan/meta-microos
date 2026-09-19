SUMMARY = "Translations for package musique"
DESCRIPTION = "Provides translations for the 'musique' package."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.12"

RPM_NAME = "musique-lang-1.12-3.4.noarch.rpm"
RPM_HASH = "04efce3f29f309be4b2277486396cc40e5a3e8e5791345775fe99b578f2014fdb8797c51423fdbc2bbc994515571c4e1b2ddac2fa84d18ff6dfb6c0103b2680b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "musique-lang \
musique-lang-all"

RDEPENDS:${PN} += "musique"

inherit rpm
