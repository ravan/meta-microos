SUMMARY = "Function spies for Python unit tests"
DESCRIPTION = "kgb installs spies onto functions and methods, letting Python unit \
tests assert how and how often a function was called, transparently \
record or fake its behaviour, and inspect the arguments it received."
LICENSE = "MIT"

PV = "7.3"

RPM_NAME = "python314-kgb-7.3-1.2.noarch.rpm"
RPM_HASH = "db40065979572566e71c630e2cb7687870f4bc6de0fa776e72386db5064107b2d21e956f281e86e8cf8fb6b1a974767f62751f5764192548890d9e0025f31905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kgb \
python314-kgb \
python3dist-kgb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
