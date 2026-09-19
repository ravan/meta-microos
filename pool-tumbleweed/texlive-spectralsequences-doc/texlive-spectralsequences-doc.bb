SUMMARY = "Documentation for texlive-spectralsequences"
DESCRIPTION = "This package includes the documentation for texlive-spectralsequences"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-doc-2026.226.1.3.3svn65667-64.2.noarch.rpm"
RPM_HASH = "d8e2ba02c91f364a90b697adc66158b4eee16d006f9cbe08e2d4221981ff31c3fd77fc2edc5ad5ae2be610625806d8fe540e1f345fdcc67146322231301e4fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectralsequences-doc"

RDEPENDS:${PN} += ""

inherit rpm
