SUMMARY = "Documentation for texlive-smartdiagram"
DESCRIPTION = "This package includes the documentation for texlive-smartdiagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-doc-2026.226.0.0.3bsvn42781-64.2.noarch.rpm"
RPM_HASH = "47154940ca8c977a1728b17bc4efd25b08453350143741fecb3e26e893119762a3272dbc7be3790feeacf2ca2f713ec39d4dde9421fb5ac727c19f4edd1b3020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartdiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
