SUMMARY = "Documentation for texlive-uniquecounter"
DESCRIPTION = "This package includes the documentation for texlive-uniquecounter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-uniquecounter-doc-2026.226.1.4svn77682-60.2.noarch.rpm"
RPM_HASH = "31f1f88386cd6829f0a0e45c3ef3faa64a6cf5ce206390b98e73fd37f6b691795e8dc7ba569994827f1d99a82fc0f0fd58496123ec755735e1d797795372fd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uniquecounter-doc"

RDEPENDS:${PN} += ""

inherit rpm
