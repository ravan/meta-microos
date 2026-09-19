SUMMARY = "Documentation for texlive-twemoji-colr"
DESCRIPTION = "This package includes the documentation for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn75301"

RPM_NAME = "texlive-twemoji-colr-doc-2026.226.0.0.7.0svn75301-59.2.noarch.rpm"
RPM_HASH = "918dd1ac595ad7c02bfb2680c2996aa074c373bb1ef8646769d44ee63efa2b5d9d66fc240df3fbaf6d3c1433a4ebe63154c468929ed984709a166a4e4f5e053f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr-doc"

RDEPENDS:${PN} += ""

inherit rpm
