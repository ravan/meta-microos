SUMMARY = "Documentation for texlive-sauterfonts"
DESCRIPTION = "This package includes the documentation for texlive-sauterfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-sauterfonts-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "183d4a25b29959721f2a054e801b29caf270231b7c70957d49a2f9ad4b667e10522ff8687d2c9280234cec1632cefbe14fa5e0903554033d2b9382e7048d0cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauterfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
