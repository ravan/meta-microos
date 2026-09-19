SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python313-pytest-httpserver-1.1.3-1.4.noarch.rpm"
RPM_HASH = "14bab330ab57cf1e2cc67f6870255eac6d06c5da43c48b96e20b87b57cb71a5b74383cb9951e2cae4f6a43091a423d2e4783631458bd80aea10d88fb3abb7a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpserver \
python3.13dist-pytest-httpserver \
python313-pytest-httpserver \
python3dist-pytest-httpserver"

RDEPENDS:${PN} += "python-abi \
python313-Werkzeug \
python313-pytest"

inherit rpm
