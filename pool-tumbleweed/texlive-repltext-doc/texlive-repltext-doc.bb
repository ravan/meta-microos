SUMMARY = "Documentation for texlive-repltext"
DESCRIPTION = "This package includes the documentation for texlive-repltext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-repltext-doc-2026.226.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "33071fa53e9c60650f4bcdc353d466e5151c251d0821e81ec2a9ee785c34c5ce265ab95d30ed51ac214b39d79a5f83270ad0210c430242068a66e1a510f0dd15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
