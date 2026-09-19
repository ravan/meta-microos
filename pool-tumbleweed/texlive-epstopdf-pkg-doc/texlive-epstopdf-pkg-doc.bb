SUMMARY = "Documentation for texlive-epstopdf-pkg"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf-pkg"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn77682"

RPM_NAME = "texlive-epstopdf-pkg-doc-2026.226.2.11svn77682-61.4.noarch.rpm"
RPM_HASH = "4c327cdc4065d0753e724a2550af8e67c8aacc41e93ee7d103540194eca27826407ba4fb9807de2c4f13db1b8bf2ccc34aa0c7de30e1feabe31c384a93737f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
