SUMMARY = "Documentation for texlive-pdfmarginpar"
DESCRIPTION = "This package includes the documentation for texlive-pdfmarginpar"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.92svn77682"

RPM_NAME = "texlive-pdfmarginpar-doc-2026.226.0.0.92svn77682-58.2.noarch.rpm"
RPM_HASH = "2e5a737e946d4a96aac143b88e365a2211f2328331774d81352345a380c5eacc9a70d551ea35f7d6c839b60ffffc0ae15709d40dad70fffb0383644bc4d0dc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmarginpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
