SUMMARY = "Documentation for texlive-active-conf"
DESCRIPTION = "This package includes the documentation for texlive-active-conf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-doc-2026.226.0.0.3asvn15878-61.2.noarch.rpm"
RPM_HASH = "f5326fe47079344558116adbb8fbb6c5e663c57681be9545378ef01b6acf2da21f61610fb355550be3d60de8d30dd710e83f439c8c28ec71bb3fc47111a4c3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-active-conf-doc"

RDEPENDS:${PN} += ""

inherit rpm
