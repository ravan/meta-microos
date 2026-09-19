SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.36.0"

RPM_NAME = "python313-breathe-4.36.0-3.5.noarch.rpm"
RPM_HASH = "901a9326a940fbd874e17cc6a9c686af500cbd04a48f4af4a2b2d31d692e3d4da20f1723d51eef9cda5a914f82d44c71e349bf6b52fe2a037a82099bf0bd78d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-breathe \
python3-sphinxcontrib-breathe \
python3.13dist-breathe \
python313-breathe \
python313-sphinxcontrib-breathe \
python3dist-breathe"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Sphinx"

inherit rpm
