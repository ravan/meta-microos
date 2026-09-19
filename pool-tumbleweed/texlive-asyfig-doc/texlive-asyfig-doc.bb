SUMMARY = "Documentation for texlive-asyfig"
DESCRIPTION = "This package includes the documentation for texlive-asyfig"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn17512"

RPM_NAME = "texlive-asyfig-doc-2026.226.0.0.1csvn17512-60.2.noarch.rpm"
RPM_HASH = "77a8fd4257451a473a2b8b4088c55e35db5cebee8f3116b7f939ebdeb779f4284809f9cce2f5b7c3f1a67ce7c87fe960e5a4b8a64e7bd5421a01b559581b941f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
