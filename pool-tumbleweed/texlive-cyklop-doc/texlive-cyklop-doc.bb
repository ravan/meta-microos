SUMMARY = "Documentation for texlive-cyklop"
DESCRIPTION = "This package includes the documentation for texlive-cyklop"
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.915svn77682"

RPM_NAME = "texlive-cyklop-doc-2026.226.0.0.915svn77682-61.2.noarch.rpm"
RPM_HASH = "810500e6031da1a193973fde87a1ba786c31e1fa60ba1852a5b0ebe42a49e6b5234cdd0f34176ea7337c8a73445258bcf257d94f59600dfb2f65ab352f8725f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyklop-doc"

RDEPENDS:${PN} += ""

inherit rpm
