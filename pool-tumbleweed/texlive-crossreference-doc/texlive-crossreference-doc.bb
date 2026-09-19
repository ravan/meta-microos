SUMMARY = "Documentation for texlive-crossreference"
DESCRIPTION = "This package includes the documentation for texlive-crossreference"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-crossreference-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "704c5ef18c94623a72040e4df265458ca80322d164574d69c85986c69eca46fb0b76f44f09009ae5ccd731ffc592b4c2681e9f50c56b2ec19c07f4ff2dfa704c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreference-doc"

RDEPENDS:${PN} += ""

inherit rpm
