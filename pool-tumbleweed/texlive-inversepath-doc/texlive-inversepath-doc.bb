SUMMARY = "Documentation for texlive-inversepath"
DESCRIPTION = "This package includes the documentation for texlive-inversepath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-inversepath-doc-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "d2df5a16c72f30957d5e387391addeb323c887dfe94dfa11f4b67768530943e1e99fc3435b1ffd3537c1ce84ce060d1ebe4376d80f93590d004a6188b98081c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inversepath-doc"

RDEPENDS:${PN} += ""

inherit rpm
