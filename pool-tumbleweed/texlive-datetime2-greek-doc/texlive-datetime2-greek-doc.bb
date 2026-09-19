SUMMARY = "Documentation for texlive-datetime2-greek"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-greek"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-doc-2026.226.1.1svn47533-59.2.noarch.rpm"
RPM_HASH = "e743e423fbc2ba76ebf871cf71539c245dac71b880deea29f74c6b9e8bc4aafdf1d796795bb449314329d1f4a1462cf705eef5957281edb57c9551e43edbb8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
