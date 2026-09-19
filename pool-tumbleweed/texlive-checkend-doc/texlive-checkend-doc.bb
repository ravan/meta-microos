SUMMARY = "Documentation for texlive-checkend"
DESCRIPTION = "This package includes the documentation for texlive-checkend"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-checkend-doc-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "c586bbe7e72d29e4b9a7b73dc8764b8c9e5ac6e8a8588ecd9c8007d34998fe12034a19c29f8350b15a7b75cbb5bbe7e8390efc12a673f39f4f0dda663a04ac1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkend-doc"

RDEPENDS:${PN} += ""

inherit rpm
