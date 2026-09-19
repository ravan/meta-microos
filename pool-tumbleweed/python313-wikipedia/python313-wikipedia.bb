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

RPM_NAME = "python313-wikipedia-1.4.0-5.5.noarch.rpm"
RPM_HASH = "ec9bc33fa0bd335adb2b06b1e6d47d511c1631c1fedc333ddc6ef0b76e23be3b851f98035d44989873135f2be6b8999560c5f1b180a4375d588766069e238ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wikipedia \
python3.13dist-wikipedia \
python313-wikipedia \
python3dist-wikipedia"

RDEPENDS:${PN} += "python-abi \
python313-beautifulsoup4 \
python313-requests"

inherit rpm
