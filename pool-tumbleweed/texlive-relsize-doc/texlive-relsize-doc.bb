SUMMARY = "Documentation for texlive-relsize"
DESCRIPTION = "This package includes the documentation for texlive-relsize"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.1svn77682"

RPM_NAME = "texlive-relsize-doc-2026.226.4.1svn77682-60.4.noarch.rpm"
RPM_HASH = "0c4100589a7a95385164c1d4ca8204bf52f4e7ab3f57dbdb444d2ac891422503d2dc17cfc045adb57e2960453fc4769fe5a37e959da9ad164677eb6e0403f74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
