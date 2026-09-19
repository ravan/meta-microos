SUMMARY = "Documentation for texlive-dottex"
DESCRIPTION = "This package includes the documentation for texlive-dottex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-dottex-doc-2026.226.0.0.6svn15878-59.2.noarch.rpm"
RPM_HASH = "aca640ac13bdf13175e3ffc4aff0a1a4697b977bcfb3e39a920b009a2f85af2f3087ff0b8b3d1d15b0ccc869577cd07dfc292541366041b6928b24268e90ef90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
