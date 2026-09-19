SUMMARY = "Documentation for texlive-deutschesmuseum"
DESCRIPTION = "This package includes the documentation for texlive-deutschesmuseum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77878"

RPM_NAME = "texlive-deutschesmuseum-doc-2026.226.1.7svn77878-59.2.noarch.rpm"
RPM_HASH = "3d03ea8bb8946a43b6313e7602a93f40c782c1f2cfc63a2c7962c89084fe9da6b40d6e7555ce8b26e2ef3ccff25122929032f117e8778f7c5511138faa3db146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-deutschesmuseum-doc"

RDEPENDS:${PN} += ""

inherit rpm
