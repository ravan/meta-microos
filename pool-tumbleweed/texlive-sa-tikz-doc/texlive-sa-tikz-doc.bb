SUMMARY = "Documentation for texlive-sa-tikz"
DESCRIPTION = "This package includes the documentation for texlive-sa-tikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7asvn32815"

RPM_NAME = "texlive-sa-tikz-doc-2026.226.0.0.7asvn32815-60.2.noarch.rpm"
RPM_HASH = "bf3f3e8b2414e64eb8eba0847411c1bf2af5a9afa35596964350b3c3d4d66daac86db0482433333c4f3e704b80e6f208cdae9bc7326fd75177817dfa47c0fe97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sa-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
