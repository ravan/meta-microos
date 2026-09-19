SUMMARY = "Documentation for texlive-gratzer-color-scheme"
DESCRIPTION = "This package includes the documentation for texlive-gratzer-color-scheme"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn73199"

RPM_NAME = "texlive-gratzer-color-scheme-doc-2026.226.1.0svn73199-60.4.noarch.rpm"
RPM_HASH = "e80ff385833041c0cc8901e7a10808825fefbf7322d8634b43d74ff6e2e4df1518d47a0eb808dc2a44fea0c79e54058a55e51cb8d0d53a96558bcfb3b041a06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gratzer-color-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
