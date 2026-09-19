SUMMARY = "Documentation for texlive-elbioimp"
DESCRIPTION = "This package includes the documentation for texlive-elbioimp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn21758"

RPM_NAME = "texlive-elbioimp-doc-2026.226.1.2svn21758-61.4.noarch.rpm"
RPM_HASH = "6e58cb8d39c0701c30bc4640cb6376f0955ae783f9ebd077d67308429ecb261c6e44eec7ddbd21b2ef97c1f43912eeee0483a2401d5fb8748098c506152869b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elbioimp-doc"

RDEPENDS:${PN} += ""

inherit rpm
