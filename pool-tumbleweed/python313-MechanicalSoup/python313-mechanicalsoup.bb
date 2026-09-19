SUMMARY = "A Python library for automating interaction with websites"
DESCRIPTION = "A Python library for automating interaction with websites. \
MechanicalSoup automatically stores and sends cookies, \
follows redirects, and can follow links and submit forms. \
It doesn't do Javascript. \
 \
The Mechanize library is incompatible with Python 3 and development \
is inactive. MechanicalSoup provides a similar API to it, built on \
Python giants Requests (for http sessions) and BeautifulSoup (for \
document navigation)."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-MechanicalSoup-1.4.0-2.4.noarch.rpm"
RPM_HASH = "30267e1c6c3d5db86bc9f77368d273213a7be9d24d1d41be131cf8464daa85755f5387df8aee881a3492dda295f347650aafb1541e16f054db9a0fdd2cec1623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MechanicalSoup \
python3.13dist-mechanicalsoup \
python313-MechanicalSoup \
python3dist-mechanicalsoup"

RDEPENDS:${PN} += "python-abi \
python313-beautifulsoup4 \
python313-certifi \
python313-lxml \
python313-requests \
python313-urllib3"

inherit rpm
