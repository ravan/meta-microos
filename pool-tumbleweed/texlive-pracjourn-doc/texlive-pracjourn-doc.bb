SUMMARY = "Documentation for texlive-pracjourn"
DESCRIPTION = "This package includes the documentation for texlive-pracjourn"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-doc-2026.226.0.0.4nsvn61719-59.2.noarch.rpm"
RPM_HASH = "d26125e39c1ba444c2170c0969bcfccda1aeff2b61d95b933cf7c0c03ae8030be6c747320413c20c6b62882190c05715b0b61648854c277daebe6f8a97b28e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pracjourn-doc"

RDEPENDS:${PN} += ""

inherit rpm
