SUMMARY = "Documentation for texlive-unam-thesis"
DESCRIPTION = "This package includes the documentation for texlive-unam-thesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn51207"

RPM_NAME = "texlive-unam-thesis-doc-2026.226.0.0.5svn51207-60.2.noarch.rpm"
RPM_HASH = "76780c6cc662f8480ca4426ad624640238623ea1726b2453d658c281e09283acd31bbd00cad6ceeae3398f7b015ae4edbaa80581176ad19a3418423c25baafa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unam-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
