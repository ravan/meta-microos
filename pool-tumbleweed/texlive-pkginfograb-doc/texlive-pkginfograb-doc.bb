SUMMARY = "Documentation for texlive-pkginfograb"
DESCRIPTION = "This package includes the documentation for texlive-pkginfograb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77338"

RPM_NAME = "texlive-pkginfograb-doc-2026.226.1.2asvn77338-58.2.noarch.rpm"
RPM_HASH = "eb43c5fc6fc1e0d837191f7545bd79faa15524188ab52c70a085277af3fb4361f1c252850c9b9c79512d187e019d684fb354943f1eb853025fc8fefceafe0e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkginfograb-doc"

RDEPENDS:${PN} += ""

inherit rpm
