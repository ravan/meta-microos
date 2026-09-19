SUMMARY = "Documentation for texlive-proposal"
DESCRIPTION = "This package includes the documentation for texlive-proposal"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn40538"

RPM_NAME = "texlive-proposal-doc-2026.226.svn40538-59.2.noarch.rpm"
RPM_HASH = "eb8682130230265c23d9bcbb95e2aa43c5e69afd028305fca23a40763f9d95b2e247dc8980f2152eb3c37b5ff0252141f2c99d956737542a9249cc12afa5a989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
