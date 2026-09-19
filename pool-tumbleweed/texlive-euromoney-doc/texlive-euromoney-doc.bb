SUMMARY = "Documentation for texlive-euromoney"
DESCRIPTION = "This package includes the documentation for texlive-euromoney"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-euromoney-doc-2026.226.0.0.1.1svn73069-59.2.noarch.rpm"
RPM_HASH = "d1b3bee2182388bf3917e05d013f302ba9a6bd16751e803a24f6a0674101e61f09cd1d7b90c17c4e6f9ead84a3ccfaaa2961a1da2b6acb9708f204c9078e9ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euromoney-doc"

RDEPENDS:${PN} += ""

inherit rpm
