SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0-only"

PV = "1.8.1"

RPM_NAME = "python313-pynput-1.8.1-1.5.noarch.rpm"
RPM_HASH = "cf0fb73e5a25c138af380fc12307d6b363ccb79d448f2332f89f54c7da1e0b2e34bcc816e93b2643509206c48a107c26c7bdf5581975688d857cc39c45b78be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynput \
python3.13dist-pynput \
python313-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python313-evdev \
python313-six"

inherit rpm
