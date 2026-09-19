SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python314-pytest-httpserver-1.1.3-1.4.noarch.rpm"
RPM_HASH = "f03373ff5cb63c6a4ab4017edaeca5d0faea49c9c9d37c1c099909fcbac31f84604893a7860c1f729ad9e99422f17cc81147e13ab9a93ba7fe7f1fe6d3f70958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-httpserver \
python314-pytest-httpserver \
python3dist-pytest-httpserver"

RDEPENDS:${PN} += "python-abi \
python314-Werkzeug \
python314-pytest"

inherit rpm
