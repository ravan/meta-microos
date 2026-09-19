SUMMARY = "Documentation for texlive-bxwareki"
DESCRIPTION = "This package includes the documentation for texlive-bxwareki"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn67594"

RPM_NAME = "texlive-bxwareki-doc-2026.226.0.0.7svn67594-59.2.noarch.rpm"
RPM_HASH = "f04a29cc6a5e260a80ed8b38559a5de88a111f8c186da3f13d61d2c9544f4f46c4637113ec24594f4dc9db5567bcda509bae9c0728cefc6eb4f109237888785f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxwareki-doc"

RDEPENDS:${PN} += ""

inherit rpm
