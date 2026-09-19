SUMMARY = "Documentation for texlive-korigamik"
DESCRIPTION = "This package includes the documentation for texlive-korigamik"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn71991"

RPM_NAME = "texlive-korigamik-doc-2026.226.1.0svn71991-63.2.noarch.rpm"
RPM_HASH = "4d4f36f5198bc76de03247ced30fb1b7213c2d9eacefec4eb2d7509952f4ae1638cfed38126f14a95ef234fcbba466bfc6e2af20f556c6728724d3164e4087d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-korigamik-doc"

RDEPENDS:${PN} += ""

inherit rpm
