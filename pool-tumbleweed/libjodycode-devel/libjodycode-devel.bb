SUMMARY = "Development files for libjodycode"
DESCRIPTION = "Development files and headers for libjodycode"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "libjodycode-devel-4.1.2-1.4.aarch64.rpm"
RPM_HASH = "4b8fb14b41a28776e7f68ca68565884c063b89323094ceeae2681a365dce27f8bd0a9fc6df5892e6f993c5e77e1533eb490e4820a045a8ecdc981d43f7278810"

RPROVIDES:${PN} += "libjodycode-devel"

RDEPENDS:${PN} += "libjodycode4"

inherit rpm
