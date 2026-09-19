SUMMARY = "Documentation for texlive-mnsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-doc-2026.226.1.4svn18651-61.2.noarch.rpm"
RPM_HASH = "891ef400cf15e41803b4fd73093e33bf467a3befcb20a3b703e919c178849ec092bbb3dc5d823b5e108ea1c650d66839b67e7a519f23732f8e792a2b6f4a259c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
