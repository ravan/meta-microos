SUMMARY = "Text-Based Document Generation"
DESCRIPTION = "AsciiDoc is a text document format for writing short documents, \
articles, books, and UNIX man pages. AsciiDoc files can be translated \
to HTML and DocBook markups using the asciidoc command."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.1"

RPM_NAME = "asciidoc-10.2.1-2.1.noarch.rpm"
RPM_HASH = "1069b2c6bcab7c423a7c0b907fa1f8d9ddfeb1e8a427f6c23ee4e424dfe6c5011fe793b83089c72a837b709a3cfcee959d3e6423adf9d9c6750bf34740689f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc \
python3.13dist-asciidoc \
python3dist-asciidoc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
docbook-xsl-stylesheets \
python-abi \
python3-xml"

inherit rpm
