SUMMARY = "Documentation for texlive-germbib"
DESCRIPTION = "This package includes the documentation for texlive-germbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-germbib-doc-2026.226.svn76790-60.2.noarch.rpm"
RPM_HASH = "3163fc44bf0ae914793a51b739a74621805e558526cdbf0e850fa344d83ef26124a19b7f2cf3a91a07f41ac1d1c7c512e4885a8c0dd9aafc60c0ad901af3806c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
