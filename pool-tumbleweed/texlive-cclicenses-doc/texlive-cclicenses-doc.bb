SUMMARY = "Documentation for texlive-cclicenses"
DESCRIPTION = "This package includes the documentation for texlive-cclicenses"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cclicenses-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "a4dd2ec075acfc1a85a595fb93d096ac97d37461623d0760010040fe0e07c571dc7ca54ebdd97daaa4b1c06ba6883a0eb8cae757899c0f7b88cac14d8c867d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cclicenses-doc"

RDEPENDS:${PN} += ""

inherit rpm
