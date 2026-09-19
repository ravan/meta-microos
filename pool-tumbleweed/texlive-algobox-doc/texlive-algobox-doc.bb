SUMMARY = "Documentation for texlive-algobox"
DESCRIPTION = "This package includes the documentation for texlive-algobox"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn67201"

RPM_NAME = "texlive-algobox-doc-2026.226.1.3svn67201-61.2.noarch.rpm"
RPM_HASH = "357a1408a87332311af5bc1d6ed5933b48ab0c6300cc29e7ffe65ad8c519c9cd6dda55e2ac6721cce7d57a2f5376db4bb403505889da6be28edd1d8d1119e4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algobox-doc"

RDEPENDS:${PN} += ""

inherit rpm
