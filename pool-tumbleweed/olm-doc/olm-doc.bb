SUMMARY = "Documentation files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Documentation files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.16"

RPM_NAME = "olm-doc-3.2.16-2.4.noarch.rpm"
RPM_HASH = "4da6f5555ced3fae7bb438def8ca41d6b0dc1c823d18be635341c408a83fb5783fbeda515c25571af5f5ed9a822066ea2795a734f8e95fa2211cff2b85a37063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "olm-doc"

RDEPENDS:${PN} += ""

inherit rpm
