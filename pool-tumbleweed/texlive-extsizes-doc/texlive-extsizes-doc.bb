SUMMARY = "Documentation for texlive-extsizes"
DESCRIPTION = "This package includes the documentation for texlive-extsizes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn78101"

RPM_NAME = "texlive-extsizes-doc-2026.226.1.4asvn78101-59.2.noarch.rpm"
RPM_HASH = "2b08b624d31ef16233925eb9ad65653ad410fb314c8e001c2da1d1b401de19b7ff7576441b1127e7c3ef4604d9e669c61091005b7af149122fa6253f92e24337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extsizes-doc"

RDEPENDS:${PN} += ""

inherit rpm
