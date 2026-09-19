SUMMARY = "Documentation for texlive-pst-kepler"
DESCRIPTION = "This package includes the documentation for texlive-pst-kepler"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77232"

RPM_NAME = "texlive-pst-kepler-doc-2026.226.0.0.01svn77232-59.2.noarch.rpm"
RPM_HASH = "f70f3b45d8bcb6f6f9530b2cdcfe93ba9661051daedaf65be72dbcdfed7fb4b8dda4747eb2179f9728d62bd3a026b928bdd0e8a4936f1897d02bad5c4e7f44b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-kepler-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
