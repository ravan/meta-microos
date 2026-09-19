SUMMARY = "Manual for saxon10"
DESCRIPTION = "Manual for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-manual-10.9-5.5.noarch.rpm"
RPM_HASH = "64ffe05e570b7971b15b900acc0cbf57a0aba2353cb3197be9e31a5e81e6a962bfe0577081db4e76cae11cae213f4b18c898c5bb8e3c60a7ac7a444da3770932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-manual"

RDEPENDS:${PN} += ""

inherit rpm
