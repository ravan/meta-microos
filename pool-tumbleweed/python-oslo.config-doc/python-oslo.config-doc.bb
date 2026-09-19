SUMMARY = "Documentation for OpenStack common configuration library"
DESCRIPTION = "Documentation for the oslo-config library."
LICENSE = "Apache-2.0"

PV = "10.7.0"

RPM_NAME = "python-oslo.config-doc-10.7.0-1.1.noarch.rpm"
RPM_HASH = "d1b2f94ecbcb5ceab7ef64ffc3ae8d0edc933917cc86e94749cbb9f1507d22a0c3700c849270f860f414637a6caecaf067a9f9326bcbed4159bd99969dc58e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.config-doc"

RDEPENDS:${PN} += ""

inherit rpm
