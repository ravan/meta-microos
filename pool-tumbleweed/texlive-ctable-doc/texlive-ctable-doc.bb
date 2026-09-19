SUMMARY = "Documentation for texlive-ctable"
DESCRIPTION = "This package includes the documentation for texlive-ctable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.33svn77682"

RPM_NAME = "texlive-ctable-doc-2026.226.1.33svn77682-61.2.noarch.rpm"
RPM_HASH = "e269b1fc78ed818ebf4cadd476147b1f69210c75f1625e9c458df3a5efb11959867bc664b12eecac0659a29ddbe955c938f3727c0bedb956e322e82dd2b1a76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctable-doc"

RDEPENDS:${PN} += ""

inherit rpm
