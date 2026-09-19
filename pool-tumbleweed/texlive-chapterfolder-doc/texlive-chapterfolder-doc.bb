SUMMARY = "Documentation for texlive-chapterfolder"
DESCRIPTION = "This package includes the documentation for texlive-chapterfolder"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-doc-2026.226.2.0.1svn15878-60.2.noarch.rpm"
RPM_HASH = "063d5b96d83325e4de21461a81cf80c2207235c8d3cfa077613e1dfbf488d1f5257559b057480b0509b0859d943c32c0eb60bd2f2a66de05979864784f69b542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chapterfolder-doc"

RDEPENDS:${PN} += ""

inherit rpm
