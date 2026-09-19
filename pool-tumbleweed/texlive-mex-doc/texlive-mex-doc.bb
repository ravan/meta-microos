SUMMARY = "Documentation for texlive-mex"
DESCRIPTION = "This package includes the documentation for texlive-mex"
LICENSE = "SUSE-TeX"

PV = "2026.226.1.05asvn58661"

RPM_NAME = "texlive-mex-doc-2026.226.1.05asvn58661-61.2.noarch.rpm"
RPM_HASH = "a9a72651261f1d54075c8198657a40a9239c107d81796c6280e68ccce41fe8ec26edeaea9e1563ba70a5ec0aa9c8d06a89417e3fb6ba9c85d185e083257e1d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mex-doc"

RDEPENDS:${PN} += ""

inherit rpm
