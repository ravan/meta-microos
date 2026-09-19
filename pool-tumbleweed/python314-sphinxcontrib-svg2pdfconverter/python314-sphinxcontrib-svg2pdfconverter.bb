SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python314-sphinxcontrib-svg2pdfconverter-2.1.0-1.3.noarch.rpm"
RPM_HASH = "de6cbbea3889f363124cd5770fba397718e66db879d8a461976f50dfa3eea36ada88e0cff7b766648fa6ae45e5d3d6b60f5db8d627e8e37da7a59679edab7390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-svg2pdfconverter \
python314-sphinxcontrib-svg2pdfconverter \
python3dist-sphinxcontrib-svg2pdfconverter"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
