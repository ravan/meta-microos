SUMMARY = "Documentation for texlive-listingsutf8"
DESCRIPTION = "This package includes the documentation for texlive-listingsutf8"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn53097"

RPM_NAME = "texlive-listingsutf8-doc-2026.226.1.5svn53097-61.2.noarch.rpm"
RPM_HASH = "8cede808c18a8376af4196a343701209d784dec0ec05d0285be0df2959623e5c013b97c38cdd2b4e872177bf5e4835d7fc45f32d6853f89c375cefb7527e579a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-listingsutf8-doc-en \
texlive-listingsutf8-doc"

RDEPENDS:${PN} += ""

inherit rpm
