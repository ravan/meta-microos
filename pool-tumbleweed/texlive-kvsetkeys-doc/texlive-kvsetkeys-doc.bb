SUMMARY = "Documentation for texlive-kvsetkeys"
DESCRIPTION = "This package includes the documentation for texlive-kvsetkeys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn77682"

RPM_NAME = "texlive-kvsetkeys-doc-2026.226.1.19svn77682-63.2.noarch.rpm"
RPM_HASH = "ca138b46d77ebeac2bea0050383929d1e0c776bb246d8bb8415a98ef97ddb93e243728af47a7b531a3266abd6f367dcebef1c880fb3e06999045905ab8c82d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kvsetkeys-doc-en \
texlive-kvsetkeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
