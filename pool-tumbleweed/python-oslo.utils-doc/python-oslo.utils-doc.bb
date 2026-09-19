SUMMARY = "Documentation for OpenStack utils library"
DESCRIPTION = "Documentation for OpenStack utils library."
LICENSE = "Apache-2.0"

PV = "10.2.0"

RPM_NAME = "python-oslo.utils-doc-10.2.0-1.1.noarch.rpm"
RPM_HASH = "03186631f38a124f14f42abd5ecc0792db455ebd32d2238a31ec6662e9007d404f6194e9bd167fdbc970e73d57ec2bfab43cf192b357a8f5b2b98aecd573d7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
