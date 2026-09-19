SUMMARY = "Documentation for texlive-mfb-oldstyle"
DESCRIPTION = "This package includes the documentation for texlive-mfb-oldstyle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-mfb-oldstyle-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "8081facf81a164ea9eeebe575737e83ab31256b07fc7ba6dd4e057b2db7c42412bee39324251fe56e80ef989bd0721e7bcc5a261c415a965be230c3ac7f50178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfb-oldstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
