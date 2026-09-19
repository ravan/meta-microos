SUMMARY = "Documentation for texlive-crefthe"
DESCRIPTION = "This package includes the documentation for texlive-crefthe"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-crefthe-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "c9d1e827aaf308ea6ee5d27aa71b574035c9496477791e3002faeb7f00f4517dd64565fd7193d7e1e47929b5b367150fa292ead63f22894d5dcf0bfc4321b076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crefthe-doc"

RDEPENDS:${PN} += ""

inherit rpm
