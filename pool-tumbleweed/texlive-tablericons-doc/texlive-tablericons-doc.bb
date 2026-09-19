SUMMARY = "Documentation for texlive-tablericons"
DESCRIPTION = "This package includes the documentation for texlive-tablericons"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn77184"

RPM_NAME = "texlive-tablericons-doc-2026.226.0.0.1.2svn77184-64.2.noarch.rpm"
RPM_HASH = "813dbf236e2efbca317fae9222c91a6a4f8e7653b3f3ff81fee1d77cad955b7d0cf8639128fa53697b8e2c6f382b0c726c36bedf588ff581c081684f32a8a04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablericons-doc"

RDEPENDS:${PN} += ""

inherit rpm
