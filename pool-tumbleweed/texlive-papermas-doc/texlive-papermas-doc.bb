SUMMARY = "Documentation for texlive-papermas"
DESCRIPTION = "This package includes the documentation for texlive-papermas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn66835"

RPM_NAME = "texlive-papermas-doc-2026.226.1.1asvn66835-58.2.noarch.rpm"
RPM_HASH = "39136051a9146842e892ae96bff9e6ebcede8abe7112894dec98e78f8d251e17ba3365cededd658409378cfb5e791103142a5d90ee5f8bf7fc8202178464be38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papermas-doc"

RDEPENDS:${PN} += ""

inherit rpm
