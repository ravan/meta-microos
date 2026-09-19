SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.43.1"

RPM_NAME = "python313-pyOCD-0.43.1-1.4.noarch.rpm"
RPM_HASH = "b32c0db6efbc8b03790ed707b2b19d4a123a7bd9173765111fe5a32e7170358f67c0c4815dc38a70199625131e6778c53cdede91adcc2e400608556807484327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyOCD \
python3-pyocd \
python3.13dist-pyocd \
python313-pyOCD \
python313-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-usb \
update-alternatives"

inherit rpm
