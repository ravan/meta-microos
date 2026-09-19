SUMMARY = "Documentation for texlive-mfware"
DESCRIPTION = "This package includes the documentation for texlive-mfware"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-mfware-doc-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "452f97f8610398e0ae96eb79fb912bd44d4ad58b876a6e050af8afa53bfe6b86a9efb38cb56de49a2c6aad8dbea973c8a5dc16cf939903cacd8a9747acfd1f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gftodvi.1 \
man-gftopk.1 \
man-gftype.1 \
man-mft.1 \
man-pktogf.1 \
man-pktype.1 \
texlive-mfware-doc"

RDEPENDS:${PN} += ""

inherit rpm
