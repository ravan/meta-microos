SUMMARY = "Documentation for texlive-pst-tvz"
DESCRIPTION = "This package includes the documentation for texlive-pst-tvz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77256"

RPM_NAME = "texlive-pst-tvz-doc-2026.226.1.02svn77256-60.4.noarch.rpm"
RPM_HASH = "98c01edcb51b650da923139a133d44f4c3db3e95c86b0119f2da821081c4344cc88bbbcdd0d1b452549fb52dbc9398926bbcea2a2661557aa464801872b9decc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tvz-doc"

RDEPENDS:${PN} += ""

inherit rpm
