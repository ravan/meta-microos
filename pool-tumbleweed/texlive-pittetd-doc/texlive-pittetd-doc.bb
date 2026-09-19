SUMMARY = "Documentation for texlive-pittetd"
DESCRIPTION = "This package includes the documentation for texlive-pittetd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.618svn15878"

RPM_NAME = "texlive-pittetd-doc-2026.226.1.618svn15878-58.2.noarch.rpm"
RPM_HASH = "4c83fc15be3b8dcc36b74d783873052b2da80ca9f2a81e862411294efa1517933cee40e82a168ec0f92a4100284bdf041b5b62e5f9e47242bd4180d373341985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pittetd-doc"

RDEPENDS:${PN} += ""

inherit rpm
