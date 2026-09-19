SUMMARY = "Documentation for Kea"
DESCRIPTION = "This package contains the documentation for Kea."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "kea-doc-3.2.0-1.2.noarch.rpm"
RPM_HASH = "cd225bc98d45c4b0c20becd305e53a7bd58f7febd7b4d44f77a24d784cf2df6f1abc7e032d39500c1c797887438bd99a5cd9cd83fc150b4d581052769e1f9f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kea-doc"

RDEPENDS:${PN} += ""

inherit rpm
