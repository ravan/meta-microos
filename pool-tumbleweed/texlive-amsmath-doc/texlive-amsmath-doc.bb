SUMMARY = "Documentation for texlive-amsmath"
DESCRIPTION = "This package includes the documentation for texlive-amsmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-amsmath-doc-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "ba837705cbb83dc6ba38f974f881bf24e328485f228efbfb186af204f773859d892f869787eb7cef1c03e76a7e6eb6ba208061a8a1bec7b12a033e9f71e6a69c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-amsmath-doc-en \
texlive-amsmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
