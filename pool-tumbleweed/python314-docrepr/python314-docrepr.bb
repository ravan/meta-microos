SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-docrepr-0.2.0-2.5.noarch.rpm"
RPM_HASH = "00eb2120d2ec59e7266cca969b79337421b5eb7d293717041b0f83fbd9b68538f96d336ad2534fe7cd1ec35e50e676f0dea12d268fad4ca9af498118b30f52bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docrepr \
python314-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Sphinx \
python314-docutils"

inherit rpm
