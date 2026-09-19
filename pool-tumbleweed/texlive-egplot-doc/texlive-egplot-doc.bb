SUMMARY = "Documentation for texlive-egplot"
DESCRIPTION = "This package includes the documentation for texlive-egplot"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.02asvn20617"

RPM_NAME = "texlive-egplot-doc-2026.226.1.02asvn20617-61.4.noarch.rpm"
RPM_HASH = "7523d1c8fb0c349ec14de13f57aad86154197b8b7ffe13490ac32f64b2a1e7d49596d85ebdf91b0cba91a998562bac5a29381a266c22a9f3b2f31f93f41e876e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
