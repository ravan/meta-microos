SUMMARY = "Unicode Character Database"
DESCRIPTION = "The Unicode Character Database (UCD) consists of a number of data files listing \
Unicode character properties and related data. It also includes data files \
containing test data for conformance to several important Unicode algorithms."
LICENSE = "Unicode-TOU"

PV = "17.0.0"

RPM_NAME = "unicode-ucd-17.0.0-1.3.noarch.rpm"
RPM_HASH = "d96dc21d99eccabfe995c499ac8ada4c3fba9c1398c754e22a7e9706919ef2068eb9a94bb6490f04775a70624aa89ebfc9c61a4101d91388771bfa2bdd8ebd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-ucd"

RDEPENDS:${PN} += ""

inherit rpm
