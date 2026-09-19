SUMMARY = "Sphinx extension to build a 404 page with absolute URLs"
DESCRIPTION = "Create a custom 404 page with absolute URLs hardcoded. \
 \
Check out the full documentation at https://sphinx-notfound-page.readthedocs.io/"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-sphinx-notfound-page-1.1.0-2.2.noarch.rpm"
RPM_HASH = "1f4d945a5a73fc4f555cf4efb88526ac08dbe8f539eae1f882a90bf109add2c5bbb92ed84f1a9aeb7ab5c5200f8320a7e32b4a8eeb480a77e00cc5679c6bd367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-notfound-page \
python3.13dist-sphinx-notfound-page \
python313-sphinx-notfound-page \
python3dist-sphinx-notfound-page"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
