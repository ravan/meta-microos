SUMMARY = "Documentation for texlive-highlightx"
DESCRIPTION = "This package includes the documentation for texlive-highlightx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.8svn77296"

RPM_NAME = "texlive-highlightx-doc-2026.226.0.0.1.8svn77296-60.4.noarch.rpm"
RPM_HASH = "0f9f4d706b07d4a215bbd87047c769e12a89370c0d1f59483869b88b545afc65b463b8b16c477d1559ab96030059d3c6ac78727fbf18b9008b16d1355a155426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-highlightx-doc-fr \
texlive-highlightx-doc"

RDEPENDS:${PN} += ""

inherit rpm
