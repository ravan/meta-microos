SUMMARY = "Documentation for texlive-kanaparser"
DESCRIPTION = "This package includes the documentation for texlive-kanaparser"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0svn48052"

RPM_NAME = "texlive-kanaparser-doc-2026.226.1.0svn48052-63.2.noarch.rpm"
RPM_HASH = "3bb07c54227aabb54c83e05a391f8dc39243c5dbdfcb96a0a3f5ce86648b17fa7ecca814666f0e84460e00f5ac1f29d73bb11cf8e8861a77333cb6a4af60bcaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kanaparser-doc"

RDEPENDS:${PN} += ""

inherit rpm
