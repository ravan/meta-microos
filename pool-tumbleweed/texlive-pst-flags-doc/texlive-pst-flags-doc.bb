SUMMARY = "Documentation for texlive-pst-flags"
DESCRIPTION = "This package includes the documentation for texlive-pst-flags"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-pst-flags-doc-2026.226.svn76924-59.2.noarch.rpm"
RPM_HASH = "9d31aab5fce1f5dc5546b2038143cdf6584a560a33e048bf54f34077f1e59a726176d29adfb9d86f4db5cedbfbb8f361527b3e080ef1961cea3a1f25d3deca4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-flags-doc"

RDEPENDS:${PN} += ""

inherit rpm
