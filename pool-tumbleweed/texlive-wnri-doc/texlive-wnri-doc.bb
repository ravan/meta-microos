SUMMARY = "Documentation for texlive-wnri"
DESCRIPTION = "This package includes the documentation for texlive-wnri"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22459"

RPM_NAME = "texlive-wnri-doc-2026.226.svn22459-60.2.noarch.rpm"
RPM_HASH = "80d65664afa696201794fe8689a10e93bb474e5cee184203f8fe9e96577ad3e524a20e0b3e72654394d3d0597caba1882656b24cea97b9ecace8b5e227d22d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-doc"

RDEPENDS:${PN} += ""

inherit rpm
