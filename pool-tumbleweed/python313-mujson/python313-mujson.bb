SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python313-mujson-1.4-3.5.noarch.rpm"
RPM_HASH = "34ab5e5faeebec05353e8d002f8925eb161074f61a3320f6bc5f90322ef24d1b3aaa50a5c0b5acb192e465aba006272e8675047b2f25bbe0f06c405ce4593a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mujson \
python3.13dist-mujson \
python313-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
