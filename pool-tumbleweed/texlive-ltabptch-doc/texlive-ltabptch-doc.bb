SUMMARY = "Documentation for texlive-ltabptch"
DESCRIPTION = "This package includes the documentation for texlive-ltabptch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-doc-2026.226.1.74dsvn17533-59.2.noarch.rpm"
RPM_HASH = "b48fcb053fb0635befec688656ce88bce774068b55452ee055a62713b3a8848aaf8188bafd4958295b02f66118841b1e8a081463b2eebb938888274a2b832da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltabptch-doc"

RDEPENDS:${PN} += ""

inherit rpm
