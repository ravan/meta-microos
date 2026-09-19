SUMMARY = "Documentation for texlive-pict2e"
DESCRIPTION = "This package includes the documentation for texlive-pict2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4bsvn77682"

RPM_NAME = "texlive-pict2e-doc-2026.226.0.0.4bsvn77682-58.2.noarch.rpm"
RPM_HASH = "0f3d64a8efc9ab6c09ab6cc29c3138ca7dfd14b454b3eaace05c3ba10f219faf253f785629f3564f71d08135253f717844af34a8c0d6f146b2f09564b502f15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pict2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
