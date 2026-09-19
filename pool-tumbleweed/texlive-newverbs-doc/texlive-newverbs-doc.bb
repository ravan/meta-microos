SUMMARY = "Documentation for texlive-newverbs"
DESCRIPTION = "This package includes the documentation for texlive-newverbs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn77682"

RPM_NAME = "texlive-newverbs-doc-2026.226.1.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "fd1a46f94823f55640dc5277dddda600df2bdfe977303d048ce3973aa15c61d33d2887473ad1dc9a2ae2e7866e6d89d6a4ac91c9bc2779695d8e4f7a16d937c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newverbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
