SUMMARY = "Common files for the Granite development library"
DESCRIPTION = "This package contains the common files needed by the library granite6"
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite6-common-6.2.0-2.8.noarch.rpm"
RPM_HASH = "bc6dd8b741953783a56435631ce7cb88eb24dc7a1bc954a016f989fc23b2fb4856a95be8f2c1b1f79b17ba76678be85d1721db3e0e2d773d2ade35a18790e4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granite6-common"

RDEPENDS:${PN} += ""

inherit rpm
