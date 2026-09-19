SUMMARY = "Documentation for texlive-prtec"
DESCRIPTION = "This package includes the documentation for texlive-prtec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn76790"

RPM_NAME = "texlive-prtec-doc-2026.226.1.07svn76790-59.2.noarch.rpm"
RPM_HASH = "d49f5727542ec6f0016c31b6ec21889df389977c2fcac13244fe191107f8ed6a764b03db5dd27e84415497494c0641779c1f78b050b78c2548cc08854f73906b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prtec-doc"

RDEPENDS:${PN} += ""

inherit rpm
