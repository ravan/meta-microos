SUMMARY = "Documentation for texlive-hithesis"
DESCRIPTION = "This package includes the documentation for texlive-hithesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-doc-2026.226.2.0.11svn64005-60.4.noarch.rpm"
RPM_HASH = "71c84e290e1f3a1ecc31beda5a4fea18fd11d866122c22fa2ad80d70d2bf5ebf7c23024bad9d93c9fb726391c236d2cffe6b92d6134d0f9b64bfb4c8c9c7c77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hithesis-doc-zh \
texlive-hithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
