SUMMARY = "Documentation for texlive-pbalance"
DESCRIPTION = "This package includes the documentation for texlive-pbalance"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn67201"

RPM_NAME = "texlive-pbalance-doc-2026.226.1.4.0svn67201-58.2.noarch.rpm"
RPM_HASH = "eb5f705b6f8d67363947e06166fc4bc44f29fcb2a8aeb317bc72760a359c30bc747dd3c582793677754ac1575a229d473d405b98ca70a5a262feb29b37d162d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbalance-doc"

RDEPENDS:${PN} += ""

inherit rpm
