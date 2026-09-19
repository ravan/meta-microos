SUMMARY = "Documentation for texlive-synttree"
DESCRIPTION = "This package includes the documentation for texlive-synttree"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.2svn16252"

RPM_NAME = "texlive-synttree-doc-2026.226.1.4.2svn16252-64.2.noarch.rpm"
RPM_HASH = "aad9d93787953418c1074f70f763b36fb605effefccd7ecd0833613b9d222b15b986a470241a0b001fd662d58560b5037b1fac2a464795889fe70bbc1df04fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synttree-doc"

RDEPENDS:${PN} += ""

inherit rpm
