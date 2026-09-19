SUMMARY = "Documentation for texlive-bbm-macros"
DESCRIPTION = "This package includes the documentation for texlive-bbm-macros"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17224"

RPM_NAME = "texlive-bbm-macros-doc-2026.226.svn17224-61.2.noarch.rpm"
RPM_HASH = "a7bab6c41f557de0198548afca5033bb6e0b8a539dc083b2288df4765f98dabcc7f7f3e4b5b021b398f28e82a2dcf5a2a0702dc61111bd811b2b27728335992f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
