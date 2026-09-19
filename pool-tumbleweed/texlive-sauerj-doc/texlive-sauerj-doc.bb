SUMMARY = "Documentation for texlive-sauerj"
DESCRIPTION = "This package includes the documentation for texlive-sauerj"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-sauerj-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "b7cbb44b1de5afae8a4f966f65d3ed505688c01f8ce602533d0db5176e5bd07b427700a8bf908c9712ad115b290c3395d69895d2119f0420f3bca815b2881207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauerj-doc"

RDEPENDS:${PN} += ""

inherit rpm
