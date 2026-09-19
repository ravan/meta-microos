SUMMARY = "Include a full table of contents in your Sphinx HTML sidebar"
DESCRIPTION = "sphinxcontrib-fulltoc is an extension for the Sphinx_ documentation \
system that changes the HTML output to include a more detailed table \
of contents in the sidebar. By default Sphinx only shows the local \
headers for the current page. With the extension installed, all of the \
page titles are included, and the local headers for the current page \
are also included in the appropriate place within the document."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "python313-sphinxcontrib-fulltoc-1.3-1.4.noarch.rpm"
RPM_HASH = "28e409bcb2ab936e753d4d3fb0fcf4ae76668d714c9b8e4d11b1f53b8a275c1ce57d884cf4c46394a1d483ca7e9897d526bdb1cf06db011056a8fb1308673e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-fulltoc \
python3.13dist-sphinxcontrib-fulltoc \
python313-sphinxcontrib-fulltoc \
python3dist-sphinxcontrib-fulltoc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
