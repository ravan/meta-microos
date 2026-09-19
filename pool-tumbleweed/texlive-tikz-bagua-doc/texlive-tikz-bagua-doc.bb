SUMMARY = "Documentation for texlive-tikz-bagua"
DESCRIPTION = "This package includes the documentation for texlive-tikz-bagua"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-doc-2026.227.1.01svn64103-62.2.noarch.rpm"
RPM_HASH = "4707ce463074bda29791c4e3eb7d480149be26bca7e5d1befc6b35661f9a756957c13c7fe4833c28b4040f3b3e5067109afe6f3529a9f9f964e213205d1664a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-bagua-doc-zh \
texlive-tikz-bagua-doc"

RDEPENDS:${PN} += ""

inherit rpm
