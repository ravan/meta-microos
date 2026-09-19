SUMMARY = "Documentation for texlive-ltxkeys"
DESCRIPTION = "This package includes the documentation for texlive-ltxkeys"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-doc-2026.226.0.0.0.3csvn28332-59.2.noarch.rpm"
RPM_HASH = "6102fc1e3dfc25dfec57e66c193550f1dcd56dfb7f05d9fc7d9e28b9bd46c6543d39c874097f00cb014c54ffd61791d3c04ab239b3bc3afa0edcd8fdcf22d4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxkeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
