SUMMARY = "Documentation for texlive-enumsub"
DESCRIPTION = "This package includes the documentation for texlive-enumsub"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75967"

RPM_NAME = "texlive-enumsub-doc-2026.226.1.0svn75967-61.4.noarch.rpm"
RPM_HASH = "c990d65ca0709f8fae574ccc25f02f1bba2f44101cfd01a7c975b7552eaa8bb7f96e7d8ad9c8afbcce0c424890ed069e737e0d1e279400b45ee5ad8df273ddf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
