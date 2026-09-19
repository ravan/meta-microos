SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python314-mujson-1.4-3.5.noarch.rpm"
RPM_HASH = "8aef6d96b56a66fff552752b21a09d3fb2731fa0d87d5786bc2edff6f97c7b81087b379e4fd0e5890690d5264784b7107071e43526a4d6fa032481ccaf9b5c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mujson \
python314-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
