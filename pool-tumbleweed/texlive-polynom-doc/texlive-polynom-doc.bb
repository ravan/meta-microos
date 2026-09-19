SUMMARY = "Documentation for texlive-polynom"
DESCRIPTION = "This package includes the documentation for texlive-polynom"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn77682"

RPM_NAME = "texlive-polynom-doc-2026.226.0.0.19svn77682-59.2.noarch.rpm"
RPM_HASH = "0ae0f8a5c3ff6594f127b3b1c6fd699d36b25a71acd887d83eea49360a5a545dd04b762c1454e40a91a0e5ba6f6b4e010b479ddee0221fa6db3d08038e036d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynom-doc"

RDEPENDS:${PN} += ""

inherit rpm
