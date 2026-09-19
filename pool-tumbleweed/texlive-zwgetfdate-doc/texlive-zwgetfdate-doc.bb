SUMMARY = "Documentation for texlive-zwgetfdate"
DESCRIPTION = "This package includes the documentation for texlive-zwgetfdate"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-zwgetfdate-doc-2026.226.svn15878-59.4.noarch.rpm"
RPM_HASH = "965147c31f8df42451e7819ede746917197d8357635f66380fab27d759c2d313ed67d4ff2a9dded7cefb12899f1ecb0c71c641180563ee8f51546ecd33ab899b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwgetfdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
