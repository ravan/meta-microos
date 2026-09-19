SUMMARY = "Strict configuration for container-build-checks"
DESCRIPTION = "Strict configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1779450556.9feaecd"

RPM_NAME = "container-build-checks-strict-1779450556.9feaecd-1.2.noarch.rpm"
RPM_HASH = "97bd37074089dca97de674a65bc683cc0814bdc10b991fefb79c4d163f409ad740182b3c21e42952024a156802301570f5a3b64bc69591929505b6f8990ccb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-strict"

RDEPENDS:${PN} += ""

inherit rpm
