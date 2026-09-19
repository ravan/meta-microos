SUMMARY = "Documentation for texlive-gfsporson"
DESCRIPTION = "This package includes the documentation for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gfsporson-doc-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "6e2d64a1054cce89b30d41a1e989e0117eb04afab14234b64ac6301233ba637fd2815da2bf0067f4494164a804628434877abd57bc6daac4e0ce8bae0dcfecfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsporson-doc"

RDEPENDS:${PN} += ""

inherit rpm
