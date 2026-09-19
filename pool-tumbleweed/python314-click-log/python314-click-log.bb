SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-click-log-0.4.0-2.5.noarch.rpm"
RPM_HASH = "d7b171cdef1201d627b67b658de845fb85a21411f2dd6a6addd925fa293d6dec4f9e0280e1c08b05e00cb54744a814ae39c4fc0bb524e89ec77e5816ab6db5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-log \
python314-click-log \
python3dist-click-log"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
