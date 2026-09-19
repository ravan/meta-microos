SUMMARY = "Documentation for texlive-hyperxmp"
DESCRIPTION = "This package includes the documentation for texlive-hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.13svn77682"

RPM_NAME = "texlive-hyperxmp-doc-2026.226.5.13svn77682-60.2.noarch.rpm"
RPM_HASH = "99626cf9b28aa041fde42c81dab3b620f351432b655db826c0e35237867cf6c2778cad4f0377e2d8fb0ff256547f98f6fcd7fb8a6daa3c1a595d478b563197c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-hyperxmp-add-bytecount.1 \
texlive-hyperxmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
