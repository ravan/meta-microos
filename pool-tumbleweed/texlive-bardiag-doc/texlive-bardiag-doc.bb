SUMMARY = "Documentation for texlive-bardiag"
DESCRIPTION = "This package includes the documentation for texlive-bardiag"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn22013"

RPM_NAME = "texlive-bardiag-doc-2026.226.0.0.4asvn22013-60.2.noarch.rpm"
RPM_HASH = "d5d2748423443ef5f5a8a3916056783fba74d7add9cf7017b635777530c8556f7fec6472783f332eef29a4d974db7a1e3c32e41526b1b9e1ae9616841fea7b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bardiag-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
