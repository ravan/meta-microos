SUMMARY = "Documentation for texlive-hindmadurai"
DESCRIPTION = "This package includes the documentation for texlive-hindmadurai"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn57360"

RPM_NAME = "texlive-hindmadurai-doc-2026.226.0.0.0.1svn57360-60.4.noarch.rpm"
RPM_HASH = "49a28cbbdf2eb67dc79935d0446d5d08e1c2ca095a1e4cbdb9a32fa01fca0f58c14d4e072958ae15bdfb924c7770d63f812ef183ff7deb0a8708350bf1da5684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindmadurai-doc"

RDEPENDS:${PN} += ""

inherit rpm
