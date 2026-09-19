SUMMARY = "Documentation for texlive-truncate"
DESCRIPTION = "This package includes the documentation for texlive-truncate"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-truncate-doc-2026.226.3.6svn77682-59.2.noarch.rpm"
RPM_HASH = "b1b3f143a523edccb2f74461992c6bf2bb3cc9e5ba2490cf34fd736ee725eef3fa5d29639d13aa77cf2420769a4173cf5f796e2532ea0a4a651c8153f0dc9a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truncate-doc"

RDEPENDS:${PN} += ""

inherit rpm
