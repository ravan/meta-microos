SUMMARY = "Documentation for texlive-tikzpfeile"
DESCRIPTION = "This package includes the documentation for texlive-tikzpfeile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-doc-2026.226.1.0svn25777-59.2.noarch.rpm"
RPM_HASH = "d4fd8db6f782d41fa4816fb3e5aa2966ecdbf334547ffea059d669a7e1465111754947d28220eb89394368aa0bbcd2e460a57b6f13a0be49118eef0369498739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpfeile-doc"

RDEPENDS:${PN} += ""

inherit rpm
