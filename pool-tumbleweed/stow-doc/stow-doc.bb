SUMMARY = "Documentation for GNU Stow"
DESCRIPTION = "Documentation for GNU Stow 2.4.1 in HTML and PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "stow-doc-2.4.1-1.10.noarch.rpm"
RPM_HASH = "6f5afa05c668550da40e80ccc3f7d0ddc8af60783edcce285d4616537e3959611a2c5c877a9a66d28521e8f0c46706500406d3ae23176cbb68b131b7c897968d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stow-doc"

RDEPENDS:${PN} += "stow"

inherit rpm
