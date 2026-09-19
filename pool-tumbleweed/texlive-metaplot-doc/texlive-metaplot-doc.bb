SUMMARY = "Documentation for texlive-metaplot"
DESCRIPTION = "This package includes the documentation for texlive-metaplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn15878"

RPM_NAME = "texlive-metaplot-doc-2026.226.0.0.91svn15878-61.2.noarch.rpm"
RPM_HASH = "b560e7a48a9d7943460b0604ee09038bc3764a11cca8419833d61866276fa90cb050f3cd8962924516976d5e4ad46176ec5b96b88cdcf7814e81c0e9345152dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
