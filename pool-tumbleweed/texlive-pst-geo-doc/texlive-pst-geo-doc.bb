SUMMARY = "Documentation for texlive-pst-geo"
DESCRIPTION = "This package includes the documentation for texlive-pst-geo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.09svn74247"

RPM_NAME = "texlive-pst-geo-doc-2026.226.0.0.09svn74247-59.2.noarch.rpm"
RPM_HASH = "62d97b9ad06a32b625c736d289d3bf88e4aa384bdf6ed6d2baf4d7cb95de95d0f1a9872b294a28573e89fb60ad89b1940980a1e296ddab9ee4927ba8335af2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-geo-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
