SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python313-sphinxcontrib-svg2pdfconverter-2.1.0-1.3.noarch.rpm"
RPM_HASH = "14f5f1b1e31772d0f0545102472e4d76ed303cae9fe60ed95a0aae9e6911bf504a9f7f307754268c8e57796461285638a6c439a066771fd9b1d00033196f3e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-svg2pdfconverter \
python3.13dist-sphinxcontrib-svg2pdfconverter \
python313-sphinxcontrib-svg2pdfconverter \
python3dist-sphinxcontrib-svg2pdfconverter"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
