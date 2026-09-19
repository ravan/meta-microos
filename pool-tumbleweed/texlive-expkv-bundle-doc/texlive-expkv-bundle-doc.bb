SUMMARY = "Documentation for texlive-expkv-bundle"
DESCRIPTION = "This package includes the documentation for texlive-expkv-bundle"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73212"

RPM_NAME = "texlive-expkv-bundle-doc-2026.226.svn73212-59.2.noarch.rpm"
RPM_HASH = "f54c203694bf4265434e62e84bb16dd4bc02321ce8857b173a33173e5681f2548889c8f882cfff54b13e11d13662a876e82e3c500b19489021094ba24ab987b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expkv-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
