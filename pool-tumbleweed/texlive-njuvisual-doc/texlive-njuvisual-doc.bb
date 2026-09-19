SUMMARY = "Documentation for texlive-njuvisual"
DESCRIPTION = "This package includes the documentation for texlive-njuvisual"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn76924"

RPM_NAME = "texlive-njuvisual-doc-2026.226.0.0.3.0svn76924-61.2.noarch.rpm"
RPM_HASH = "220d48a768e35b4965f3fdf2ec3e2d53f8998a65378365f2754c67e35c432568bd43dc1e12d51c97c92737ad3af64db6a46481a7c86fb6865f0f8977d16776ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuvisual-doc-zh \
texlive-njuvisual-doc"

RDEPENDS:${PN} += ""

inherit rpm
