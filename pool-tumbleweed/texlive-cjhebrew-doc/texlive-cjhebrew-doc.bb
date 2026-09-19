SUMMARY = "Documentation for texlive-cjhebrew"
DESCRIPTION = "This package includes the documentation for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-doc-2026.226.0.0.2asvn43444-60.2.noarch.rpm"
RPM_HASH = "3f2cea22d7e3ffb249a95b5f075443c0ce5491d42beb3296f166549511fde195fa0fa0b136f2a368c1dc3e9c5644a094b62d433277244f7bc95c483542709144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjhebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
