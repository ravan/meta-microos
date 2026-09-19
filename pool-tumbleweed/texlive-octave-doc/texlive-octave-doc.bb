SUMMARY = "Documentation for texlive-octave"
DESCRIPTION = "This package includes the documentation for texlive-octave"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-octave-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "4dfc9bc4ed14efe16a5bb55644ef2cb331e87ab3fbc2e5a11b64304194163b935dc4a88082e42d2ac4729c75676b59de0d7a1d880451c999a64ac1427ef69a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
