SUMMARY = "Documentation for texlive-ieeeconf"
DESCRIPTION = "This package includes the documentation for texlive-ieeeconf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-doc-2026.226.1.4svn59665-60.2.noarch.rpm"
RPM_HASH = "487758da9afd388528a73247b94792bfe61b2a944fde2378118c5e4c0bbb62db6fd0bad6234d6ad4205660a5d5fed44fb78d1e06662da8cba86c2025b8d7ee15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
