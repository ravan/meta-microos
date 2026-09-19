SUMMARY = "Documentation HTML files for Racket"
DESCRIPTION = "A local installation of the Racket documentation system."
LICENSE = "Apache-2.0 | MIT"

PV = "9.1"

RPM_NAME = "racket-doc-9.1-1.6.noarch.rpm"
RPM_HASH = "8b49274f5c5f61304d882ca6dc4ea9990393c31b69f92a6ae0cd08153b0a342fb3abb91d6c2841a06e0ca4fc59dc0e47ffd9ae2dfab8154b8ebd7da0d1bebdbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "racket-/usr/share/doc/packages/racket/docindex.sqlite \
racket-doc"

RDEPENDS:${PN} += ""

inherit rpm
