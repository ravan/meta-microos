SUMMARY = "Documentation for texlive-tensor"
DESCRIPTION = "This package includes the documentation for texlive-tensor"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.2svn77682"

RPM_NAME = "texlive-tensor-doc-2026.227.2.2svn77682-62.2.noarch.rpm"
RPM_HASH = "1a3a6afc0d4827019a9f9aa72c8a93372b908d1c36505922ab64ccea9383858a491b01178319193190816f508a64ba5773290d71e4ab1e6514c166f3d00c9a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
