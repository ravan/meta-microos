SUMMARY = "Documentation for texlive-seealso"
DESCRIPTION = "This package includes the documentation for texlive-seealso"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-seealso-doc-2026.226.1.2svn76924-60.2.noarch.rpm"
RPM_HASH = "663b755259c2a1b6168edd3c1ae34af3e0b4d0811864ba21d0c075e9b15dd74ab328e94c14688b54e652f5e3930d264aba331cd3afe354dfd220f94ad88e1f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seealso-doc"

RDEPENDS:${PN} += ""

inherit rpm
