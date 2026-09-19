SUMMARY = "Documentation for texlive-sslides"
DESCRIPTION = "This package includes the documentation for texlive-sslides"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn32293"

RPM_NAME = "texlive-sslides-doc-2026.226.svn32293-64.2.noarch.rpm"
RPM_HASH = "ed0eda28bb1e8b9f6c563a17245ac71773e08857c5d79b16bd045d64435e765c42a9eaa1e60a10e696be9fb34a1b2b344856a9225015a55254b932eac1fb0eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
