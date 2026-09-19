SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python313-pick-2.6.0-1.3.noarch.rpm"
RPM_HASH = "e866ebabfa03869f132528aa457e95e25bdcc838829e94b48ad1dbd4f1a7593afda039414ae1aebe17f940d5d461acce9d31a22ab23923f62021943bf7f5d33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pick \
python3.13dist-pick \
python313-pick \
python3dist-pick"

RDEPENDS:${PN} += "python-abi"

inherit rpm
