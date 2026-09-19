SUMMARY = "Translations for package drumstick"
DESCRIPTION = "Provides translations for the 'drumstick' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "drumstick-lang-2.11.1-1.1.noarch.rpm"
RPM_HASH = "ac2e7c965ed26ed2918459a880d977846750de9a8e2437f749c5251998eccba50e462368fe1e966e71513a213be72f034e7c0ebd6c9a01142bd2acaae9703625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drumstick-lang \
drumstick-lang-all"

RDEPENDS:${PN} += "drumstick"

inherit rpm
