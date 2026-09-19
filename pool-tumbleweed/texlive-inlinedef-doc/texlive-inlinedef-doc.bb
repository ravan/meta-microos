SUMMARY = "Documentation for texlive-inlinedef"
DESCRIPTION = "This package includes the documentation for texlive-inlinedef"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-inlinedef-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "721a912f73c79183271d3e50c8fdb6f220c5d4c971798978bcebe220c05b6c6e5eca45b463c2db12f44fe9908e855ee4ded7641ed3562d2ff7ed3966303a1953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinedef-doc"

RDEPENDS:${PN} += ""

inherit rpm
