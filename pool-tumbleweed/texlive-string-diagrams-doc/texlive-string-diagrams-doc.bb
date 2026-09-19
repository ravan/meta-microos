SUMMARY = "Documentation for texlive-string-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-string-diagrams"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn67363"

RPM_NAME = "texlive-string-diagrams-doc-2026.226.0.0.2.1svn67363-64.2.noarch.rpm"
RPM_HASH = "b0c39c0cec6d174c1ff3d30fe398894b70f94692b48991b991c9e35b8c7333fcc522d995ce3a509e38de6cd6a2e085e2fb5ef80778ebeace8be65cde147b897e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-string-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
