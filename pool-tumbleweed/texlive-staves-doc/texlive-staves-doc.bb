SUMMARY = "Documentation for texlive-staves"
DESCRIPTION = "This package includes the documentation for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-staves-doc-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "4f1bbf05a4381a1d02bf2cc9730540538f7b648f38ce9239c9655fdcd148f5d36e5093f1d4a8a17fbc77115b91d2314625b179c4ff912f1bbcbb7f40b1216540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-staves-doc"

RDEPENDS:${PN} += ""

inherit rpm
