SUMMARY = "Documentation for the Oslo Policy library"
DESCRIPTION = "Documentation for the Oslo Policy library."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "python-oslo.policy-doc-6.0.0-1.1.noarch.rpm"
RPM_HASH = "15c29cce7d25f7df8ebf9ca4c20d12ca2f7ce7d3d493a67a90614cdee6534aea8267b9040a7cbb275e2d5967737cc754cc4e8c847651640e5e1be00876b6f908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.policy-doc"

RDEPENDS:${PN} += ""

inherit rpm
