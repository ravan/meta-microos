SUMMARY = "Documentation for texlive-sepnum"
DESCRIPTION = "This package includes the documentation for texlive-sepnum"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn20186"

RPM_NAME = "texlive-sepnum-doc-2026.226.2.0svn20186-60.2.noarch.rpm"
RPM_HASH = "1c8136734bf9ba5a2917ab9b1255981ed95a470f878c45dd7f6c81ce861fd784b0a81a31699e249b3a6410a7a1a00896a457f8ad1c0e2166a25f36d8785372ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
