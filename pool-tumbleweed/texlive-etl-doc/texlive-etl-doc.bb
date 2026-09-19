SUMMARY = "Documentation for texlive-etl"
DESCRIPTION = "This package includes the documentation for texlive-etl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-etl-doc-2026.226.0.0.3svn76924-59.2.noarch.rpm"
RPM_HASH = "a1dead130020534532d61f8e306df047c1ab309decbae4dbe6487dc144aa9bddf3fff4bd4d3efdc3ab49dbeedc20b3009a98cfe89399def76b686e1644277bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etl-doc"

RDEPENDS:${PN} += ""

inherit rpm
