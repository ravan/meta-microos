SUMMARY = "Documentation for texlive-susy"
DESCRIPTION = "This package includes the documentation for texlive-susy"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-susy-doc-2026.226.svn19440-64.2.noarch.rpm"
RPM_HASH = "ae496e01f9072aeb685b4497333871da35209304b885311c4b20c0390985fd47e46d27a3834996b89f27df47f83778e5905d31fe6950a534e0ffaead673ad42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-susy-doc"

RDEPENDS:${PN} += ""

inherit rpm
