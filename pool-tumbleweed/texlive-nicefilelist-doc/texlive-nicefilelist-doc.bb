SUMMARY = "Documentation for texlive-nicefilelist"
DESCRIPTION = "This package includes the documentation for texlive-nicefilelist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9csvn77682"

RPM_NAME = "texlive-nicefilelist-doc-2026.226.0.0.9csvn77682-61.2.noarch.rpm"
RPM_HASH = "79f33aca97e9be6e72767c2bdb2b45a6f232c14f99c720002619c01b71db1651080b085f3b6f3c0217f2521482f461f6e9ef430a4815ad500898b66bac0c3887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicefilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
