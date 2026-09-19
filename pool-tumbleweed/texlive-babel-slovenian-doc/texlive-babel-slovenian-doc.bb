SUMMARY = "Documentation for texlive-babel-slovenian"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovenian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2psvn77682"

RPM_NAME = "texlive-babel-slovenian-doc-2026.226.1.2psvn77682-60.2.noarch.rpm"
RPM_HASH = "9187a11160b1b3c1ab9838b5df3b7bfcbe2126d6a86379489ac6b36c27ddd6916d1666ba634b68e298d6c9ead2289a3f380c51faebe731ecd21fd274de3ad709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovenian-doc"

RDEPENDS:${PN} += ""

inherit rpm
