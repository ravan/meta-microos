SUMMARY = "Documentation for texlive-qworld"
DESCRIPTION = "This package includes the documentation for texlive-qworld"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn75910"

RPM_NAME = "texlive-qworld-doc-2026.226.1.1.2svn75910-60.4.noarch.rpm"
RPM_HASH = "9629cea737e52dc5256aca709ec66f35d2adb6d0a569e88a9fb9fbe0d7bc0ce004f6c60bfce7adeffcb5436ca15d6c4dd377b5c860a250d94ca13b759f681047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qworld-doc-ja \
texlive-qworld-doc"

RDEPENDS:${PN} += ""

inherit rpm
