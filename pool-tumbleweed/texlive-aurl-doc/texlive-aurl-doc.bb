SUMMARY = "Documentation for texlive-aurl"
DESCRIPTION = "This package includes the documentation for texlive-aurl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-aurl-doc-2026.226.svn75878-60.2.noarch.rpm"
RPM_HASH = "1864821b131ba2fcf7ca8f5b47946bc0fa5b2b4c4d717f90effadc580374e1b3f196a3405b7fa42f129dd88c72403ecd5b3ff28d07e343ee7f78e059d2fab42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
