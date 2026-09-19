SUMMARY = "Documentation for texlive-urlbst"
DESCRIPTION = "This package includes the documentation for texlive-urlbst"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9.1svn76790"

RPM_NAME = "texlive-urlbst-doc-2026.226.0.0.9.1svn76790-60.2.noarch.rpm"
RPM_HASH = "a637bb420cd3c0fe108b5226e21885f4861eba500a94f2a03c81079c72ddbda7be0b08168bbbcbeac547bb8a5dd5ba93df3d2041314129678f8b57e37f66bd27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urlbst-doc"

RDEPENDS:${PN} += ""

inherit rpm
