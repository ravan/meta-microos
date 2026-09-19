SUMMARY = "Documentation for texlive-tabular2"
DESCRIPTION = "This package includes the documentation for texlive-tabular2"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn76924"

RPM_NAME = "texlive-tabular2-doc-2026.227.0.0.3svn76924-62.2.noarch.rpm"
RPM_HASH = "abaf15ad3efb67602e8d214cfca1f94ea219466a9de8acccda0aec60f161e4201ac1faa837f14596c823a4f6ac3dd2d04f4d9cbd030d668b2b4753361bb9710e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabular2-doc-zh \
texlive-tabular2-doc"

RDEPENDS:${PN} += ""

inherit rpm
