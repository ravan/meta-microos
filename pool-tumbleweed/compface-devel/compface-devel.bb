SUMMARY = "Library and development files for handling X-Face data"
DESCRIPTION = "These files are needed when building software that uses the Compface \
library."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "compface-devel-1.5.2-160.7.aarch64.rpm"
RPM_HASH = "38cf07c38ccd8cb2e9e6bd353abaebdddf2b2cf4aaba0ad06f2cd50b7e10954b96b55f54146c1a4af40339238c7739afd23802c9794bc585746c5e63afee963c"

RPROVIDES:${PN} += "compface-devel"

RDEPENDS:${PN} += "compface"

inherit rpm
