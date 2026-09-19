SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-click-repl-0.3.0-3.2.noarch.rpm"
RPM_HASH = "400b09ddc3d9c3695f7b047816cb25579c76ae8024629ff9b14fe089df4df9cbcf9a8c8e65f20dab21b757a45abb772c497f92c457dafed44b4a2c2cbb0e90dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-repl \
python314-click-repl \
python3dist-click-repl"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-prompt-toolkit"

inherit rpm
