SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-WSGIProxy2-0.5.1-4.5.noarch.rpm"
RPM_HASH = "45bdf6c6a609e205b5cb92757bea385caa3ed4376027bde70bdb84272cfffc6bc2b3f3c41db0c4b136a3ef314120c75f80929b8111c03df14e06e24ba39c78e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSGIProxy2 \
python3.13dist-wsgiproxy2 \
python313-WSGIProxy2 \
python3dist-wsgiproxy2"

RDEPENDS:${PN} += "python-abi \
python313-WebOb \
python313-requests \
python313-urllib3"

inherit rpm
