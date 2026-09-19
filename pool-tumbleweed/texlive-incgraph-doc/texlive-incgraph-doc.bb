SUMMARY = "Documentation for texlive-incgraph"
DESCRIPTION = "This package includes the documentation for texlive-incgraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn76924"

RPM_NAME = "texlive-incgraph-doc-2026.226.1.3.0svn76924-60.2.noarch.rpm"
RPM_HASH = "7850bfb537a06d513f2e7a15c1e6ff549e049e76ea8d821b76955120a65443512d910da9f1251000d486e90396453943585c8d80a72b328e2622d06f496413f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-incgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
