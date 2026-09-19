SUMMARY = "Documentation for texlive-youngtab"
DESCRIPTION = "This package includes the documentation for texlive-youngtab"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-youngtab-doc-2026.226.1.1svn77682-59.4.noarch.rpm"
RPM_HASH = "9c7f814220c251c81cbe9e33f3edeb9e0433c0c2a6c6db6106d23c8b7f8500c585a206c7b781a3cb8298e23e6df87e8ea92543c3f49e4fea7a307d7dad25fa83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-youngtab-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
