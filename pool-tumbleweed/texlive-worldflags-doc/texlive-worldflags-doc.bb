SUMMARY = "Documentation for texlive-worldflags"
DESCRIPTION = "This package includes the documentation for texlive-worldflags"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68827"

RPM_NAME = "texlive-worldflags-doc-2026.226.svn68827-60.2.noarch.rpm"
RPM_HASH = "034e27effada17f84955ce072db864ce01ff0011988165e4c01c281aadcae495b77e811a47044441951eb2102e7c575bc13edd085aff70af6151b2c2fac0fa3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worldflags-doc"

RDEPENDS:${PN} += ""

inherit rpm
