SUMMARY = "Developer documentation for wlmaker"
DESCRIPTION = "This package provides additional developer documentation for wlmaker"
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "wlmaker-doc-0.7.1-1.4.noarch.rpm"
RPM_HASH = "ece322fcf961e7e63fdae648503f35c384a5ee9eca4a1ecf7f85f19d32fc4be57f544e5e50518ed1060ff9b92f13ddb5a75cb237e78308b3f4362ee6542278fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wlmaker-doc"

RDEPENDS:${PN} += "wlmaker"

inherit rpm
