SUMMARY = "Translations for package fritzing"
DESCRIPTION = "Provides translations for the 'fritzing' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "fritzing-lang-1.0.8-1.1.noarch.rpm"
RPM_HASH = "51809416d2d6d48364929a419934c6b0ca4f2c2696e112d13bf7cf50561026bea5d3374e55cde15e2ed06e25adc597a82c6955490db89260c0ace64162ef09b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fritzing-lang \
fritzing-lang-all"

RDEPENDS:${PN} += "fritzing"

inherit rpm
