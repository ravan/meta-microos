SUMMARY = "Documentation for texlive-glossaries-extra"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-extra"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn76767"

RPM_NAME = "texlive-glossaries-extra-doc-2026.226.1.9svn76767-60.4.noarch.rpm"
RPM_HASH = "42c7ef26592914ff73da853d3769278f49d918cfd7c076f962ac384f096cf29a1274ed886baff577a8d285fdcd1d2875b3ab4c5d42b240c0ec6fc1d5a8c27dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
