SUMMARY = "Documentation for texlive-tabvar"
DESCRIPTION = "This package includes the documentation for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.8svn63921"

RPM_NAME = "texlive-tabvar-doc-2026.227.1.8svn63921-62.2.noarch.rpm"
RPM_HASH = "93834686a13136539debb3f1fd2fe244ba4d74aca17863e23c1433c0e1f378c710e825f89a26aef04c86e8bc479732a81e96d65f50e9a2f9dabc834a9debb6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabvar-doc-fr \
texlive-tabvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
