SUMMARY = "Documentation for texlive-tikz-lake-fig"
DESCRIPTION = "This package includes the documentation for texlive-tikz-lake-fig"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-doc-2026.226.1.0svn55288-59.2.noarch.rpm"
RPM_HASH = "94ed9a84876c3c1e0a41b3249183d354f8e9c6db30821c28cfecee992343f312b595ba4af653c47a65f4a915e91c184e3877a447a906e2c6ec37a6f6df4f86ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-lake-fig-doc"

RDEPENDS:${PN} += ""

inherit rpm
