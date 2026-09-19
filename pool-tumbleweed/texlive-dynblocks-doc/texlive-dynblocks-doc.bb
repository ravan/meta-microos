SUMMARY = "Documentation for texlive-dynblocks"
DESCRIPTION = "This package includes the documentation for texlive-dynblocks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-doc-2026.226.0.0.2bsvn35193-61.4.noarch.rpm"
RPM_HASH = "15b4be493ca1479c752b836e81c0bff261396a314ca0e7b1dbc1eaadbbfb1e3b2fd3c97f9b89bb6f8dc1dc2a8d0a9d3a3802e9f356ebbc233cb225a684b6c603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
