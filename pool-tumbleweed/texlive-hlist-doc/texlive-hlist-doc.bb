SUMMARY = "Documentation for texlive-hlist"
DESCRIPTION = "This package includes the documentation for texlive-hlist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn44983"

RPM_NAME = "texlive-hlist-doc-2026.226.0.0.11svn44983-60.4.noarch.rpm"
RPM_HASH = "107f784049b05d9925bc0c255aab9f7264763a7ffd865b7fc6cecfdb73d9b00ede7567da4c31f5c54c2fd99cdf82d9a0f401449e6db7b6ee5d8783ca4dd50a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
