SUMMARY = "Documentation for texlive-yfonts"
DESCRIPTION = "This package includes the documentation for texlive-yfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-yfonts-doc-2026.226.1.4svn77682-59.4.noarch.rpm"
RPM_HASH = "91f6d9fb26d3b0b88bf87468cc80b77ecd9188635d83fa0547862611a5904ae4b403e6c6bd03401703db9d28c3978eff8f9c54f40e07572556a74270878769d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
