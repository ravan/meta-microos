SUMMARY = "Documentation for texlive-refstyle"
DESCRIPTION = "This package includes the documentation for texlive-refstyle"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn77682"

RPM_NAME = "texlive-refstyle-doc-2026.226.0.0.6bsvn77682-60.4.noarch.rpm"
RPM_HASH = "2714064a3963c779697f836f1fbbd2a0087cce1072941ace189addb52eb9bdf1e5ccfc874bccf0d470c2a71cb1cb81f52da7e4ed788d9bcf3e3ef5a1c6e37640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
