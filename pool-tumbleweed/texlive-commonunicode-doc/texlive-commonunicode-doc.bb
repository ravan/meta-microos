SUMMARY = "Documentation for texlive-commonunicode"
DESCRIPTION = "This package includes the documentation for texlive-commonunicode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-doc-2026.226.1.0.0svn62901-60.2.noarch.rpm"
RPM_HASH = "1028a57ea85bc25e8446ae1932e94925f5e8416038763fd5544d970b97e603cdd13f077e62645f50c625149b5324853c2d3816d686c3f9ee00aefabad3590e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commonunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
