SUMMARY = "Documentation for texlive-fontawesome"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-doc-2026.226.4.6.3.2svn48145-60.2.noarch.rpm"
RPM_HASH = "70501da28b44b1e028f98775e62fbec2b51f4436306dfeedd31d6c07398ac97fd4e60088933827d7bd6a87bb2a18d72caf00427b27373621b03e5a8584ae4ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome-doc"

RDEPENDS:${PN} += ""

inherit rpm
