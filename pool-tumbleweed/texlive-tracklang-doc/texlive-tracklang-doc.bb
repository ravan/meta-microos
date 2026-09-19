SUMMARY = "Documentation for texlive-tracklang"
DESCRIPTION = "This package includes the documentation for texlive-tracklang"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.6svn77682"

RPM_NAME = "texlive-tracklang-doc-2026.226.1.6.6svn77682-59.2.noarch.rpm"
RPM_HASH = "ee67aac38ff21eb6c7f308cb71bc4b34531374a87d6f344c7833ddf4317fc1b828ca122d81c952a55fe1ab02776cb07acca91e64e84c493947a6e607d9e6cd1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tracklang-doc"

RDEPENDS:${PN} += ""

inherit rpm
