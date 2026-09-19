SUMMARY = "Documentation for texlive-fn2end"
DESCRIPTION = "This package includes the documentation for texlive-fn2end"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-fn2end-doc-2026.226.1.1svn15878-60.2.noarch.rpm"
RPM_HASH = "0e7532c636645553ddd6962481fd718607f53b2924f9be5e68bf34db9fe7a065121700909d15266a635f50019836820f0fd8db8822a7dc91eaed87bbdf3f19a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fn2end-doc"

RDEPENDS:${PN} += ""

inherit rpm
