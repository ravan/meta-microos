SUMMARY = "Documentation for texlive-revquantum"
DESCRIPTION = "This package includes the documentation for texlive-revquantum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-doc-2026.226.0.0.11svn43505-60.4.noarch.rpm"
RPM_HASH = "1e3c77ded3b81a6903fc76835097821e49ff20b416db92b4c20e2c8a53405d11fe1405e8db8e9b15a9e5104c126ac319a420470374c4afb9bb5b497e93795860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revquantum-doc"

RDEPENDS:${PN} += ""

inherit rpm
