SUMMARY = "Documentation for texlive-titlecaps"
DESCRIPTION = "This package includes the documentation for texlive-titlecaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-titlecaps-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "24417088aaefb360b50c37ac0aaa1a89e49fd8ccc36909b2d1ed4fb7afa4a884d7355b86d0c3c34ded0273517aefc17ebd12dd21fd2da9f8a194f3d1864ca9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlecaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
