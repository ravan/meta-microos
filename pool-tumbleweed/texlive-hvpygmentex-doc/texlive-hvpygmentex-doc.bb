SUMMARY = "Documentation for texlive-hvpygmentex"
DESCRIPTION = "This package includes the documentation for texlive-hvpygmentex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-doc-2026.226.0.0.01svn62405-60.2.noarch.rpm"
RPM_HASH = "c88a6792faffeff579b0f2a2dc45a45657f17d209e27605f1a7d4b468724e85027be8eafa4cd223705d7cb9066cee3e530b88517e51af9dc1f84a0431b4bc401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvpygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
