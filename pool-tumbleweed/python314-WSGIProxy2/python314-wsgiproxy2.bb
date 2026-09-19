SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python314-WSGIProxy2-0.5.1-4.5.noarch.rpm"
RPM_HASH = "81a031411db963a2db90dbe5966a509dadcec07ec763c8892516fa605a61780eda8b769cb787f9beaf5459c5a44fc400ffb5564515156a3f43901c29e3dfd89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wsgiproxy2 \
python314-WSGIProxy2 \
python3dist-wsgiproxy2"

RDEPENDS:${PN} += "python-abi \
python314-WebOb \
python314-requests \
python314-urllib3"

inherit rpm
