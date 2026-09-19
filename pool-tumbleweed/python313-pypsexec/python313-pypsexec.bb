SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-pypsexec-0.3.0-4.5.noarch.rpm"
RPM_HASH = "8c75ed98fc8a84016e21b500b6410844db80af350a30915c0b887754f4ce52eed11819f14f0c6cd22eac8fb9fbf1b2a0a16bd76c4276c8e1af2178a8f5c4bc1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypsexec \
python3.13dist-pypsexec \
python313-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python313-smbprotocol"

inherit rpm
