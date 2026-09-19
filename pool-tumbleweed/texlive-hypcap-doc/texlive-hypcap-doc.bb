SUMMARY = "Documentation for texlive-hypcap"
DESCRIPTION = "This package includes the documentation for texlive-hypcap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn77682"

RPM_NAME = "texlive-hypcap-doc-2026.226.1.13svn77682-60.2.noarch.rpm"
RPM_HASH = "5f43019dba10595a76809133b1195e71cacfbe306a014d1cec9aac2c7c747f142cc7c53bb96442c0f4e2d598936394d89b8bde1470db9a824c72818dded55ad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypcap-doc"

RDEPENDS:${PN} += ""

inherit rpm
