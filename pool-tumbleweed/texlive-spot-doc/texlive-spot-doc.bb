SUMMARY = "Documentation for texlive-spot"
DESCRIPTION = "This package includes the documentation for texlive-spot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn22408"

RPM_NAME = "texlive-spot-doc-2026.226.1.1svn22408-64.2.noarch.rpm"
RPM_HASH = "2ad904de2a63808cf6620a9e93e48d8b03ab0ba9998ced5590c57350b2a6487655475a200f35c267509c864d39eff8ff7c1b99825fdc484a93e072a892ec89da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spot-doc"

RDEPENDS:${PN} += ""

inherit rpm
