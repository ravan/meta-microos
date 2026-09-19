SUMMARY = "Wikipedia API for Python"
DESCRIPTION = "Wikipedia is a Python library that makes it easy to access and parse \
data from Wikipedia. \
 \
Search Wikipedia, get article summaries, get data like links and images \
from a page, and more. Wikipedia wraps the `MediaWiki \
API <https://www.mediawiki.org/wiki/API>`__ so you can focus on using \
Wikipedia data, not getting it."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-wikipedia-1.4.0-5.5.noarch.rpm"
RPM_HASH = "c36a5ed9df9574499e0ffe4321cd93ec79cc4a6287bc86de7db91d693a7a2b6989b505a07da3f895d3edfbe3063edae212e27c49f10c26685d83ad5b23e61301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wikipedia \
python314-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python314-beautifulsoup4 \
python314-requests"

inherit rpm
