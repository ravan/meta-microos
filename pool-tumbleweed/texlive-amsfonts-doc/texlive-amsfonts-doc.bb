SUMMARY = "Documentation for texlive-amsfonts"
DESCRIPTION = "This package includes the documentation for texlive-amsfonts"
LICENSE = "OFL-1.1"

PV = "2026.226.3.04svn77682"

RPM_NAME = "texlive-amsfonts-doc-2026.226.3.04svn77682-61.2.noarch.rpm"
RPM_HASH = "b922bb6d915a9fb57683d10995802f69062fb81152387d354f8323fb9d1360fe289f89c56d5107dc350a6d961cf702431eddd73a199f9defdb0500f19a1d980a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
