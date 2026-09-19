SUMMARY = "Documentation for texlive-temporal-logic"
DESCRIPTION = "This package includes the documentation for texlive-temporal-logic"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77281"

RPM_NAME = "texlive-temporal-logic-doc-2026.227.1.1svn77281-62.2.noarch.rpm"
RPM_HASH = "4890bd9ae79df58b39c5272d172d700734a0b094f70c2767204353d12303c6a900629a30cce98c0908ef589c1d0e1c7bf696382adc27f9428869b4eb9d7cfb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-temporal-logic-doc"

RDEPENDS:${PN} += ""

inherit rpm
