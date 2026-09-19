SUMMARY = "Documentation for texlive-rmathbr"
DESCRIPTION = "This package includes the documentation for texlive-rmathbr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-doc-2026.226.1.1.1svn57173-60.4.noarch.rpm"
RPM_HASH = "40f43325e373a9adec0c2e803523661a0428f8b0eb2fa029fcd1fcecdcc9b727ed2d4a47f9a395d44291c28ac2268438aafd75e4c675b5bf4be818b643f07c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmathbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
