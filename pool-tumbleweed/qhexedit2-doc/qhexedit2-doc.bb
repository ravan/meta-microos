SUMMARY = "Documentation and examples for qhexedit2"
DESCRIPTION = "The qhexedit2-doc package contains the documentation and examples for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.9.0"

RPM_NAME = "qhexedit2-doc-0.9.0-1.6.noarch.rpm"
RPM_HASH = "9edc4cd902dd175f787f2a4f54af8b0929ce07c663925b6c890acb39ce0ccbb3c84e9aad7a797f2875145f7075ad7250bd120b9000be204134eca20cbdd1e3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qhexedit2-doc"

RDEPENDS:${PN} += ""

inherit rpm
