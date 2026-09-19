SUMMARY = "Documentation for girara-devel"
DESCRIPTION = "Doxygen generated documentations for girara-devel."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "girara-devel-doc-2026.07.18-1.2.noarch.rpm"
RPM_HASH = "b9acba8870de23e557ff57ccb95e43aeba2045c3094bc1bd2461a6238256fc233096661f30e0fc0632051766d6fc6daf9daf43bc4ddbdca16513b0589fb31bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "girara-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
