SUMMARY = "Documentation for texlive-lilyglyphs"
DESCRIPTION = "This package includes the documentation for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-doc-2026.226.0.0.2.4svn56473-61.2.noarch.rpm"
RPM_HASH = "bd00e3949b3ed8d425f4353a36b02be11e6272245cc41a03fa62d2898dfe7e1a0766d29409b00c71a843adf9e470c4069d192c240919295a1e8fe838d4709a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lilyglyphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
