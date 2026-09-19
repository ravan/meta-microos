SUMMARY = "Documentation for texlive-apnum"
DESCRIPTION = "This package includes the documentation for texlive-apnum"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.7svn47510"

RPM_NAME = "texlive-apnum-doc-2026.226.1.7svn47510-61.2.noarch.rpm"
RPM_HASH = "0299910e05cc335f7ea8cd89674faa80b70a0dcef4a3d532598c47c3c513eab6a0efe742562aafceda9f75dea9bbd1b5f14f1f4ec7a8dc68aeb28638b194b4bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
