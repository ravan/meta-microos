SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "python314-sphinxcontrib-fulltoc-1.3-1.4.noarch.rpm"
RPM_HASH = "53b52ed953bad9a9470636877d5fb65eba81f7e1b490f220c03f03c138a9b4483ea02b8970dff0689bb1f190528f66fdf84b6db2adf918d2039f565048547ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-fulltoc \
python314-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
