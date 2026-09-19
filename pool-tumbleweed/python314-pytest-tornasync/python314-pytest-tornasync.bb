SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python314-pytest-tornasync-0.6.0.post2-3.5.noarch.rpm"
RPM_HASH = "3d4751c5556b4ff80b65e1e0e51e85ae9b08ce773824ecb8922c91f0a720db5d3d91b28efaa4caadcaca2668e3f10ec1a1c44d481339b598285812c940faeda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-tornasync \
python314-pytest-tornasync \
python3dist-pytest-tornasync"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-tornado"

inherit rpm
