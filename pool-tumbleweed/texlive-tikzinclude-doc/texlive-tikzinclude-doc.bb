SUMMARY = "Documentation for texlive-tikzinclude"
DESCRIPTION = "This package includes the documentation for texlive-tikzinclude"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-doc-2026.226.1.0svn28715-59.2.noarch.rpm"
RPM_HASH = "52ee117b0c0bc3636b1078cbb7f6654a496bbd79e5f80c7493f3e5afabd33845d0212866148156fd1865ce0c87fecc06f7ec67dd6f2259e3d2afb2f2568e6a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzinclude-doc"

RDEPENDS:${PN} += ""

inherit rpm
