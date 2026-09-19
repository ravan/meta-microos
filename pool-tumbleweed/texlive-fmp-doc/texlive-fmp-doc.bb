SUMMARY = "Documentation for texlive-fmp"
DESCRIPTION = "This package includes the documentation for texlive-fmp"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fmp-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "14b3fd6dfeae036808c8229a2929700dbf602782909561900b83ea8d4fcc70bd059f82a5795a23d0235975b4e80fe6a004531ffa638b4218847d14315e08a553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
