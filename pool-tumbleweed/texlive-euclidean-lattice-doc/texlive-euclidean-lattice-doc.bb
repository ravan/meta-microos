SUMMARY = "Documentation for texlive-euclidean-lattice"
DESCRIPTION = "This package includes the documentation for texlive-euclidean-lattice"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72985"

RPM_NAME = "texlive-euclidean-lattice-doc-2026.226.1.0svn72985-59.2.noarch.rpm"
RPM_HASH = "06634e8cc382d0abb33ea8397b68bc9a24729b8762aa29bfcc7c0a8925b6e49fc5d412285fa0f87fe06d78f58dc87fba880d7e6e7beabcc2652cf6484c8c2376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euclidean-lattice-doc"

RDEPENDS:${PN} += ""

inherit rpm
