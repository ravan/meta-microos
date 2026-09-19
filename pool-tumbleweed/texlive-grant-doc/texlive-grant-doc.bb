SUMMARY = "Documentation for texlive-grant"
DESCRIPTION = "This package includes the documentation for texlive-grant"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-doc-2026.226.0.0.0.5svn56852-60.4.noarch.rpm"
RPM_HASH = "d0d39bbf30b8544851bb7553ec3e030410316de6b12e0175e531e591730883fae00e11b785e8442c75302d576680c6c21e85d8714c49ab3f4fdd0daa8dd10b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grant-doc"

RDEPENDS:${PN} += ""

inherit rpm
