SUMMARY = "Documentation for texlive-fixtounicode"
DESCRIPTION = "This package includes the documentation for texlive-fixtounicode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn78112"

RPM_NAME = "texlive-fixtounicode-doc-2026.226.0.0.1.1svn78112-59.2.noarch.rpm"
RPM_HASH = "841b9e78f7f4908aabc1e08798f37ef5bda88a348cecd90caad15a196a928b1d2c71113e92c6c0005f345ba34d9adef45ff2e00eb0309900c773ed691bae8a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixtounicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
