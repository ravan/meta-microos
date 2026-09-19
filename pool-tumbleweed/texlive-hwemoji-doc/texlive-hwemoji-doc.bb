SUMMARY = "Documentation for texlive-hwemoji"
DESCRIPTION = "This package includes the documentation for texlive-hwemoji"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65001"

RPM_NAME = "texlive-hwemoji-doc-2026.226.1.0svn65001-60.2.noarch.rpm"
RPM_HASH = "5d53633af288e7f57dd502c522c65e10c329d48e3d05baa2dbdfe75cdebf325ecd29d15e955726eecfd81a5922350d06a155474587439c113ef61b55e07cdcfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hwemoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
