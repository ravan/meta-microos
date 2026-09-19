SUMMARY = "Documentation for texlive-enotez"
DESCRIPTION = "This package includes the documentation for texlive-enotez"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10dsvn77682"

RPM_NAME = "texlive-enotez-doc-2026.226.0.0.10dsvn77682-61.4.noarch.rpm"
RPM_HASH = "1843a1ab86c05b24fbabb844bed572b6e469fc66af98c0b73f294cbe27a2180c046e0c6acec39f9fc21900a27678e947846de0867657b4cd5044af72a2d7de4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
