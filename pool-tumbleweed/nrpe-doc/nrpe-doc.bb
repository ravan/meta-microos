SUMMARY = "Nagios Remote Plug-In Executor documentation"
DESCRIPTION = "This package contains the README files, OpenOffice and PDF \
documentation for the remote plugin executor (NRPE) for Nagios."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "nrpe-doc-4.1.1-1.14.noarch.rpm"
RPM_HASH = "c4ab9f9299a171ec785b86c6a8ff83c6acdcb6ed818eb5f7498fd31252e2d40156be06108337288441b0e05cc800016b1c51567286f2650cf66449b50b7f77b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-nrpe-doc \
nrpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
