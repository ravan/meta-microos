SUMMARY = "Documentation for texlive-multiaudience"
DESCRIPTION = "This package includes the documentation for texlive-multiaudience"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn77682"

RPM_NAME = "texlive-multiaudience-doc-2026.226.1.04svn77682-61.2.noarch.rpm"
RPM_HASH = "eeb7eab76af33cd7eb6d13386a461e14907e9b0993082fbdba0daa1a8742d1628c0f73ebfd7c574cc60f7a970e79a5c29d3f1d246cd13655d47f4f7d39a6372b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiaudience-doc"

RDEPENDS:${PN} += ""

inherit rpm
