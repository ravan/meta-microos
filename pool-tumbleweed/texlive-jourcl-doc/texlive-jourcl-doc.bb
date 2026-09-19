SUMMARY = "Documentation for texlive-jourcl"
DESCRIPTION = "This package includes the documentation for texlive-jourcl"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65290"

RPM_NAME = "texlive-jourcl-doc-2026.226.svn65290-63.2.noarch.rpm"
RPM_HASH = "cdb59d566982b42b0ba13d483c94ab75449e0a7107ffea73dae49184557b439c18ad09546de276d39a5705b7ecdab0ee46d2e14e4777854f9f4de41fa23c9b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jourcl-doc"

RDEPENDS:${PN} += ""

inherit rpm
