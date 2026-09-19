SUMMARY = "Documentation for texlive-syntrace"
DESCRIPTION = "This package includes the documentation for texlive-syntrace"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-syntrace-doc-2026.226.1.1svn15878-64.2.noarch.rpm"
RPM_HASH = "a03e36aefc24cce1e6916d3937a4d5e102656960e584317ae38f091df48e70d326ebcf3aa1c60980963ce701c50bb6472814083de41b3344d0aa818f00b0a407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntrace-doc"

RDEPENDS:${PN} += ""

inherit rpm
