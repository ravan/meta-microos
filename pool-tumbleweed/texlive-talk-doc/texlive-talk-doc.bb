SUMMARY = "Documentation for texlive-talk"
DESCRIPTION = "This package includes the documentation for texlive-talk"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn76392"

RPM_NAME = "texlive-talk-doc-2026.227.2.0svn76392-62.2.noarch.rpm"
RPM_HASH = "8e7e890c35cca04857242630ea44b06ac7e5961cd342e715e4b4a5765bb6d712a5c3f688d374dd5d3af222d57c21e653ecbd10ed5adcc692e5c5ce028c9f31ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talk-doc"

RDEPENDS:${PN} += ""

inherit rpm
