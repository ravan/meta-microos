SUMMARY = "Documentation for texlive-latex2man"
DESCRIPTION = "This package includes the documentation for texlive-latex2man"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn77377"

RPM_NAME = "texlive-latex2man-doc-2026.226.1.30svn77377-61.2.noarch.rpm"
RPM_HASH = "092ca514c15bf769bb6ed496e5bc463d4254be75ed446a02cca001c64239d8ecc5b7041fa92f47704b2fd8df73e424af91fe53f263a9091dc2a3f90a2f3b0e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex2man.1 \
texlive-latex2man-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
