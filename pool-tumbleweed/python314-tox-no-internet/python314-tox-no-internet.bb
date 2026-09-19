SUMMARY = "Tox plugin to workaround no internet connection"
DESCRIPTION = "Workarounds for using tox with no internet connection."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-tox-no-internet-0.1.0-2.5.noarch.rpm"
RPM_HASH = "3c44f121c28c6120b67a969cdd751ec0061937076636b36865d69467c91e716c9c283b2d4e05c1fa1bdac96b4767e9c5bfcb8076c555b81b51ff43e5936c3fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tox-no-internet \
python314-tox-no-internet \
python3dist-tox-no-internet"

RDEPENDS:${PN} += "python-abi \
python314-tox"

inherit rpm
