SUMMARY = "Documentation for dynare in PDF format"
DESCRIPTION = "This package provides documentation for dynare in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "6.5"

RPM_NAME = "dynare-doc-pdf-6.5-1.7.noarch.rpm"
RPM_HASH = "23764937e00bb276f46b943792a9610ca9687ef2afdfcd785ca58d9710cd95fba5f29323c6b62b92879791fa33f74fb224b2efe2d29ac0a32af2b4fa759f7b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
