SUMMARY = "Documentation for texlive-qrbill"
DESCRIPTION = "This package includes the documentation for texlive-qrbill"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01svn76924"

RPM_NAME = "texlive-qrbill-doc-2026.226.2.01svn76924-60.4.noarch.rpm"
RPM_HASH = "d7f171a93c2d2d7a5e34d465b9bb01ba36b65e97c1828886cc7dfc5feeb27ae06b55fcbc67d1def1cf617fe4981a8a1b00312fac26e9ca96ee7934d2a07a5cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
