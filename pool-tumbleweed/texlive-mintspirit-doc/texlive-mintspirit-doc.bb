SUMMARY = "Documentation for texlive-mintspirit"
DESCRIPTION = "This package includes the documentation for texlive-mintspirit"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mintspirit-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "87157f257801acb004fb6c204faf268199948dd5cabbf8eeab8238fc1e56ee393dfca648dd882370c9cbb1d33c71259e4aaada8d39ae5ae0dc5ea157cf0d1e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mintspirit-doc"

RDEPENDS:${PN} += ""

inherit rpm
