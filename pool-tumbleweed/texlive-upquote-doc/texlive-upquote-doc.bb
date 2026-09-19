SUMMARY = "Documentation for texlive-upquote"
DESCRIPTION = "This package includes the documentation for texlive-upquote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-upquote-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "08b3b03e2c43f33c4d5c4b08eb3c23b205522139bd82c8eaf170a84254aca2bbe48fb5a6c8e6927ca0eb6cbae0b5240e007d6c55d60622a510f97aeb11291034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upquote-doc"

RDEPENDS:${PN} += ""

inherit rpm
