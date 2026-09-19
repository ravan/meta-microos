SUMMARY = "Documentation for texlive-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn66461"

RPM_NAME = "texlive-lithuanian-doc-2026.226.svn66461-61.2.noarch.rpm"
RPM_HASH = "9d5f9ae3504b9a1f4da60c7ff2480b4edbdcde5c966e2128e61580501f8a12411fccd97e93be867427fbfe1f84a479b588410a4943d267f1cad1d2fbba0fe0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lithuanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
