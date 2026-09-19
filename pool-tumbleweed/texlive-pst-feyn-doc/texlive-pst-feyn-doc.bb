SUMMARY = "Documentation for texlive-pst-feyn"
DESCRIPTION = "This package includes the documentation for texlive-pst-feyn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn48781"

RPM_NAME = "texlive-pst-feyn-doc-2026.226.0.0.01svn48781-59.2.noarch.rpm"
RPM_HASH = "269fd82536f844e592a7219cb2c5cf8ad4617198be4c57dd2fa58779f4c2d49429b06b552324eb24d1f67944d127cca9e272b23114eef58e7b6814c8981a8bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-feyn-doc"

RDEPENDS:${PN} += ""

inherit rpm
