SUMMARY = "Documentation for texlive-archivo"
DESCRIPTION = "This package includes the documentation for texlive-archivo"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.2svn57283"

RPM_NAME = "texlive-archivo-doc-2026.226.0.0.0.2svn57283-61.2.noarch.rpm"
RPM_HASH = "f1732ee7b3125bf624669afcf5cdda57dceefbed1997d8eedb47ec1600639390c184534e6d3011ac9febf5f6f9933b7d53442ed974d4d0f439f2e17f3de8b735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archivo-doc"

RDEPENDS:${PN} += ""

inherit rpm
