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

RPM_NAME = "python314-MechanicalSoup-1.4.0-2.4.noarch.rpm"
RPM_HASH = "16f60223bd10a4cd12fb1efbc746641786d8741310e0f325b5fe36c85c3cae3af353f54b87caa52fe62b3247e1a3df85839be049463e51ed237d58bdfec8fe2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mechanicalsoup \
python314-MechanicalSoup \
python3dist-mechanicalsoup"

RDEPENDS:${PN} += "python-abi \
python314-beautifulsoup4 \
python314-certifi \
python314-lxml \
python314-requests \
python314-urllib3"

inherit rpm
