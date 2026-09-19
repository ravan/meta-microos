SUMMARY = "Documentation for texlive-titling"
DESCRIPTION = "This package includes the documentation for texlive-titling"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1dsvn77682"

RPM_NAME = "texlive-titling-doc-2026.226.2.1dsvn77682-59.2.noarch.rpm"
RPM_HASH = "033d04c46369b52c412e85f703ceab0f36cac188bc24fc1185a2afe1d1cffa47faf6ad1ecfb27394cb4f73e62bdaa9e384f2248e1faf3ec432e83b4c64ff0db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titling-doc"

RDEPENDS:${PN} += ""

inherit rpm
