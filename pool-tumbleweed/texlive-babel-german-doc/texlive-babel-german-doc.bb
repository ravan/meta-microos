SUMMARY = "Documentation for texlive-babel-german"
DESCRIPTION = "This package includes the documentation for texlive-babel-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.99csvn77815"

RPM_NAME = "texlive-babel-german-doc-2026.226.2.99csvn77815-60.2.noarch.rpm"
RPM_HASH = "a86f34cb1b6cc0aa125e25b285ae679d0bb398c12c200973d9555e90bfb5e1556b3827a11cac9a52e30978a0206f41320a507515799ddfbb4cd9c34514439b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
