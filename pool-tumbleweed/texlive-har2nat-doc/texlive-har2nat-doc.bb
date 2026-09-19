SUMMARY = "Documentation for texlive-har2nat"
DESCRIPTION = "This package includes the documentation for texlive-har2nat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-har2nat-doc-2026.226.1.0svn77682-60.4.noarch.rpm"
RPM_HASH = "e6dd69187f20f7ab39e51906bcba5f2d23f2ec76a2d4af7ca2f87d23ab92b04cd4f7e0bc334b0b9527303e22dcdb62919124d3ca08ef10e002472d526a844da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-har2nat-doc"

RDEPENDS:${PN} += ""

inherit rpm
