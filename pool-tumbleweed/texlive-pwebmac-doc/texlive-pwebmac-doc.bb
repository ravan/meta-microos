SUMMARY = "Documentation for texlive-pwebmac"
DESCRIPTION = "This package includes the documentation for texlive-pwebmac"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.5.1svn74648"

RPM_NAME = "texlive-pwebmac-doc-2026.226.5.1svn74648-60.4.noarch.rpm"
RPM_HASH = "fcdbd39caec815b129b1fc15fd0727745f389876356082f797e74bc93eb55fa02c0c187a981b886c09db325d0e5505b93cd75d65c2878992aa9c0dfc2bd4bce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pwebmac-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
