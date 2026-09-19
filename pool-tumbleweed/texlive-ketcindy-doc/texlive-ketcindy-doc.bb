SUMMARY = "Documentation for texlive-ketcindy"
DESCRIPTION = "This package includes the documentation for texlive-ketcindy"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-doc-2026.226.20191225.0svn58661-63.2.noarch.rpm"
RPM_HASH = "42f1ad8a99315f8b6caf0e0ae7fe047ad5e4be9ba4456d40c173bea4997bc0c3880a308d23144861f66baec0df55f1f91a86a55ad7e4640b3ee8c172d28ac9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ketcindy-doc-ja \
texlive-ketcindy-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
