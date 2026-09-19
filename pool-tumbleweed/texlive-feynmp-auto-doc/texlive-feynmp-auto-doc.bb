SUMMARY = "Documentation for texlive-feynmp-auto"
DESCRIPTION = "This package includes the documentation for texlive-feynmp-auto"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-feynmp-auto-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "54a2a5c6cfbff9ff9d5564af68165edb5349cd3207208c69ee1eddae8e0c4266cd6cd210a84e9286f58ad54a46cca37530517d9f6951e2b966cdb2d66c59fe48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmp-auto-doc"

RDEPENDS:${PN} += ""

inherit rpm
