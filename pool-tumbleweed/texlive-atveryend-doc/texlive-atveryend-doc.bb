SUMMARY = "Documentation for texlive-atveryend"
DESCRIPTION = "This package includes the documentation for texlive-atveryend"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-atveryend-doc-2026.226.1.12svn77682-60.2.noarch.rpm"
RPM_HASH = "146fdd1073c2d685a366ad6669a01e15aa0129d92469a4f4def68604c0a1e55cc05897527c5f4ad77f8676cdf2a8d7c78744e5b0c406163926c897c86a99756a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atveryend-doc"

RDEPENDS:${PN} += ""

inherit rpm
