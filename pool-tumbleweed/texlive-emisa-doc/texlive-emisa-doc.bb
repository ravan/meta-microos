SUMMARY = "Documentation for texlive-emisa"
DESCRIPTION = "This package includes the documentation for texlive-emisa"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn71883"

RPM_NAME = "texlive-emisa-doc-2026.226.2.3.0svn71883-61.4.noarch.rpm"
RPM_HASH = "0f541d5c1eaf3a142024858509ee630bd4f7c348cbec2ccf410083fad1df847d1562f6036710105aea8e6526398145acbce732109fe97d411aa266048e476a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emisa-doc"

RDEPENDS:${PN} += ""

inherit rpm
