SUMMARY = "Documentation for texlive-is-bst"
DESCRIPTION = "This package includes the documentation for texlive-is-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.03svn76790"

RPM_NAME = "texlive-is-bst-doc-2026.226.2.03svn76790-63.2.noarch.rpm"
RPM_HASH = "d5e9d9375cc0ec2e7550e0c3da87832947983af17b870be353ed73705c90a9ebf1ef2f8bae81cdc2f69d4924d08662861310bca852b9037a69c3d71f5ae8b2cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-is-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
