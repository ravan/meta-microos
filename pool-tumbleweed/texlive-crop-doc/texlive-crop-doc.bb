SUMMARY = "Documentation for texlive-crop"
DESCRIPTION = "This package includes the documentation for texlive-crop"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10.2svn77682"

RPM_NAME = "texlive-crop-doc-2026.226.1.10.2svn77682-61.2.noarch.rpm"
RPM_HASH = "a707affd4e606b43c00c4f548f812322ba9cdbeec23287c25467e5d1be8a217ee54dc585fed537d87ea66726a3f99ce489f2f52950bd4c07d50283ccb324af1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crop-doc"

RDEPENDS:${PN} += ""

inherit rpm
