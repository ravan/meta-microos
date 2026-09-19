SUMMARY = "leechcraft"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft-20170319-1.24.aarch64.rpm"
RPM_HASH = "492ebb44dce4a807dabd3eb40101e30133063eb4b3a809a20b4cec0982ce65516a484c750d270eb1db075ff4aa1827e20f1035743beeab10be7f4086712fbb29"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft"

RDEPENDS:${PN} += "leechcraft-cstp \
pattern-"

inherit rpm
