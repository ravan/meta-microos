SUMMARY = "Documentation for texlive-mattens"
DESCRIPTION = "This package includes the documentation for texlive-mattens"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77682"

RPM_NAME = "texlive-mattens-doc-2026.226.1.3bsvn77682-59.2.noarch.rpm"
RPM_HASH = "beb8884ebfb87a663ffc067086249572c440da674c8aae34f4c1fa797ca8f647e6f61c6e290fbfc68375b7aae8e7fb61bd3bab69e02220fbc7366449c7476e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mattens-doc"

RDEPENDS:${PN} += ""

inherit rpm
