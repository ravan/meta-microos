SUMMARY = "API documentation for Nuspell"
DESCRIPTION = "This package provides API documentation for Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.7"

RPM_NAME = "nuspell-doc-5.1.7-1.4.noarch.rpm"
RPM_HASH = "52c7f7e0ebdd6f637fe9d4674bd136a5cfbc0bcfb4351643faf30044c47df0044504d293f58f576037cdee707f21c43cfcbad5469e2315d37ff79e8170fb1ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuspell-doc"

RDEPENDS:${PN} += ""

inherit rpm
