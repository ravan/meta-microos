SUMMARY = "Documentation for texlive-gmverb"
DESCRIPTION = "This package includes the documentation for texlive-gmverb"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-doc-2026.226.0.0.98svn24288-60.4.noarch.rpm"
RPM_HASH = "9e49e85d51525c43fab485f741346ce0bcf9dd13f9940dfe638857fb2b82e7ad04bdb46986924bc4e344d1dce2d9f1a2235a714ea28984371001ab973f0558d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
