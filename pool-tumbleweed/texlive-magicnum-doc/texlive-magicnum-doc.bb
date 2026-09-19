SUMMARY = "Documentation for texlive-magicnum"
DESCRIPTION = "This package includes the documentation for texlive-magicnum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-magicnum-doc-2026.226.1.7svn77682-59.2.noarch.rpm"
RPM_HASH = "2b1c1f0ce7cb16a6fc57d6a549f37a04e5984527258ba1e8f687636e71f58e7c2dd26700d4b4dff2e78aee6c0338ad2c9bf1a7c12ed61e21b3d22daa25527537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-magicnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
