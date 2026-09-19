SUMMARY = "Documentation for texlive-monofill"
DESCRIPTION = "This package includes the documentation for texlive-monofill"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn28140"

RPM_NAME = "texlive-monofill-doc-2026.226.0.0.2svn28140-61.2.noarch.rpm"
RPM_HASH = "7c585e9e97652863fb385f68225da7d88bba3d26bd3e9183129cc1d1a4fa1e4d77f4883c99b0588dbceb614dfb85f452fdaf0a550472c13446ccf988782f54d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-monofill-doc"

RDEPENDS:${PN} += ""

inherit rpm
