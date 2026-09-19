SUMMARY = "Documentation for texlive-multenum"
DESCRIPTION = "This package includes the documentation for texlive-multenum"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-multenum-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "9351a65c986e10a487c735f0c2786fe17571040b600a0b438447336b64c3c6148333793c217e066235f3a4038d83effc9b0c749fe864c8cc62f97eb6e6fb5b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
