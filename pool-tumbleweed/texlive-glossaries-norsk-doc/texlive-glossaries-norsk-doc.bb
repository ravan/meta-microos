SUMMARY = "Documentation for texlive-glossaries-norsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-norsk"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67141"

RPM_NAME = "texlive-glossaries-norsk-doc-2026.226.1.0svn67141-60.4.noarch.rpm"
RPM_HASH = "c4c3b0693cfbe4f874ed943d919879f1b0e42efdb0bb89c873d68e4f67c4264bfeee6b619cd92d55db7864f418f6760bbdeb116bf395541ecc6fbc3f6168022c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
