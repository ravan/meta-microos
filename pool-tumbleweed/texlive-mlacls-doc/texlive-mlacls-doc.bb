SUMMARY = "Documentation for texlive-mlacls"
DESCRIPTION = "This package includes the documentation for texlive-mlacls"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn72271"

RPM_NAME = "texlive-mlacls-doc-2026.226.1.1svn72271-61.2.noarch.rpm"
RPM_HASH = "12b7e024dfa7cab6928cce40b986288cc7f23ff1af14317dc3e72caf9f7968dbea24b4870418b239b916ed94543713bf5360ca67b0bdc6f6b88531f7da0cd065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlacls-doc"

RDEPENDS:${PN} += ""

inherit rpm
