SUMMARY = "Documentation for texlive-maritime"
DESCRIPTION = "This package includes the documentation for texlive-maritime"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn74037"

RPM_NAME = "texlive-maritime-doc-2026.226.1.0svn74037-59.2.noarch.rpm"
RPM_HASH = "56e53f9f4fdda07ed4bafe152db53f5f524a24578bb1acf7e3aafa5b676e0fa94d7ec17730f8a70a2cc9b7549c66acb5e5c92ae482c10cf1d89203ade8700ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maritime-doc"

RDEPENDS:${PN} += ""

inherit rpm
