SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python313-tox-no-internet-0.1.0-2.5.noarch.rpm"
RPM_HASH = "9b5efe968ad3be7eaff31e17ebfb4704e478812453ad1ad3bd1b6dec8b2fe5929a013b1cec923b5ccc77aeff74574915267a92c12c0325077be1ae01ab214420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-no-internet \
python3.13dist-tox-no-internet \
python313-tox-no-internet \
python3dist-tox-no-internet"

RDEPENDS:${PN} += "python-abi \
python313-tox"

inherit rpm
