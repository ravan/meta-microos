SUMMARY = "Documentation for texlive-ling-macros"
DESCRIPTION = "This package includes the documentation for texlive-ling-macros"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42268"

RPM_NAME = "texlive-ling-macros-doc-2026.226.svn42268-61.2.noarch.rpm"
RPM_HASH = "fe8cc67c48b09e8f6d61c6a58ddf3a4c6c3260805c6f2ee7122358563dccb86f01e4002f76abe2267652536fb3c00a4ef651b94dcc57d3dc783f8237ca8ef2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ling-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
