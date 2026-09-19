SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python314-pick-2.6.0-1.3.noarch.rpm"
RPM_HASH = "0f38303147b60fd17c3c5794f969e7d77fd9a72835c1ffa8b709bf818e5049a443d00a4db498d51e278978d6d22430ab2dc29a0b23791178249240988b3170b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pick \
python314-pick \
python3dist-pick"

RDEPENDS:${PN} += "python-abi"

inherit rpm
