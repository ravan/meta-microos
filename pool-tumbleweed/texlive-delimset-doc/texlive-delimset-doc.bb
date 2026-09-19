SUMMARY = "Documentation for texlive-delimset"
DESCRIPTION = "This package includes the documentation for texlive-delimset"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.2svn77682"

RPM_NAME = "texlive-delimset-doc-2026.226.2.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "82c21199081cd0df76d231cdac3cc687c66bf3b7a315dc7de1fa7c5707c6dd2d973fe89d7265058d0e79106f660695b5923d83e6c0b57ed9d2b4ab5244044881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimset-doc"

RDEPENDS:${PN} += ""

inherit rpm
