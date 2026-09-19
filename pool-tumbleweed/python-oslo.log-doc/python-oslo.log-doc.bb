SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the oslo.log library."
LICENSE = "Apache-2.0"

PV = "8.3.1"

RPM_NAME = "python-oslo.log-doc-8.3.1-1.1.noarch.rpm"
RPM_HASH = "3cd967e63d5e52450998711183aae7dcbdfdb0788ac8d886933873669b8b6d939a75b37677ca8fa7ff71b83279951df28e6708336a4f263585a8cdbe8b37364b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.log-doc"

RDEPENDS:${PN} += ""

inherit rpm
