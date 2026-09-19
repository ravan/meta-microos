SUMMARY = "Documentation for texlive-testhyphens"
DESCRIPTION = "This package includes the documentation for texlive-testhyphens"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn73486"

RPM_NAME = "texlive-testhyphens-doc-2026.227.1.0svn73486-62.2.noarch.rpm"
RPM_HASH = "72247de6cda04ca83e4323c287e1ad5e4f3c7223a4506c9a6554a042008df5aa4ca5d6843521410aea6def2e0fde7bbf8eeead6609814b52afa8fc5ecc0482ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testhyphens-doc"

RDEPENDS:${PN} += ""

inherit rpm
