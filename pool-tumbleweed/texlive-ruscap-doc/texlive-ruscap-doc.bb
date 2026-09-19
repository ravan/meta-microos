SUMMARY = "Documentation for texlive-ruscap"
DESCRIPTION = "This package includes the documentation for texlive-ruscap"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn71123"

RPM_NAME = "texlive-ruscap-doc-2026.226.1.0svn71123-60.2.noarch.rpm"
RPM_HASH = "0e8f4346be9c50fc460433366ba27e7bd992654111e0a5d57c17f4a756bdfc813db77ca2fb71fbb2c858d4d56d84dd91be7ab2fc01a4d4e2e569fe2f39c4bc0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ruscap-doc"

RDEPENDS:${PN} += ""

inherit rpm
