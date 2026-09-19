SUMMARY = "Documentation for texlive-zhmetrics-uptex"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics-uptex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-doc-2026.226.1.0svn40728-59.4.noarch.rpm"
RPM_HASH = "0bd0c5035f43a9b2f8bca4cf115a28e28ac6c2a1b37f874352b635f2be3269c3fc32ed26d2707177d227804316be889ea4e9963d9697151a30703763b41d58d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-uptex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
