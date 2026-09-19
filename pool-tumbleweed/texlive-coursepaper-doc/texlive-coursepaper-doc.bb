SUMMARY = "Documentation for texlive-coursepaper"
DESCRIPTION = "This package includes the documentation for texlive-coursepaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-coursepaper-doc-2026.226.2.0svn15878-61.2.noarch.rpm"
RPM_HASH = "05b2256d228b020356ffb9c0a4ce9375fcdb397aefd85b85a9a1fd553e1422f9bd8151f48ff167760acf82962e64edb2d33b43176bf24c2841d795e73d6c072c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coursepaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
