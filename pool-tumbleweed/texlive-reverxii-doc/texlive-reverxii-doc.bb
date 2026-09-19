SUMMARY = "Documentation for texlive-reverxii"
DESCRIPTION = "This package includes the documentation for texlive-reverxii"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63753"

RPM_NAME = "texlive-reverxii-doc-2026.226.svn63753-60.4.noarch.rpm"
RPM_HASH = "7ced42cb798071f9f0d4d06aaafda0584db9a9bd18d6a8376a8f3f337eb62a932e8a8f9108e99c8fc2ecefc3c980925bb7b59512b17a9595867ff8d26256eae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reverxii-doc"

RDEPENDS:${PN} += ""

inherit rpm
