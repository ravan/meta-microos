SUMMARY = "Documentation for texlive-hrefhide"
DESCRIPTION = "This package includes the documentation for texlive-hrefhide"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn73641"

RPM_NAME = "texlive-hrefhide-doc-2026.226.1.1bsvn73641-60.4.noarch.rpm"
RPM_HASH = "466085d1cd2b2a97aaca0d330a180bdb46bc69e7871760d47398dc4d4d119d4ea44b689e67cf140b049b74fa3d08fadb8793e8cd53546e4aa843d715afd5da08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hrefhide-doc"

RDEPENDS:${PN} += ""

inherit rpm
