SUMMARY = "Documentation for texlive-uninormalize"
DESCRIPTION = "This package includes the documentation for texlive-uninormalize"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-uninormalize-doc-2026.226.0.0.1svn78101-60.2.noarch.rpm"
RPM_HASH = "88a5b4f5d64e712fd2e799bd574594267268ff834796089e1177930a0d8eb7ecc755db3d706776d6bea96d2fa52e73cfdc52b29d5c30f44eadb0ada5bd117463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uninormalize-doc"

RDEPENDS:${PN} += ""

inherit rpm
