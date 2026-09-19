SUMMARY = "Documentation for texlive-tangramtikz"
DESCRIPTION = "This package includes the documentation for texlive-tangramtikz"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2.2svn75123"

RPM_NAME = "texlive-tangramtikz-doc-2026.227.0.0.2.2svn75123-62.2.noarch.rpm"
RPM_HASH = "603049b09782474a62500b25d2ddffee164be92e8f5bc9bbe11b5b6a32af375a319695303b16de132373cc06cc6435c0d8847e21b3e78ec870e576c514e43c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tangramtikz-doc-fr \
texlive-tangramtikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
