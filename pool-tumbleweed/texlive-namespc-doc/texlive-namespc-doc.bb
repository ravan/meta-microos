SUMMARY = "Documentation for texlive-namespc"
DESCRIPTION = "This package includes the documentation for texlive-namespc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-namespc-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "e6bde0c6e0d20bb60e718c57208f55b4a46d454c7779fc8b3c7cbf584c5b0784968df330c8702c135d2d312e5c97061a2cbf7d298695e18402eaf740b73cd7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-namespc-doc"

RDEPENDS:${PN} += ""

inherit rpm
