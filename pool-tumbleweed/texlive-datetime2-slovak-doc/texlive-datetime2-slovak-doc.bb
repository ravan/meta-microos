SUMMARY = "Documentation for texlive-datetime2-slovak"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovak"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-doc-2026.226.1.1svn52281-59.2.noarch.rpm"
RPM_HASH = "42382740354e2fee98c1e6505c2de9a3b67cee9d4fb0cae389a68f9c3bc65b3c73ca98396447906804152430e99420f137da1a3b89ae802539ff2b0935c0a6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovak-doc"

RDEPENDS:${PN} += ""

inherit rpm
