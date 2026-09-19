SUMMARY = "Documentation for texlive-babel-slovak"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovak"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-doc-2026.226.3.1asvn30292-60.2.noarch.rpm"
RPM_HASH = "4ab58a72333d5150ae8928bfd085c09bd3c5d2936e82422a16675898d2fcf48f5b1508ea15eee3b8f13360b27e53f96b7900b0701610691e97d00d8a37143a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovak-doc"

RDEPENDS:${PN} += ""

inherit rpm
