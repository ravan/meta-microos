SUMMARY = "Documentation for texlive-glossaries-slovene"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-slovene"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-doc-2026.226.1.0svn51211-60.4.noarch.rpm"
RPM_HASH = "1d4bd526df3095fdd076a8442e81bf0ad12fc3cb9e8e01936e7e6e3484755a15866da7b83cc4f3687d29e12de0bdc1bf9d1fdf049693fc4d0b5150da605debaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
