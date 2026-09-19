SUMMARY = "Documentation for texlive-tikzcodeblocks"
DESCRIPTION = "This package includes the documentation for texlive-tikzcodeblocks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-doc-2026.226.0.0.13svn54758-59.2.noarch.rpm"
RPM_HASH = "3b12814c030116c80a8e0fd8afb38344266c8088c67d972465959e71467330dbd34ba223b81ff95e4af7431d3d9c8c3198ac776f6e611c32d65313d1bd1e320a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikzcodeblocks-doc-de \
texlive-tikzcodeblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
