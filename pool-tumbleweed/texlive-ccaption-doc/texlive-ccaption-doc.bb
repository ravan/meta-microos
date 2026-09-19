SUMMARY = "Documentation for texlive-ccaption"
DESCRIPTION = "This package includes the documentation for texlive-ccaption"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2csvn77682"

RPM_NAME = "texlive-ccaption-doc-2026.226.3.2csvn77682-59.2.noarch.rpm"
RPM_HASH = "134a3974b2be0271dcd48dd806a015ffb2aef6996fe8bde73ed670cc8cc1e2c6c388fd5ee9e3e41382f78b753815d8eef2c2608e676664a468c33f33457dc14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
