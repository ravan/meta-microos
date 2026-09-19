SUMMARY = "Documentation for texlive-romandeadf"
DESCRIPTION = "This package includes the documentation for texlive-romandeadf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-romandeadf-doc-2026.226.2.1svn77682-60.2.noarch.rpm"
RPM_HASH = "ccad030d5cf0045e5b02c6e6efeabce68a764d5cc744a06af73e803cd453fa1a3eeecca27250c2a428951111ce0894e62d31197d35f7a76f5f26ca2133b87a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romandeadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
