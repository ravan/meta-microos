SUMMARY = "Documentation for texlive-ionumbers"
DESCRIPTION = "This package includes the documentation for texlive-ionumbers"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3.3svn76924"

RPM_NAME = "texlive-ionumbers-doc-2026.226.0.0.3.3svn76924-63.2.noarch.rpm"
RPM_HASH = "9b27249d58560100ccd089c67a17553a8a78a3633d1901fd5036a0365f61f3af79761e2efa75ac60fd8bc72490e24ec8faced6b52f9e84053f0fa44fc93366dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ionumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
