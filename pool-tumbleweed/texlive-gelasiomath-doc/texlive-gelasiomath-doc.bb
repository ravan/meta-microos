SUMMARY = "Documentation for texlive-gelasiomath"
DESCRIPTION = "This package includes the documentation for texlive-gelasiomath"
LICENSE = "OFL-1.1"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gelasiomath-doc-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "9032d0d02966d21a0367e06cea01fe575ab46868c6483d1d96cf38d9785f12bb104c5bcc9e5def49710fcfbd139581594064eef03364a9b8d107950b791470d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gelasiomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
