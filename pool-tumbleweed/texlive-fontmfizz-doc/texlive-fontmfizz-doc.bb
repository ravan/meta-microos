SUMMARY = "Documentation for texlive-fontmfizz"
DESCRIPTION = "This package includes the documentation for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn43546"

RPM_NAME = "texlive-fontmfizz-doc-2026.226.svn43546-60.2.noarch.rpm"
RPM_HASH = "2f69026d29f324c0d60929160b0f6dff0ed378164dd576e6763acc61ffb8c110791e719ec1a0ac92bb35442a8aedc4e4cfb5f73f94d203fd2fd29a04cb5e41fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontmfizz-doc"

RDEPENDS:${PN} += ""

inherit rpm
