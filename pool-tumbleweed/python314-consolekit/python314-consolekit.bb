SUMMARY = "Additional utilities for click"
DESCRIPTION = "Additional utilities for click."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python314-consolekit-1.13.0-2.2.noarch.rpm"
RPM_HASH = "1b8c11f182b3cf7a537faaa8fb05d0d40ae79cc12faed7021f9f47e0c9fbf7a2e6776c3d6c3021610504d2cbd11f5a4280fe588fbb38b237210c4cd43d2826d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-consolekit \
python314-consolekit \
python3dist-consolekit"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-deprecation-alias \
python314-domdf-python-tools \
python314-mistletoe \
python314-typing-extensions"

inherit rpm
