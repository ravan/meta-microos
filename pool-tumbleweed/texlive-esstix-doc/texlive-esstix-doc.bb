SUMMARY = "Documentation for texlive-esstix"
DESCRIPTION = "This package includes the documentation for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-esstix-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "f2f69bc0a2dd58af51d4a701cfd94119bdde487981c7090ea2707558ebf50cec05c72eef7f4f6edade6b8205296d287e650fd5ce4a59d9fae43a721fc4227985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esstix-doc"

RDEPENDS:${PN} += ""

inherit rpm
