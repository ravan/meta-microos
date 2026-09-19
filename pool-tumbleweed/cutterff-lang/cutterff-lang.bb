SUMMARY = "Translations for package cutterff"
DESCRIPTION = "Provides translations for the 'cutterff' package."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "cutterff-lang-1.3-1.14.noarch.rpm"
RPM_HASH = "fd9b4c14ecc98fd5b86b06388f520ef32f5a504529c5f4275e2dfa29f6f182fadff7cefbd248ebf0d42d1da6adc5fda76ba0b91b02d10b4496995a18f7c0aac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cutterff-lang \
cutterff-lang-all \
locale-cutterff-de"

RDEPENDS:${PN} += "cutterff"

inherit rpm
