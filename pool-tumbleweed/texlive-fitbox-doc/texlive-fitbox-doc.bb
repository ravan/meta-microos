SUMMARY = "Documentation for texlive-fitbox"
DESCRIPTION = "This package includes the documentation for texlive-fitbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-fitbox-doc-2026.226.1.02svn77682-59.2.noarch.rpm"
RPM_HASH = "2edbe53a0d01db7ce62491152833228aa12180e71867933811f2f9a4c304953f555951e3455005c8918a86b436b05354a0d5d1007dfe4726dcf651c1635ab767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fitbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
