SUMMARY = "Documentation for texlive-trigonometry"
DESCRIPTION = "This package includes the documentation for texlive-trigonometry"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn43006"

RPM_NAME = "texlive-trigonometry-doc-2026.226.svn43006-59.2.noarch.rpm"
RPM_HASH = "c851e229d0c50345076a1f056992af9e1b71fe3d46d02f63dd7c628deca29abf999cfa0908e038c2938b17422ea5b06c9d9522862996950ffa165d9ca2cc93c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trigonometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
