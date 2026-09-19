SUMMARY = "Documentation for texlive-scontents"
DESCRIPTION = "This package includes the documentation for texlive-scontents"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-scontents-doc-2026.226.2.6svn77682-60.2.noarch.rpm"
RPM_HASH = "f1d9ba5130690b1f431824dbbefc6c5938819047acea436922577de4aee945fbdbac8864135a4484f9f96426b29f63e5a5c18b2d2377d6b4933c4c4b30c5a1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
