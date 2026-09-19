SUMMARY = "Documentation for texlive-skrapport"
DESCRIPTION = "This package includes the documentation for texlive-skrapport"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12ksvn52412"

RPM_NAME = "texlive-skrapport-doc-2026.226.0.0.12ksvn52412-64.2.noarch.rpm"
RPM_HASH = "3d878b74b2646660c840390ec967b878269b768505d78a62632ae56824af8e2fe6ca5caacda7e41e2761bcafb4efdb605e702fdaa8fc58e5d7a23c522c2bed16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skrapport-doc"

RDEPENDS:${PN} += ""

inherit rpm
