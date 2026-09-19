SUMMARY = "Documentation for texlive-colorblind"
DESCRIPTION = "This package includes the documentation for texlive-colorblind"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn77410"

RPM_NAME = "texlive-colorblind-doc-2026.226.1.2.1svn77410-60.2.noarch.rpm"
RPM_HASH = "ce03112bcd88b71c199256f7946d896f3be148c39337c5b8a9df94187dd059b051cda85aa9d3310fb057c5963590f2c8fbdb0856caadc74927a2c84ae018bb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorblind-doc"

RDEPENDS:${PN} += ""

inherit rpm
