SUMMARY = "Documentation for texlive-ryersonsgsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ryersonsgsthesis"
LICENSE = "Apache-1.0"

PV = "2026.226.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-doc-2026.226.1.0.3svn50119-60.2.noarch.rpm"
RPM_HASH = "2b0be8504c52152f8be514a3d68e4a605ca4c17a2885e7bef220fbebde7ec28b4e460bce9f44296d55e45e90d4dd2e562008aca06de127a4483dce4287b57a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryersonsgsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
