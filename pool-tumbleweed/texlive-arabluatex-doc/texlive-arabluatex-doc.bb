SUMMARY = "Documentation for texlive-arabluatex"
DESCRIPTION = "This package includes the documentation for texlive-arabluatex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.20svn67201"

RPM_NAME = "texlive-arabluatex-doc-2026.226.1.20svn67201-61.2.noarch.rpm"
RPM_HASH = "325c42892e6c767f981cd50727020e5f710484dc1a30aa99cfae843412d46fd53294c91d1e9c93257e036f2f8bb51ddd222fde854f1e06143eaf73d3ee2ad071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
